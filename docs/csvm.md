### CSVM: Constraint System Virtual Machine

The CSVM is a virtual machine tailored for declaring a system of
polynomial constraints and acts as an intermediate representation for
constraint systems. It is a stack machine and its operand stack only
stores constraint system variables, hence called the csv stack.

Besides the operand stack the CSVM has an internal memory. This internal
memory is used for storing the declared constraints, aliases, hints and
relations. The CSVM has a very compact and simple instruction set.

### Instructions

### push

**Format:** `push csv`

Pushes `csv` onto the csv stack. `csv` can be an integer constant or the
name of a constraint system variable.

**CSV Stack:**

```
...,
...,csv <-
```

### add

**Format:** `add`

Pops two variables from the csv stack, and pushes a new anonymous
variable onto the stack that represents their sum.

**CSV Stack:**

```
...,v1,v2 ->
...,v1+v2 <-
```

### sub

**Format:** `sub`

Pops two variables from the csv stack, and pushes a new anonymous
variable onto the stack that represents their subtraction.

**CSV Stack:**

```
...,v1,v2 ->
...,v2-v1 <-
```

### mul

**Format:** `mul`

Pops two variables from the csv stack, and pushes a new anonymous
variable onto the stack that represents their multiplication.

**CSV Stack:**

```
...,v1,v2 ->
...,v2*v1 <-
```

### alias

**Format:** `alias name`

Pops the csv stack, and assigns `name` as an alias for it. It
does not push anything onto the csv stack.

**CSV Stack:**

```
...,v ->
...,
```

### eq

**Format:** `eq`

Pops two variables `v1`, `v2` from the csv stack, and defines the
equality constraint `v1 === v2` between them. It does not push anything onto
the csv stack.

**CSV Stack:**

```
...,v1,v2 ->
...,
```

### call_rel

**Format:** `call_rel r`

If `r` has `m` inputs and `n` outputs, `call_rel` pops `m`
variables `v1,v2,...,vm` from the csv stack, and pushes `n` **anonymous**
variables
onto the csv stack, such that: `(u1, u2, ..., un) = r(v1, v2, ..., vn)`. (We
gave the anonymous variable names `u1,u2,....,un` for clarity, while they don't
have a name)

**CSV Stack:**

```
...,v1,v2,...,vm ->
...,u1,u2,...,un <-
```

### def_rel

**Format:** `def_rel r`

Pops constant integers `m` and `n` and variables `v1,v2,...,vm` and
`u1,u2,...,un` from the csv stack and defines the relation `r` 
with `v1,v2,...,vm` as
inputs and `u1,u2,...,un` as outputs. Until the next `end_def` instruction all 
declared constraints will be considered inside the relation `r`.

**CSV Stack:**

```
...,u1,u2,...,un,v1,v2,...,vm,n,m ->
...,
```

### end_def

**Format:** `end_def`

Ends the declaration of the last relation.

**CSV Stack:**

```
...,
...,
```

### call_hint

**Format:** `call_hint h`

If `h` has `m` inputs and `n` outputs, `call_hint` Pops `m+n` variables `v1,
v2,...,vm` and `w1,w2,...,wn` from the csv stack, 
and registers `h(v1,v2, ..., vm)` as a hint for `w1,w2,...,wn`.

**CSV Stack:**

```
...,w1,w2,...,wn,v1,v2,...,vm ->
...,
```

## Examples

```
    // x * (y + z) === w*w
    push x
    push y
    push z
    add
    mul
    push w
    push w
    mul
    eq
```
