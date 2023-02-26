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
both sides of the operator must be a `csv` and the result will always be a
`csv`.

```go
    var x, y, z csv
    a := 5
    2*x === y + a*z
```

#### Aliasing

Constraint system variables can have aliases. A constraint variable alias has
the type: `&csv`. The `&csv` type can be implicitly converted to the `csv`
type:

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
    var y &csv = 0  // or we can simply write y := 0
    for i := 0; i < n; i++ {
        y = y + x[i]
    }
    y === 0         // declares x[0] + x[1] + ... + x[n - 1] === 0 
```
