package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Stream0 {
	
	public static void main(String[] args) {
/**
What is a Lambda Expression?
Let's begin by answering the question, what are lambda expressions in the context of java?

Lambda expressions make code more functional and less object-oriented, thus shortening its length. How about an example?

Instead of writing something like:

List<Toy> usedToys = findToys(toys,
     new Searchable() {
        public boolean test(Toy toy) {
           return toy.getType().equals(
                     ToyTypes.USED);
        }
});
java
Lambda expressions enable you to write:

List<Toy> usedToys = findToys(toys,
     Toy toy ->
        toy.getType().equals(ToyTypes.USED);
java
The term lambda expression comes from lambda calculus, written as λ-calculus, where λ is the Greek letter lambda. This form of calculus deals with defining and applying functions.

As a result, lambdas simplify code in a way called functional programming, a different paradigm than object-oriented programming.

A lambda expression has three parts:

A list of parameters
A lambda expression can have zero (represented by empty parentheses), one or more parameters:

() -> System.out.println("Hi");
(String s) -> System.out.println(s);
(String s1, String s2) -> System.out.println(s1 + s2);

The type of the parameters can be declared explicitly, or it can be inferred from the context:

(s) -> System.out.println(s);

If there is a single parameter, the type is inferred and is not mandatory to use parentheses:

s -> System.out.println(s);

If the lambda expression uses as a parameter name the same as a variable name of the enclosing context, a compile error is generated:

// This doesn't compile
String s = ""; s -> System.out.println(s);

An arrow
Formed by the characters - and > to separate the parameters and the body.

A body
The body of the lambda expressions can contain one or more statements.

If the body has one statement, curly brackets are not required and the value of the expression (if any) is returned:

() -> 4; (int a) -> a*6;

If the body has more than one statement, curly brackets are required, and if the expression returns a value, it must be returned with a return statement:

() -> {
     System.out.println("Hi");
     return 4;
}
(int a) -> {
     System.out.println(a);
     return a*6;
}

Returning is not necessary with lambda expressions. For example, the following are equivalent:

() -> System.out.println("Hi");
() -> {
     System.out.println("Hi");
     return;
}

The signature of the abstract method of a functional interface provides the signature of a lambda expression (this signature is called a functional descriptor).

This means that to use a lambda expression, you first need a functional interface, which is just a fancy name for an interface with one method. For example:

interface Searchable {
     boolean test(Car car);
}

In fact, lambda expressions don't contain the information about which functional interface they are implementing. The type of the expression is deduced from the context in which the lambda is used. This type is called the target type.

So lambda expressions are an alternative to anonymous classes, but they are not the same.

They have some similarities:

Local variables (variables or parameters defined in a method) can only be used if they are declared final or are effectively final.
You can access instance or static variables of the enclosing class.
They must not throw more exceptions than specified in the throws clause of the functional interface method. Only the same type or a supertype.
Some significant differences between lambdas and anonymous classes:

For an anonymous class, the this keyword resolves to the anonymous class itself. For a lambda expression, this resolves to the enclosing class where the lambda is written.
Default methods of a functional interface cannot be accessed from within lambda expressions. Anonymous classes can.
Anonymous classes are compiled into inner classes, while lambda expressions are converted into private, static (in some cases) methods within their enclosing class. Using the invokedynamic instruction (added in Java 7), they are bound dynamically. Simply put, since there's no need to load another class, lambda expressions are more efficient than anonymous classes.
With this in mind, let's introduce the Stream interface.

What is a Stream?
First of all, streams are not collections.

A simple definition is that streams are wrappers for collections and arrays. 
They wrap an existing collection (or another data source) to support operations expressed with lambdas, 
so you specify what you want to do, not how to do it.

Characteristics of streams:
Streams work perfectly with lambdas.
Streams don't store their elements.
Streams are immutable.
Streams are not reusable.
Streams don't support indexed access to their elements.
Streams are easily parallelizable.
Stream operations are lazy when possible.
One thing that allows this laziness is the way their operations are designed. Most of them return a new stream, 
allowing operations to be chained and form a pipeline that enables this kind of optimizations.

To set up this pipeline you:

Create the stream.
Apply zero or more intermediate operations to transform the initial stream into new streams.
Apply a terminal operation to generate a result or a side-effect.

Creating Streams
A stream is represented by the java.util.stream.Stream<T> interface. This works with objects only.

There are also specializations to work with primitive types, such as IntStream, LongStream, and DoubleStream. 
Also, there are many ways to create a stream. Let's see the three most popular.

The first one is creating a stream from a java.util.Collection implementation using the stream() method:
 */
		List<String> words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao"});
		Stream<String> stream = words.stream();
		System.out.println(stream);//java.util.stream.ReferencePipeline$Head@5ca881b5
		
		//The second one is creating a stream from individual values:
		Stream<String> stream2 = Stream.of("hello","hola", "hallo", "ciao");
		System.out.println(stream2);//java.util.stream.ReferencePipeline$Head@24d46ca6
		
		//The third one is creating a stream from an array:
		String[] words2 = {"hello", "hola", "hallo", "ciao"};
		Stream<String> stream3 = Stream.of(words2);
		System.out.println(stream3);//java.util.stream.ReferencePipeline$Head@4517d9a3
}	
	
}
