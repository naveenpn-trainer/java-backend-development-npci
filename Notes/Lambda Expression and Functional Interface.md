# Lamba Functions and Functional Interface

In OOP, each code block {} is related to class and objects.. A method cannot exist independently. 

```
public class HelloWorld{
	public static void main(String []args){
		System.out.println("Hello World")
	}
}
```

**IMportant Point**

* When we use Functional Programming , allows us to create and use independent methods. 
* Lambda expressions are the way to implement Functional Programming in OOP world
* It has been added with the Java 8 release.

## Advantages of Lamba Expressions

1. Enables Functional Programming
2. Makes the code more readable. (Less Verbose)
3. Allows getting rid of boilerplate codes.



```
public class Greeter {
	public void greet() {
		System.out.println("Hello World")
	}
	
	public static void main(string []args){
		Gretter greeter = new Greeter();
		greeter.greet()
	}
}
```



```
byeGreeting = public void greet() {
System.out.println("By World")
}

hiGreeting = public void greet() {
System.out.println("Hi World")
}

helloGreeting = public void greet() {
System.out.println("Hello World")
}
```

**If we want to assign lambda expression to a variable the type of the variable should be of type functional interface**

## Functional Interface

>  It is an interface contains only one abstract method, that is known as Functional Interface.

* Also known as SAM (Single Abstract Method)

### Types of Functional Interface

A lot of Functional Interfaces is available in Java API

1.  Consumer (I)
2.  Supplier (I)
3.  Predicate (I)
4.  Function (I)
5.  BinaryOperator  (I)
6.  UnaryOperator (I)

**Important Points**

* All the functional interfaces is present inside java.util.function package

### java.util.function.Consumer <T>

> It represents an operation that takes an argument of type T and returns no result.

```java
@FunctionalInterface
public interface Consumer<T> {
	void accept(T t);
    def Consumer<T> addThen(Consumer<? super T>) after) {
        // Implementation
    }
        
}
```

In Java 8

1. Constant variables
2. Abstract Methods
3. Default Methods
4. Static Methods

#### **Problem Statement**

Given a list of numbers [1,3,4,5,6,7], Write a program to multiply each element by 2 by using Consumer Functional Interface and print the output in the console

```java
List<Integer> numberList = Arrays.asList(1,2,3,4,5);
```

**Expected Output**

2

4

6

8

10

### java.util.function.Supplier <T>

> It represents a function which doesn't not take in any arguments by produces a value of type <T>

```java
@FunctionalInterface
public interface Supplier<T>{
	public T get()
}
```

### java.util.function.Predicate

> It represents a single argument function that returns a Boolean value

```java
@FunctionalInterface
public interface Predicate<T>{
	boolean test(T t);
    and(Predicates<? supert T> other);
    or(Predicates<? supert T> other);
    negate
        
}
```

