# CsGo: A Language for Declaring Constraint Systems Using Go Programs

The CsGo language augments the normal syntax of the Go programming language to
enable easy declaration of polynomial constraint systems* using Go programs.
A CsGo program is essentially a Go program that declares a system of
polynomial constraints when is executed. The exact definition
of the constraint system may be decided at runtime, depending on the program
inputs.

Every Go program is a CsGo program. Even a Go program that knows nothing of
the CsGo language, is technically a CsGo program that declares an empty
system of constraints.

CsGo aims to provide a convenient, yet flexible and low level way for
declaring polynomial constraint systems. It does **not**
intend to be an automatic tool for converting a conventional program to a
constraint system. Therefore, it intentionally exposes low level
properties of the underlying constraint system to the programmer.

- *Here, by a polynomial constraint system, we mean a set of equality
  constraints of the form `P(x_1, x_2, ..., x_n) == 0`, where `P` is a
  multivariate
  polynomial defined on a finite field.*

## CSVM as an Intermediate Representation

The [CSVM](https://github.com/aybehrouz/csgo/blob/main/docs/csvm.md) is a
virtual machine tailored for declaring polynomial
constraint systems. When a CsGo program is executed, it generates a CSVM
code; when this code is executed by the CSVM, it declares the intended
constraint system. In other words, the CSVM code acts as an intermediate
representation (IR) of the constraint system, and CsGo programs declare the
constraint system by executing
[CSVM instructions](https://github.com/aybehrouz/csgo/blob/main/docs/csvm.md#instruction-set).

## Programming Concepts

The CsGo language adds a few programming concepts to a normal Go program to
facilitate declaration of polynomial constraint systems.

### Constraint System Variables

#### Declaration

CsGo adds a new type to Go's basic types: the `csv` type, which represents a
variable in a polynomial constraint system defined on a finite field. A `csv` is
declared like a normal Go variable:

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

When an integer is converted to a `csv`, it acts as a constant in the
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
and rhs, which both must be `csv` or `&csv` (See [Aliasing](intro.md#aliasing)),
are equal.

```go
    var x, y csv
    x === 10
    x === y
```

Multiplication `*` and addition `+,-` operators are defined for the `csv` and
`&csv` type;
they perform multiplication and addition (subtraction) modulus some prime 
number which is known only at runtime.
The operands must be `csv` or `&csv`, and the result will always be a `csv`.

```go
    var x, y, z csv
    a := 5
    2*x === y + a*z
```

#### Aliasing

Constraint system variables can have aliases. An alias of a `csv` has the type:
`&csv`. The operators `+`,`-`,`*` and `===` can
operate on the `&csv` type, the same way they operate on the `csv` type:
(**We do not allow the implicit conversion of `&csv` to `csv`, because that
will become problematic for hints.*)

```go
    var x, y csv
    var z &csv = x  // z is an alias for x
    y*y === z + 2   // same as y*y === x + 2
```

Aliases can also be defined for anonymous temporary variables:

```go
    var x, y csv
    w := 2*x + y    
```

In this example `+` creates a temporary variable `t`, and defines: `t ===
2*x + y`, then `w` becomes an alias for `t`. This extends the lifetime of `t`.

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
    x + 2*y === z
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

More precisely, in CsGo, a relation with `n` inputs and `m` outputs is a
subset of the cartesian product of the set of n-tuples and the set of
m-tuples of the `csv` type, where we define the set of 0-tuples as a set with
exactly one element: `{()}`.

A relation also takes zero or more *template* variables. Template variables
are used for dynamic constraint declaration at runtime.

Informally, a relation can be declared using a syntax like this:

```go
rel name<template variables list>(input) (output) {
    // body
}
```

The type of all the inputs and outputs is always `csv`, and therefore
there is no need for annotating their type. Template variables can not be of
type `csv` or `&csv`. The return values are always named and the return
statement will be without arguments:

```go
rel example<n int, flag bool>(x , y) (z, w) {
    return
}
```

As we mentioned, template variables are used for dynamic constraint
declaration:

```go
rel addMul<wantAdd bool>(x , y) z {
    if wantAdd {
        z === x + y
    } else {
        z === x * y
    }
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
    // same as:
    // a === b
``` 

When a relation is called, the outputs of the relation are created as
temporary anonymous variables in the caller's scope. The caller can use
these variables by defining aliases or constraints for them:

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
    // same as:
    // c === a + b
    // d === a - b
    
    r(a, b) === (1, 2)
    // same as:
    // 1 === a + b
    // 2 === a - b
```

In practice, relations are usually used to represent circuit components, and
they usually define a function.

Alternatively, instead of the `rel` keyword,
the `comp` keyword, which stands for *component*, can also be used for
declaring a relation:

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
automatic solver with an algorithm which can be used for solving the constraint
system more efficiently.

Since hints are essentially algorithms, in CsGo they are similar to
conventional Go functions. However, to facilitate their usage, they have a
special syntax:

```go
hint name<template variables list>(input) (output) {
    // body
}
```

For example:

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
but there are some important semantic differences: When the hint
is called, the passed inputs and outputs must be `csv`. However, inside the
implementation body of the hint, inputs are `big.Int` and outputs are `big.
Int*`. That's because a `csv` is *unpacked* inside a hint function and
the value of inputs can be read, and the value of outputs can be modified.
Note that inputs are passed by value and modifying them has no effect.

Calling and using a hint has a special syntax:

```go
    var x1, x2, x3 csv
    var y []csv
    h1(x1, x2) -> x3
    h2<10>(x1, x2) -> (x3, y)
```

A hint does not return a newly created variable, and it only modifies
existing variables that are passed as output. That's because a hint provides a
witness for an existing
constraint system variable, that should have been constrained outside the hint
function.

### Annotations

Consider the following Go's statement:

```go
func f(x int) bool {
    // body
}
```

This statement essentially declares a *contract* for a function. This
contract states that the function `f` takes one parameter of type `int`, and
returns a value of type `bool`. This contract is
*enforced* by the Go's compiler at compile time, and can never be broken. That
means, no matter how the function is called, inside the body of the function,
`x` will be an `int`, and no matter how the function is implemented, the
caller of the function `f` will get a `bool` as the return value.

Having similar typed signatures for CsGo's relations seems an appealing idea.
However, unfortunately, because of the nature of constraint systems, the CsGo's
compiler would not be able to enforce such a contract at compile time.
Enforcing it at runtime would also be complex and would introduce extra
constraints that may not be always desirable.

While typed signatures can not be fully enforced by the CsGo's compiler, they
still can record important information about a programmer's intentions and
could be used by the compiler to produce helpful warnings that may prevent
dangerous programming errors.

The CsGo language uses the concept of annotations to add more specific type
information to declarations. Annotations are optional and can be used for
declaring some sort of *soft* contracts: a contract that will not be
enforced by the
compiler, but may be used for generating warnings or documenting useful
information. All annotations start with the `@` symbol, and can be from
different *categories*. The `type` category may be used for adding extra type
information to a relation or variable declaration:

```go
rel addInt64<wrapping bool>(a, b) c 
@type: a, b, c int64 {
    // body
}
```

```go
    var x csv
    var y csv @type: int32
    var z, w csv @type: bool, int
```

Note that all annotations are **optional** and may be omitted.

## Proofs of Membership

...

## Examples

### Partition Selector

`StepMask` generates a step like function into an output array of length
`outputLen`, such that its first `stepPosition` elements are equal to
`startValue` and the remaining elements are equal to `endValue`:

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

Now we use `StepMask` to write the `Partition` relation, which selects
left or right side of an `input` array, with respect to `pivotPosition`.

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

