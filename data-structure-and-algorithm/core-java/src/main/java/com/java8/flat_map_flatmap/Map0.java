package com.java8.flat_map_flatmap;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Map0 {

	public static void main(String[] args) {
		
		/**
		 Introduction
In the first part of this tutorial on the Java 8 Stream API, 
we covered what streams are and some of their most common operations.

Without further ado, 
let's continue with the methods used to program streams in a functional style. After that, we'll take a look at parallel streams.
	
	Map
map() is used to transform the value or the type of the elements of a stream:

<R> Stream<R> map(Function<? super T,? extends R> mapper)
IntStream mapToInt(ToIntFunction<? super T> mapper)
LongStream mapToLong(ToLongFunction<? super T> mapper)
DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper)

As you can see, map() takes a Function to convert the elements of a stream of type T to type R, 
returning a stream of that type R:
	*/
		Stream.of('a','b','c','d')
		.map(c -> (int)c)
		.forEach(i -> System.out.format("%d ", i));//97 98 99 100 
		
		// There are versions for transforming to primitive types. For example:
		IntStream.of(100, 110, 120, 130 ,140)
		.mapToDouble( i -> i/3.0)
		.forEach(i -> System.out.format("%.2f ", i));//97 98 99 100 33.33 36.67 40.00 43.33 46.67 
		
		
		
		
	}
	
}
