package com.java8.streams.terminal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class TerminalOperationsStream {

	public static void main(String[] args) {
		
/**
		 Terminal Operations
You can also easily identify terminal operations because they always return something other than a stream.

After the terminal operation is performed, the stream pipeline is consumed and can't be used anymore. 
For example:
*/
//int[] digits = {0, 1, 2, 3, 4 , 5, 6, 7, 8, 9};
//IntStream s = IntStream.of(digits);
//long n = s.count();
//System.out.println(s.findFirst()); // java.lang.IllegalStateException: stream has already been operated upon or closed

//long n = IntStream.of(digits).count();
//System.out.println(n);


//If you need to traverse the same stream again, you must return to the data source to get a new one. 
// For example:
int[] digits = {0, 1, 2, 3, 4 , 5, 6, 7, 8, 9};
long n = IntStream.of(digits).count();
System.out.println(n);
System.out.println(IntStream.of(digits).findFirst()); // OK

/*
The following methods represent terminal operations:

boolean allMatch(Predicate<? super T> predicate)
Returns whether all elements of this stream match the provided predicate.

boolean anyMatch(Predicate<? super T> predicate)
Returns whether any elements of this stream match the provided predicate.

boolean noneMatch(Predicate<? super T> predicate)
Returns whether no elements of this stream match the provided predicate.

Optional<T> findAny()
Returns an Optional describing some element of the stream.

Optional<T> findFirst()
Returns an Optional describing the first element of this stream.

<R,A> R collect(Collector<? super T,A,R> collector)
Performs a mutable reduction operation on the elements of this stream using a Collector.

long count()
Returns the count of elements in this stream.

void forEach(Consumer<? super T> action)
Performs an action for each element of this stream.

void forEachOrdered(Consumer<? super T> action)
Performs an action for each element of this stream, in the encounter order of the stream if the stream has a defined encounter order.

Optional<T> max(Comparator<? super T> comparator)
Returns the maximum element of this stream according to the provided Comparator.

Optional<T> min(Comparator<? super T> comparator)
Returns the maximum element of this stream according to the provided Comparator.

T reduce(T identity, BinaryOperator<T> accumulator)
Performs a reduction on the elements of this stream, using the provided identity value and an associative accumulation function, and returns the reduced value.

Object[] toArray()
Returns an array containing the elements of this stream.

<A> A[] toArray(IntFunction<A[]> generator)
Returns an array containing the elements of this stream, using the provided generator function to allocate the returned array.

Iterator<T> iterator()
Returns an iterator for the elements of the stream.

Spliterator<T> spliterator()
Returns a Spliterator for the elements of the stream.
		 
		 
		 * toArray()
		 * collect()
		 * count()
		 * reduce()
		 * forEach()
		 * forEachOrdered()
		 * min()
		 * max()
		 * anyMatch()
		 * allMatch()
		 * noneMatch()
		 * findAny()
		 * findFirst()
		 * all in one program
		 */
		
		//toArray()
//		List<Integer>list = Arrays.asList(1,2,3,4);
//		Object[] arr = list.stream().toArray();//convert to array
//		System.out.println(arr[0]);
		
		//collect()
//		List<Integer>list = Arrays.asList(1,1,2,3,4,3);
//		list.stream().collect(Collectors.toSet()).forEach(System.out::println);;//convert to set
		
		//count
//		List<Integer>list = Arrays.asList(1,1,2,3,4,3);
//		System.out.println(list.stream().count());
//		long totalNumber = list.stream().count();
//		System.out.println(totalNumber);
		
		//reduce()
//		List<Integer>list = Arrays.asList(1,1,2,3,4);
//		System.out.println(list.stream().reduce(0,(x,y)->(x+y)));
//		int totalNumber = list.stream().reduce(0,(x,y)->(x+y));
//		System.out.println(totalNumber);
		
//		//forEach
//		List<Integer>list = Arrays.asList(1,1,2,3,4);
//		list.stream().forEach(System.out:: println);
		
//		//forEachOrdered
//		List<Integer>list = Arrays.asList(4,1,3,1,4,2);
//		list.stream().forEachOrdered(System.out:: println);
		
		//min
//		List<Integer>list = Arrays.asList(4,0,3,1,4,2);
//		Optional<Integer>value = list.stream().min((a,b)->a-b);
//		System.out.println(value.get());
		
		//max
//		List<Integer>list = Arrays.asList(4,0,3,1,4,2);
//		Optional<Integer>value = list.stream().max((a,b)->a-b);
//		System.out.println(value.get());
		
		//anyMatch
//		List<Integer>list = Arrays.asList(4,0,3,1,4,2);
//		System.out.println(list.stream().anyMatch(a->a==5));
		
		//allMatch
//		List<Integer>list = Arrays.asList(4,0,3,1,4,2);
//		System.out.println(list.stream().allMatch(a->a/1==a));
		
		//noneMatch
//		List<Integer>list = Arrays.asList(4,0,3,1,4,2);
//		System.out.println(list.stream().noneMatch(a->a==5));
		
		//findFirst()
//		List<Integer>list = Arrays.asList(4,0,3,1,4,2);
//		System.out.println(list.stream().findFirst().get());
		
		//findAny()
//		List<Integer>list = Arrays.asList(4,0,3,1,4,2);
//		System.out.println(list.stream().findAny().get());
		
		//average
		
//		List <Integer> listOfIntegers = Arrays.asList(20, 50, 99, 12, 94);
//		OptionalDouble average = listOfIntegers.stream().mapToInt(no -> no.intValue()).average();
//		System.out.println(average);
//		
		// https://techndeck.com/java-8-program-to-calculate-average-of-n-numbers/
	}
}
