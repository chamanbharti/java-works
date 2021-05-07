package com.java8.streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class IntermediateOperationsStream {

	public static void main(String[] args) {
		
/**
		 
You can easily identify intermediate operations; they always return a new stream. 
This allows the operations to be connected.

Stream<String> s = Stream.of("m", "k", "c", "t")
    .sorted()
    .limit(3)

An important feature of intermediate operations is that they don't process the elements until a terminal operation is invoked; 
in other words, they're lazy.

Intermediate operations are further divided into stateless and stateful operations.

Stateless operations retain no state from previous elements when processing a new element so each can be processed independently 
of operations on other elements.

Some examples are:

Stream<T> filter(Predicate<? super T> predicate)
Returns a stream of elements that match the given predicate.

<R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)
Returns a stream with the content produced by applying the provided mapping function to each element. 
There are versions for int, long and double also.

<R> Stream<R> map(Function<? super T,? extends R> mapper)
Returns a stream consisting of the results of applying the given function to the elements of this stream. 
There are versions for int, long and double also.

Stream<T> peek(Consumer<? super T> action)
Returns a stream with the elements of this stream, performing the provided action on each element.


Stateful operations, such as distinct and sorted, may incorporate state from previously seen elements when processing new elements.

Some examples are:

Stream<T> distinct(). Returns a stream consisting of the distinct elements.
Stream<T> limit(long maxSize). Returns a stream truncated to be no longer than maxSize in length.
Stream<T> skip(long n). Returns a stream with the remaining elements of this stream after discarding the first n elements.
Stream<T> sorted(). Returns a stream sorted according to the natural order of its elements.
Stream<T> sorted(Comparator<? super T> comparator). Returns a stream with the sorted according to the provided Comparator.

		 * filter()
		 * map()
		 * flatMap()
		 * distinct()
		 * sorted()
		 * peek()
		 * limit()
		 * skip()
		 * all in one program
		 */
		
		//filter()
//		List<Integer>list = Arrays.asList(1,2,3,4);
//		list.stream().filter(p->p%2==0).forEach(System.out::println);
		
		//map()
//		List<Integer>list = Arrays.asList(1,2,3,4);
//		list.stream().filter(p->p%2==0).map(a->a+",").forEach(System.out::print);
		
		//flatMap()
//		List<String>list = Arrays.asList("ab","bc","cd");
//		list.stream().flatMap(a->Stream.of(a.charAt(0))).forEach(System.out::print);
		
		//distinct
//		List<String>list = Arrays.asList("ab","ab","cd");
//		list.stream().distinct().forEach(System.out::print);
		
		//sorted()
//		List<String>list = Arrays.asList("bb","ab","cd");
//		list.stream().sorted().forEach(System.out::print);
		
		//peek
//		List<String>list = Arrays.asList("bb","ab","cd");
//		list.stream().peek(System.out::print).findFirst();
		
		//limit()
//		List<String>list = Arrays.asList("bb","ab","cd");
//		list.stream().limit(2).forEach(System.out::print);
		
		//skip()
		List<String>list = Arrays.asList("bb","ab","cd");
		list.stream().skip(2).forEach(System.out::print);
		
	}
}
