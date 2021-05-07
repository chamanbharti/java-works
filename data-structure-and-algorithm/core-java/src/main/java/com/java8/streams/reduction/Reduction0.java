package com.java8.streams.reduction;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduction0 {

	public static void main(String[] args) {
/**
 Reduction
A reduction is an operation that takes many elements and combines them to reduce them into a single value or object. 
Reduction is done by applying an operation multiple times.

Some examples of reductions include summing N elements, finding the maximum element of N numbers, or counting elements.

In the following example, we use a for loop to reduce an array of numbers to their sum:
 */
//		int[] numbers = {1,2,3,4,5,6};
//		int sum = 0;
//		for(int n : numbers) {
//			//sum = sum + n;
//			sum += n;
//		}
//		System.out.println(sum);
/**
 Of course, making reductions with streams instead of loops has benefits, such as easier parallelization and improved readability.

The Stream interface has two methods for reduction:

collect()
reduce()

We can implement reductions with both of these methods, but collect() helps us implement a type of reduction called mutable reduction, 
where a container (like a Collection) is used to accumulate the result of the operation.
The other reduction operation, reduce(), has three versions:

Optional<T> reduce(BinaryOperator<T> accumulator)

T reduce(T identity,
         BinaryOperator<T> accumulator)

<U> U reduce(U identity,
             BiFunction<U,? super T,U> accumulator,
             BinaryOperator<U> combiner)

Remember that a BinaryOperator<T> is equivalent to a BiFunction<T, T, T>, 
where the two arguments and the return type are all of the same types.

Let's start with the version that takes one argument. This is equivalent to:

boolean elementsFound = false;
T result = null;
for (T element : stream) {
    if (!elementsFound) {
        elementsFound = true;
        result = element;
    } else {
        result = accumulator.apply(result, element);
    }
return elementsFound ? Optional.of(result): Optional.empty();

This code just applies a function for each element, accumulating the result and returning an Optional wrapping that result, or an empty Optional if there were no elements.

Let's see a concrete example. We just see how a sum is a reduce operation:
 */
//		int[] numbers = {1,2,3,4,5,6};
//		int sum = 0;
//		for(int n : numbers) {
//			//sum = sum + n;
//			sum += n;
//		}
//		System.out.println(sum);
/*
		Here, the accumulator operation is:
		sum += n;   //or sum = sum + n
		This translates to:
		OptionalInt total = IntStream.of(1,2,3,4,5,6).reduce( (sum, n) -> sum + n);
		
		Notice how the primitive version of Stream uses the primitive version of Optional.

This is what happens step by step:

An internal variable that accumulates the result is set to the first element of a stream (1).
This accumulator and the second element of the stream (2) are passed as arguments to the BinaryOperator represented by the lambda expression (sum, n) -> sum + x.
The result (3) is assigned to the accumulator.
The accumulator (3) and the third element of the stream (3) are passed as arguments to the BinaryOperator.
The result (6) is assigned to the accumulator.
Steps 4 and 5 are repeated for the next elements of the stream until there are no more elements.
However, what if you need to have an initial value? For cases like that, we have the version that takes two arguments:

T reduce(T identity, BinaryOperator<T> accumulator)

The first argument is the initial value, and it is called the identity because, strictly speaking, this value must be an identity for the accumulator function. In other words, for each value v, accumulator.apply(identity, v) must be equal to v.

This version of reduce() is equivalent to:

T result = identity;
for (T element : stream)  {
    result = accumulator.apply(result, element);
}
return result;

Notice that this version does not return an Optional object because if the stream empty, the identity value is returned.

For example, the sum example can be rewritten as:
		*/
		int total = IntStream.of(1, 2, 3, 4, 5, 6)
	               .reduce( 0,
	                       (sum, n) -> sum + n ); // 21
		System.out.println(total);
		
		// Or using a different initial value:
		int total2 = IntStream.of(1, 2, 3, 4, 5, 6)
                .reduce( 4,
                        (sum, n) -> sum + n ); // 25
		System.out.println(total2);
		
/**
 However, notice that in the example above, the first value cannot be considered an identity because, 
 for instance, 4 + 1 is not equal to 4.

This can bring some problems when working with parallel streams, which we'll review in a few moments.

Now, notice that with these versions, you take elements of type T and return a reduced value of type T as well.

However, if you want to return a reduced value of a different type, you have to use the three arguments version of reduce():

<U> U reduce(U identity,
             BiFunction<U,? super T, U> accumulator,
             BinaryOperator<U> combiner)

This is equivalent to using:

U result = identity;
for (T element : stream) {
    result = accumulator.apply(result, element)
}
return result;

Consider for example that we want to get the sum of the length of all strings of a stream, so we take strings (type T), 
and we want an integer result (type U).

In that case, we use reduce() like this:
 */
		int length =
			    Stream.of("Parallel", "streams", "are", "great")
			        .reduce(0,
			                (accumInt, str) ->
			                   accumInt + str.length(), //accumulator
			                (accumInt1, accumInt2) ->
			                   accumInt1 + accumInt2);//combiner
		System.out.println(length);
		
		// We can make it clearer by adding the argument types:
		length = 0;
		length =
				  Stream.of("Parallel", "streams", "are", "great")
				      .reduce(0,
				            (Integer accumInt, String str) ->
				               accumInt + str.length(), //accumulator
				            (Integer accumInt1, Integer accumInt2) -> accumInt1 + accumInt2);//combiner
		System.out.println(length);
		
/**
 As the accumulator function adds a mapping (transformation) step to the accumulator function, 
 this version of the reduce() can be written as a combination of map() 
 and the other versions of the reduce() method (you may know this as the map-reduce pattern):
 */
		length =
			    Stream.of("Parallel", "streams", "are", "great")
			        .mapToInt(s -> s.length())
			        .reduce(0,
			               (sum, strLength) -> sum + strLength);
		System.out.println(length);
		// Or simply:
		length = Stream.of("Parallel", "streams", "are", "great")
                .mapToInt(s -> s.length())
                .sum();
/**
 In fact, the calculation operations 
 that we learned about in the first part are implemented as reduce operations under the hood:

average
count
max
min
sum
Also, notice that if we return a value of the same type, 
the combiner function is no longer necessary (it turns out that this function is the same as the accumulator function).
 So, in this case, it's better to use the two argument version.

It's recommended to use the three version reduce() method when:

Working with parallel streams
Having one function as a mapper and accumulator is more efficient than having separate mapping and reduction functions.
On the other hand, collect() has two versions:

<R,A> R collect(Collector<? super T,A,R> collector)

<R> R collect(Supplier<R> supplier,
              BiConsumer<R,? super T> accumulator,
              BiConsumer<R,R> combiner)
              
The first version uses predefined collectors from the Collectors class while the second one allows you to create your own collectors. 
Primitive streams (like IntStream) only have this last version of collect().

Remember that collect() performs a mutable reduction on the elements of a stream, 
which means that it uses a mutable object for accumulating, like a Collection or a StringBuilder. 
In contrast, reduce() combines two elements to produce a new one and represents an immutable reduction.

However, let's start with the version that takes three arguments, 
as it's similar to the reduce() version that also takes three arguments.

As you can see from its signature, first, 
it takes a Supplier that returns the object that will be used and returned as a container (accumulator).

The second parameter is an accumulator function, which takes the container and the element to be added to it.

The third parameter is the combiner function, 
which merges the intermediate results into the final one (useful when working with parallel streams).

This version of collect() is equivalent to:

R result = supplier.get();
for (T element : stream) {
    accumulator.accept(result, element);
}
return result;

For example, if we want to "reduce" or "collect" all the elements of a stream into a List, use the following algorithm:
 */
		List<Integer>list = Stream.of(1,2,3,4,5)
				.collect(
						 () -> new ArrayList<>(),//creating the container
						 (l,i) -> l.add(i),//adding an element
						 (l1,l2) -> l1.addAll(l2)//combining elements
						);
		System.out.println(list);
		
		// We can make it clearer by adding the argument types:
		List<Integer> list2 = Stream.of(1, 2, 3, 4, 5)
			        .collect(
			           () -> new ArrayList<>(),
			           (l, i) -> l.add(i),
			           (l1, l2) -> l1.addAll(l2)
			        );
		System.out.println(list2);
		// We can also use method references:
		List<Integer> list3 = Stream.of(1, 2, 3, 4, 5)
				.collect(
						ArrayList::new,
						ArrayList::add,
						ArrayList::addAll
						);
		System.out.println(list3);
		
	}
}
