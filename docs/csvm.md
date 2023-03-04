## CSVM: The Constraint System Virtual Machine

The CSVM is a virtual machine tailored for declaring a system of
polynomial constraints and acts as an intermediate representation for
constraint systems. It is a stack machine and its operand stack only
stores constraint system variables, hence called the *csv stack*.

Besides the operand stack the CSVM has an internal memory. This internal
memory is used for storing the declared constraints, aliases, hints and
relations.

## Instruction Set

The CSVM has a very compact and simple instruction set. The CSVM instructions
may have zero or more constant `string` or `integer` operands, supplying
arguments or
data that are used by the operation. The CSVM does **not** support looping or 
conditional jumps.

### push

**Format:** `push i | push name | push name[i]`

**Description:** pushes a constraint system variable onto the csv stack. `i`
is an integer constant, and `name` is a string representing the name of a
constraint system variable.

**CSV Stack:**

```
...,
...,v <-
```

### add

**Format:** `add`

**Description:** pops two variables from the csv stack, and pushes a new
anonymous
variable onto the stack that represents their sum.

**CSV Stack:**

```
...,v1,v2 ->
...,v1+v2 <-
```

### sub

**Format:** `sub`

**Description:** pops two variables from the csv stack, and pushes a new
anonymous
variable onto the stack that represents their subtraction.

**CSV Stack:**

```
...,v1,v2 ->
...,v2-v1 <-
```

### mul

**Format:** `mul`

**Description:** pops two variables from the csv stack, and pushes a new
anonymous
variable onto the stack that represents their multiplication.

**CSV Stack:**

```
...,v1,v2 ->
...,v2*v1 <-
```

### alias

**Format:** `alias name`

**Description:** pops one variable from the csv stack, and assigns `name` as
an alias for it. It does not push anything onto the csv stack.

**CSV Stack:**

```
...,v ->
...,
```

### eq

**Format:** `eq`

**Description:** pops two variables `v1`, `v2` from the csv stack, and
defines an
equality constraint `v1 === v2` between them. It does not push anything onto
the csv stack.

**CSV Stack:**

```
...,v1,v2 ->
...,
```

### def_rel

**Format:** `def_rel r<m,n>`

**Description:** defines the relation `r` with `m` inputs and `n` outputs, and
stores it in the internal memory.
Pops variables `v1,v2,...,vm` and `u1,u2,...,un` from the csv stack and
defines the relation `r` with `v1,v2,...,vm` as
inputs and `u1,u2,...,un` as outputs. Until the next `end_def` instruction, all
declared constraints will be considered inside the relation `r`.

**CSV Stack:**

```
...,u1,u2,...,un,v1,v2,...,vm, ->
...,
```

### end_def

**Format:** `end_def`

**Description:** ends the declaration of the last relation.

**CSV Stack:**

```
...,
...,
```

### call_rel

**Format:** `call_rel r`

**Description:** calls relation `r` from the internal memory. If `r`
has `m` inputs and `n` outputs, `call_rel` pops `m`
variables `v1,v2,...,vm` from the csv stack, and pushes `n` **anonymous**
variables onto the csv stack, representing the outputs of
the relation: `(u1, u2, ..., un) = r(v1, v2, ..., vn)`.
(We gave the anonymous variables some names `u1,u2,....,un` for clarity, but
they don't have any name)

**CSV Stack:**

```
...,v1,v2,...,vm ->
...,u1,u2,...,un <-
```

### call_hint

**Format:** `call_hint h`

**Description:** associates the hint `h` from the internal memory with 
variables. If `h` has `m` 
inputs and `n` outputs, `call_hint` pops `m+n` 
variables `v1,v2,...,vm` and `w1,w2,...,wn` from the csv stack,
and registers `h(v1,v2, ..., vm)` as a hint for `w1,w2,...,wn`.

**CSV Stack:**

```
...,w1,w2,...,wn,v1,v2,...,vm ->
...,
```

## Examples
#### Declaring a simple equality constraint:

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
