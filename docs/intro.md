## CsGo: A Language for Declaring Constraint Systems Using Go Programs

The CsGo language augments the normal syntax of the Go programming language to
enable easy declaration of constraint systems using Go programs.
A CsGo program is essentially a Go program that declares a system of
polynomial constraints when is executed. The exact definition of the
constraint system may be decided at runtime depending on the program inputs.

### Constraint System Variables

#### Declaration

CsGo adds a new type to Go's basic types: the `csv` type, which represents a
variable in a constraint system. A `csv` is declared like a normal Go variable:

```go
    var x csv
    var a [10]csv
    var s []csv
```

All integer types can be implicitly converted to a `csv`. No other
type can be converted to a `csv`, and a `csv` can not be converted to any type.

#### Operators

The assignment operator `=` is not defined for constraint system variables
and a `csv` can not be assigned :

```go
    var x, y csv
    x = 10        // compilation error
    y = x         // compilation error
    var z csv = x // compilation error
```

In CsGo, constraints are defined by the variable equality operator `===`.
The equality operator defines an equation and asserts that its lhs and rhs,
which both must be of the `csv` type, are equal.

```go
    var x, y csv
    x === 10
    x === y
```

Multiplication `*` and addition `+` operators are defined for the `csv` type;
they perform multiplication and addition modulus some prime number, that is
known only at runtime.
Both sides of the operator must be a `csv` and the result will always be a
`csv`.

```go
    var x, y, z csv
    a := 5
    2*x === y + a*z
```

#### Aliasing

Constraint system variables can have aliases. A constraint variable alias has
the type: `&csv`. The operators `+`,`*` and `===` can operate on the `&csv`
type the same way they operate on the `csv` type:

```go
    var x, y csv
    var z &csv = x
    y*y === z + 2     // is equevalent to y*y === x + 2
```

Aliases can also be defined for anonymous temporary variables:

```go
    var x, y csv
    w := 2*x + y    // w is an alias for the temprory varialbe that holds 2*x + y
```

An alias is a mutable type and can be mutated by the `=` operator:

```go
    y := x    // declares y as an alias for x
    y = y + z // updates y to be an alias for x + z
    y = y + w // updates y to be an alias for x + z + w
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
where one input may correspond to multiple outputs. As an example, assume
the following constraint:

```go
    z === x + 2*y
```

Obviously `z` is a function of `x` and `y`. However, `x` and `y` are not a
function of `z`, while they are still somehow related.

In CsGo a relation is a piece of code that has some inputs and some outputs.
All the inputs and outputs must be of type `csv` (`&csv` is not allowed).
It defines a *relation* between its input and output, by declaring a system of
constraints between them. Sometimes the defined constraints may be
restrictive enough to make the relation a function, but that is not necessary.

More precisely, a relation with `n` inputs and `m` outputs in CsGo is a
subset of the cartesian product of the set of n-tuples and the set of
m-tuples of the `csv` type, where we define the set of 0-tuples as a set with
exactly one element: `{()}`.

A relation can also takes zero or more *template* variables. Template variables
can not be of type `csv` or `&csv`, and are used for flexible constraint
generation at runtime.

Informally relation declaration has the following format:

```go
rel name<template variables>(input) (output) {
    // body
}
```

All the inputs and outputs are always of the `csv` type, and therefore
there is no need for annotating their type. The return values are always
named and the return statement will be without arguments:

```go
rel linear<n int, flag bool>(x , y) (z, w) {
    // body
    return
}
```

Inputs and outputs can be arrays or slices:

```go
rel r(x[], y[5], z) w[] {
    // body
}
```

In practice, relations are usually used to represent circuit components.
Alternatively, instead of the `rel` keyword, `comp` keyword can also be used
for declaring a relation.

Calling a relation is similar to a function. When a relation is called, it
always creates its output csv variables as temporary variables. If we want
to use them we need to define an alias for them:

```go
    var res &csv
    res = r(x, y)
```

### Hints

Automatically solving a system of constraints can be a difficult task
sometimes. Hints are a tool that enables a programmer to hint at an
algorithm that solves the
constraint system efficiently.

Usually a constraint system which defines a function or relation with fewer
constraints is also harder to solve. That makes hints a very
important tool in creating compact representations for functions and relations.

Since hints are essentially algorithms, in CsGo a hint is represented by a
program function. The declaration of hints is very similar to relations:

```go
hint h1(x, y) z {
    // body
}

hint h2<n int>(x, y) (z, w[]) {
    // body
}
```

There is only one important difference: while the inputs and outputs of a
hint must be `csv` when the hint is called, the type of them is `big.Int`
inside the declaration and body of the hint. That's because a `csv` is
*unpacked* inside a hint function and
its value can be read or even modified, if the variable is an output. It
should be noted that the value of input variables can not be modified.

There is a special syntax for calling and using a hint:

```go
    var x1, x2, x3 csv
    var y []csv
    h1(x1, x2) -> x3
    h2<10>(x1, x2) -> (x3, y)
```

