# *Number* Class Source Code

As an abstract class, it is the SuperClass of BigDecimal, BigInteger, Byte,
Double, Float, Integer, Long and Short.

So the class above must to implements the method in Number.

## Definition

```java
public abstract class Number implements java.io.Serializable {...}
```

The Number class is an abstract class and implement the Serializable.

> There was a problem: what is Serializable?
> 
> In my view, the class which implements the Serializable Interface is mean
> this class could be serializable.
> 
> Seems it is a crap, actually it means literally.
> 
> Sometime we need store our data or transfer out data, the serializable data
> is more convenient for us to do that. That's all.
> 
> This is reason why we usually make the domain class implements the Serializable.

### Constructor

```java
public Number() {super();}
```

You will see the `Number` class has no extends, but what we `super()`?

actually, In java we default think it extends the `java.lang.Object`

### method

```java
public abstract int intValue();
public abstract long longValue();
public abstract float floatValue();
public abstract double doubleValue();
public byte byteValue() {
        return (byte)intValue();
        }
public short shortValue() {
        return (short)intValue();
        }
```

`Number` class gives the *template* to subclass to implement.

Actually, it just to return different type of data.

> There was a little doubt about the if the abstract class contain the
> non-abstract method?
> 
> The ans is yes!
> 
> When the subclass implements the Number class with no override the non-abstract,
> it will generate different method between the Number.non-abstract method.
> 







