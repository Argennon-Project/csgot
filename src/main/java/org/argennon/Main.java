package org.argennon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/*

constraint variable alias has a
different type: `&csv`. However, the `&csv`
type can be implicitly converted to the `csv` type:

```go
    var x, y csv
    var z &csv = x*x + 1
    y === z     // is equevalent to y === x*x + 1
```

The `:==` operator also assigns always creates a new variable and
declares an equality constraint
between the newly created variable and the rhs. If the identifier is already
defined, it will be shadowed and can not be accessed anymore.

```go
    y := 2*x + z
```

is equivalent to:

```go
    var y csv
    y === 2*x + z
```

However, because of the shadowing rule, `:=` can not be always replaced with
`===`:

```go
    y := x      // declares y === x
    y := y + z  // declares y === x + z
    y := y + w  // declares y === x + z + w
```

The shortened variable declarator can be used in a loop:

```
    for i := 0; i < 10; i++ {
        y := y + x[i]
    }
```
 */