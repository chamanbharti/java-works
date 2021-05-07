package com.java8.streams;

import java.util.stream.*;

public class DataSearch {

	public static void main(String[] args) {
		
/*		Data Search
Searching is a common operation for when you have a set of data.

The Stream API has two types of operation for searching.

Methods starting with Find:
Optional<T> findAny()
Optional<T> findFirst()

find methods search for an element in a stream. 
Since there's a possibility that an element can't be found (if the stream is empty, for example), 
find methods return an Optional.

The other way to search is through methods ending with Match:

boolean allMatch(Predicate<? super T> predicate)
boolean anyMatch(Predicate<? super T> predicate)
boolean noneMatch(Predicate<? super T> predicate)

match methods indicate whether a certain element matches the given predicate. They return a boolean.

Since all these methods return a type different than a stream, they are considered terminal operations.

findAny() and findFirst() practically do the same, they return the first element they find in a stream:
*/
	IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
	stream.findFirst().ifPresent(System.out::println);//1
	IntStream stream2 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
	stream2.findAny().ifPresent(System.out::println);
	
	// Again, if the stream is empty, these return an empty Optional:
	Stream<String> stream3 = Stream.empty();
//	System.out.println(
//			 stream3.findAny().isPresent()//false
//			);
	//stream3.findAny().ifPresent(System.out::println);
	stream3.findAny().ifPresentOrElse(System.out::println, () -> System.out.println("source element is not present"));
	
/**
java.util.Optional<T> is a new class also introduced in Java 8. (If you want to know more about it, check out my tutorial here.)

When to use findAny() and when to use findFirst()?

When working with parallel streams, it's harder to find the first element. In this case, 
it's better to use findAny() if you don't really mind which element is returned.

On the other hand, we have the *Match methods.

anyMatch() returns true if any of the elements in a stream matches the given predicate:
*/
	System.out.println("anyMatch()");
	IntStream stream4 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
	System.out.println(stream4.anyMatch(i->i%3 == 0));//true
	
	/**
	 If the stream is empty or if there's no matching element, this method returns false:
	*/
	IntStream stream5 = IntStream.empty();
	System.out.println(stream5.anyMatch(i -> i%3 == 0));//false
	
	IntStream stream6 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
	System.out.println(stream6.anyMatch(i->i%10 == 0));//false
	
	/**
	 allMatch() returns true only if all elements in the stream match the given predicate:
	 */
	System.out.println("allMatch()");
	IntStream stream7 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
	System.out.println(stream7.allMatch(i -> i > 0));//true
	
	IntStream stream8 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
	System.out.println(stream8.allMatch(i -> i%3 == 0));//false
	
	/**
	 If the stream is empty, this method returns true without evaluating the predicate:
	 */
	IntStream stream9 = IntStream.empty();
	System.out.println(stream9.allMatch(i -> i%3 == 0));//true
	
	/**
	 noneMatch() is the opposite of allMatch(), it returns true if none of the elements in the stream match the given predicate:
	 */
	System.out.println("noneMatch()");
	IntStream stream10 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
	System.out.println(stream10.noneMatch(i -> i > 0));//false
	
	IntStream stream11 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
	System.out.println(
	    stream11.noneMatch(i -> i%3 == 0)
	); // false

	IntStream stream12 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
	System.out.println(
	    stream12.noneMatch(i -> i > 10)
	); // true
	
	/**
	  If the stream is empty, this method returns also true without evaluating the predicate:
	 */ 

		IntStream stream13 = IntStream.empty();
		System.out.println(
		    stream13.noneMatch(i -> i%3 == 0)
		); // true
		
		/**
	An important thing to consider is that all of these operations use something similar to the short-circuiting of && and || operators.

	Short-circuiting means that the evaluation stops once a result is found. Thus find* operations stop at the first found element.

	With *Match operations, however, why would you evaluate all the elements of a stream when, 
	by evaluating the third element (for example), you can know if all or none (again for example) of the elements will match?
	*/
	
 }
}
