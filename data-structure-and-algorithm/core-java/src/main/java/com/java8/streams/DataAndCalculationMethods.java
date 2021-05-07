package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class DataAndCalculationMethods {

	public static void main(String[] args) {
		
/**
		 Data and Calculation Methods
The Stream interface provides the following data and calculation methods:

long count()
Optional<T> max(Comparator<? super T> comparator)
Optional<T> min(Comparator<? super T> comparator)

The primitive versions of the Stream interface have the following methods:

IntStream

OptionalDouble average()
long count()
OptionalInt max()
OptionalInt min()
int sum()

LongStream

OptionalDouble average()
long count()
OptionalLong max()
OptionalLong min()
long sum()

DoubleStream

OptionalDouble average()
long count()
OptionalDobule max()
OptionalDouble min()
double sum()

count() returns the number of elements in the stream or zero if the stream is empty:
*/
		List<Integer> list = Arrays.asList(57, 38, 37, 54, 2);
		System.out.println(list.stream().count()); // 5
		
/**
min() returns the minimum value in the stream wrapped in an Optional or an empty one if the stream is empty.

max() returns the maximum value in the stream wrapped in an Optional or an empty one if the stream is empty.

When we talk about primitives, it is easy to know which the minimum or maximum value is. 
But when we are talking about objects (of any kind), 
Java needs to know how to compare them to know which one is the maximum and the minimum. 
That's why the Stream interface needs a Comparator for max() and min():
*/
		List<String> strings = Arrays.asList("Stream","Operations","on","Collections");
		strings.stream()
		.min( Comparator.comparing(
				(String s) -> s.length())
				).ifPresent(System.out::println);//on
/**
 sum() returns the sum of the elements in the stream or zero if the stream is empty:
 */
		System.out.println(
			    IntStream.of(28,4,91,30).sum()
			); // 153
		
		System.out.println(
			    IntStream.of(28,4,91,30).average()
			); // 38.25
		
/**
 Conclusion
That's it for now. As you saw, the Stream interface is powerful and not very complicated.

In the second part, I'll cover more advanced methods like map(), merge() and flatMap(), and take a look at parallel streams.
 */
	}
}
