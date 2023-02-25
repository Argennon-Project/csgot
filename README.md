## CsGo: A Language for Declaring Constraint Systems Using Go Programs

The CsGo language augments the normal syntax of the Go programming language to
enable easy declaration of polynomial constraint systems using Go programs. 
A CsGo program is essentially a Go program that declares a polynomial constraint
system when is executed. The exact definition of the constraint system is 
decided at runtime depending on the program inputs.

### Constraint system variables

CsGo adds a new type to Go's basic types: the `csv` type, which represents a 
variable in a constraint system. A `csv` is declared like a normal Go variable:

```go
    var x csv
```

A constraint system variable can not be assigned :

```go
    var x csv
    x = 10    // compilation error
    y := x    // compilation error
```

```Go
func
```