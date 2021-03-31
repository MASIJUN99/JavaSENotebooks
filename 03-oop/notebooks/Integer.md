# _Integer_ Class Source Code

The Integer class wraps a value of the primitive type int in an object.
An object of type Integer contains a single field whose type is int

In addition, this class provides several methods for converting an int
to a String and a String to an int, as well as other constants and methods
useful when dealing with an int.

> After reading the official notes, we have an entire view of `Integer`.

## Definition
```java
public final class Integer extends Number
        implements Comparable<Integer>, Constable, ConstantDesc {...}
```

The Integer class is a final class, means it could not be extended.

The Integer extends the Number class, the Number class is an abstract
class, Integer must implement the abstract method which in Number class.

Also, the Integer implements Comparable which T is Integer, Constable and
ConstantDesc.

> Before we understand the Constable and ConstantDesc, we need jump to
> the other article.
>
> [Optional](./Optional.md)

## Constructors





