# Integer源码

## 1. Integer类定义
```java
public final class Integer extends Number
        implements Comparable<Integer>, Constable, ConstantDesc {...
}
```
首先，他是个public的方法，他是final修饰的，不可以被继承，而他继承了Number的类，
同时实现了Comparable、Constable、ConstantDesc接口中的方法。

### 1.1 Comparable

Comparable是一个比较用的接口，在观察源码时，我发现两种写法。

#### 1.1.1 第一种

第一个是我在泛型编程中，用到过`<T extends Comparable<T>>`。

当然，也有这样写的`<T extends Comparable<? super T>>`。

这是什么意思呢，这个意思是我这个泛型`T`他在实际使用时，**继承了Comparable接口的方法**。

比如当我的`T`泛型到`int`的时候，我就自动**拿取了int类型中关于Comparable接口的实现**。

下面考虑第二种情况。若我自己写了一个A类，继承的是Integer类，在Integer类种有Comparable接口的实现，
但我自己写的这个A类种并没有这个接口的实现，那我还能不能用`<T extends Comparable<T>>`来描述泛型呢？

答案是**不能**。

那怎么解决呢？

使用`<T extends Comparable<? super T>>` ，它可以帮你继承T以及T的父类的内容，因为super关键字。

#### 1.1.2 第二种

若我写的这个类，比如说我上面的A类，我想在其内部实现Comparable，那我就直接实现这个接口就行，
即`implements comparable`。

在类的定义中实现其中的`public int compareTo(T o);`方法。

一般我们规定，输出为`-1` `0` `1`分别代表，类中的值小于参数值、等于参数值、大于参数值。

### 1.2 Constable













