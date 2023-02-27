## CsGo: A Language for Declaring Constraint Systems Using Go Programs

The CsGo language augments the normal syntax of the Go programming language to
enable easy declaration of polynomial constraint systems using Go programs.
A CsGo program is essentially a Go program that declares a system of
polynomial constraints when is executed. The exact definition
of the constraint system may be decided at runtime, depending on the program
inputs.

Every Go program is a CsGo program. Even a Go program that knows nothing of
the CsGo language, is technically a CsGo program that declares an empty
system of constraints.

CsGo aims to provide a convenient, yet flexible and low level way for
declaring polynomial constraint systems. It does **not**
intend to be a high level language for converting conventional programs to
constraint systems. Therefore, it intentionally exposes low level
properties of the underlying constraint system to the programmer.

### Constraint System Variables

#### Declaration

CsGo adds a new type to Go's basic types: the `csv` type, which represents a
variable in a constraint system. A `csv` is declared like a normal Go variable:

```go
    var x csv
    var a [10]csv
    var s []csv
```

A `csv` can not be declared as the argument or the return value of a normal Go
function:

```go
func f(x csv) {}    // compilation error

func g() csv {      // compilation error
    // body
}
```

#### Conversions

An integer type can be implicitly converted to a `csv`. No other
type can be converted to a `csv`, and a `csv` can not be converted to any type.

When an integer is converted to a `csv`, it will act as a constant in the
constraint system.

#### Operators

The assignment operator `=` is not defined for the `csv` type and constraint
system variables can not be assigned:

```go
    var x, y csv
    x = 10        // compilation error
    y = x         // compilation error
    var z csv = x // compilation error
```

In CsGo, constraints are defined by the variable equality operator `===`.
The equality operator defines a mathematical equation, and asserts that its lhs
and rhs, which both must be `csv` or `&csv` (See [Aliases](intro.md#aliasing)),
are equal.

```go
    var x, y csv
    x === 10
    x === y
```

Multiplication `*` and addition `+` operators are defined for the `csv` and
`&csv` type;
they perform multiplication and addition modulus some prime number, that is
known only at runtime.
The operands must be `csv` or `&csv`, and the result will always be a `csv`.

```go
    var x, y, z csv
    a := 5
    2*x === y + a*z
```

#### Aliasing

Constraint system variables can have aliases. An alias of a `csv` has the type:
`&csv`. The operators `+`,`*` and `===` can
operate on the `&csv` type, the same way they operate on the `csv` type:
(*We do not allow the implicit conversion of `&csv` to `csv`, because that
will become problematic for hints.*)

```go
    var x, y csv
    var z &csv = x
    y*y === z + 2   // is equevalent to y*y === x + 2
```

Aliases can also be defined for anonymous temporary variables:

```go
    var x, y csv
    w := 2*x + y    // w is an alias for the temprory varialbe that holds 2*x + y
```

An alias is a mutable type and can be mutated by the `=` operator:

```go
    y := x      // declares y as an alias for x
    y = y + z   // updates y to be an alias for x + z
    y = y + w   // updates y to be an alias for x + z + w
```

Aliasing can simplify declaration of complex constraints:

```go
    var y &csv      // or we can write y := 0
    for i := 0; i < n; i++ {
        y = y + x[i]
    }
    y === 0         // declares x[0] + x[1] + ... + x[n-1] === 0 
```

### Relations

In mathematics, relations can be thought of as a generalization for functions,
where one input may correspond to multiple outputs. Assume the following
constraint:

```go
    z === x + 2*y
```

Obviously `z` is a function of `x` and `y`, but `x` and `y` are not
a function of `z`. However, this constraint defines a relation from the
set of singletons (1-tuples) like `z` to
the set of the ordered pairs like `(x,y)`.

In CsGo a relation is a piece of code that has some inputs and some outputs.
All the inputs and outputs must be of type `csv` (`&csv` is not allowed),
and it defines a *relation* between its input and output, by declaring a
system of constraints between them. Sometimes the defined constraints may be
restrictive enough to make the relation a function, but that is not necessary.

More precisely, a relation with `n` inputs and `m` outputs in CsGo is a
subset of the cartesian product of the set of n-tuples and the set of
m-tuples of the `csv` type, where we define the set of 0-tuples as a set with
exactly one element: `{()}`.

A relation also takes zero or more *template* variables. Template variables
can not be of type `csv` or `&csv`. Template variables are used for dynamic
constraint generation at runtime.

Informally relation declaration has a format like this:

```go
rel name<template variables>(input) (output) {
    // body
}
```

All the inputs and outputs are always of the `csv` type, and therefore
there is no need for annotating their type. Template variables can not be of
type `csv` or `&csv`. The return values are always named and the return
statement will be without arguments:

```go
rel linear<n int, flag bool>(x , y) (z, w) {
    return
}
```

Inputs and outputs can be arrays or slices:

```go
rel r(x[], y[5], z) w[] {
    // body
}
```

Like functions, relations can be called. Calling a relation is similar to
calling a function.

The inputs of a relation are always passed by reference. That
means any constraint defined inside the relation involving inputs can be
*felt* by the caller. For example consider the following relation
declaration:

```go
rel r(x, y) {
    y === x
    retrun
}
```

```go
    var a, b csv
    r(a, b)     
    // is equavalent to:
    // a === b
```

When a relation is called, the outputs of the relation are created as
temporary anonymous variables in the caller's scope. The caller can use
these variables by defining aliases for them:

```go
rel r(x, y) (z, w) {
    z === x + y
    w === x - y
    retrun
}
```

```go
    var a, b csv
    var c, d &csv
    (c, d) = r(a, b) 
    // is equavalent to:
    // c === a + b
    // d === a - b
```

always creates its output csv variables as temporary variables. If we want
to use them we need to define an alias for them:
The inputs of a relation are passed by reference.

In practice, relations are usually used to represent circuit components.
Alternatively, instead of the `rel` keyword, `comp` keyword can also be used
for declaring a relation:

```go
comp r(x, y) z {
    z === x + y
    retrun
}
```

### Hints

Automatically solving a system of constraints can be a difficult task, and
compact constraint systems which represent relations using fewer constraints,
are usually harder to solve.
Hints are a tool that enables a programmer to provide the
automatic solver with an algorithm that solves the constraint system
efficiently.

Since hints are essentially algorithms, in CsGo they are similar to
conventional Go functions. However, to facilitate their usage, they have a
special syntax:

```go
hint h1(x, y) z {
    // body
}
```

```go
hint h2<n int>(x, y) (z, w[]) {
    // body
}
```

The declaration syntax of hints resembles the declaration syntax of relations,
but there are some important semantic differences: while the inputs and
outputs of a hint must be `csv` when the hint
is called, inside the declaration and body
of the hint, inputs are `big.Int` and outputs are `big.Int*`. That's because
a `csv` is *unpacked* inside a hint function and
the value of inputs can be read, and the value of outputs can be modified.
Note that inputs are passed by value and modifying them has no effect.

There is a special syntax for calling and using a hint:

```go
    var x1, x2, x3 csv
    var y []csv
    h1(x1, x2) -> x3
    h2<10>(x1, x2) -> (x3, y)
```

A hint does not return a newly created variable, and can only modify an
existing variable. That's because a hint provides a witness for an existing
constraints system variable, which should be constrained outside the hint
function.

### Annotations

### Proofs of Membership

...

### Examples

#### Partition Selector

`StepMask` generates a step like function into an output array of length
`outputLen`,
such that its first `stepPosition` elements are equal to `startValue` and the
remaining elements are equal to `endValue`:

```go
rel StepMask<outputLen int>(stepPosition, startValue, endValue) out[] {
    if outputLen < 2 {
        panic("output len must be >= 2")
    }
    // get the output as a hint
    stepOutputHint<outputLen>(stepPosition, startValue, endValue) -> out

    // add boundary constraints
    out[0] === startValue
    out[len(out)-1] === endValue

    // add constraints for the correct form of a step function that steps at the stepPosition
    for i := 1; i < len(out); i++ {
        (out[i] - out[i-1]) * (i - stepPosition) === 0
    }
    return
}
```

Now we use `StepMask` to right the `Partition` relation, which selects left or
right side of the `input` array, with respect to the `pivotPosition`.

```go
rel Partition<rightSide bool>(pivotPosition, input[]) out[] {
    out = make([]csv, len(input))
    var mask []&csv
    
    if rightSide {
        mask = StepMask<len(input)>(pivotPosition, 0, 1)
    } else {
        mask = StepMask<len(input)>(pivotPosition, 1, 0)
    }
    
    for i := 0; i < len(out); i++ {
        out[i] === mask[i] * input[i]
    }
    return
}

