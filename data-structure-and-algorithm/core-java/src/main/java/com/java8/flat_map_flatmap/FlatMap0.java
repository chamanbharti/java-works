package com.java8.flat_map_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap0 {

	public static void main(String[] args) {
		
/**
 FlatMap
flatMap() is used to flatten (or combine) the elements of a stream into one (new) stream:

<R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)
DoubleStream flatMapToDouble(Function<? super T,? extends DoubleStream> mapper)
IntStream flatMapToInt(Function<? super T,? extends IntStream> mapper)
LongStream flatMapToLong(Function<? super T,? extends LongStream> mapper)

From its signature (and the signature of the primitive versions) we can see that, 
in contrast to map() which returns a single value, flatMap() must return a Stream. If flatMap() maps to null, 
the return value will be an empty stream, not null itself.

Let's see how this works. Suppose we have a stream comprising lists of characters:
 */
		List<Character> aToD = Arrays.asList('a', 'b', 'c', 'd');
		List<Character> eToG = Arrays.asList('e', 'f', 'g');
		List<List<Character>>list = Arrays.asList(aToD,eToG);
		Stream<List<Character>>list2 = Stream.of(aToD,eToG);
		
/**
 We want to convert all the characters to their int representation. 
 Notice through the code below that we we can't use map() anymore; 
 c represents an object of type List<Character>, not Character:

stream .map(c -> (int)c)

Instead, we need to get the elements of the lists into one stream and then convert each character to an int. 
Fortunately, we have flatMap() to combine the list elements into a single Stream object:
*/
		list2
		//.stream()
		.flatMap(l -> l.stream())
		.map(c -> (int)c)
		.forEach(i -> System.out.format("%d ", i));//97 98 99 100 101 102 103 
		System.out.println();
/**
 flatMap() returns a stream while map() returns an element.

Using peek() (which just executes the provided expression and returns a new stream with the same elements of the original one) 
after flatMap() may clarify how the elements are processed:
 */
		list.stream().flatMap( l -> l.stream())
		.peek(System.out::print)
		.map(c -> (int)c)
		.forEach(i -> System.out.format("%d ", i));
/**
 As you can see from the output, the stream returned from flatMap() is passed through the pipeline, 
 as if we were working with a stream of single elements rather than a stream of lists of elements:
a97 b98 c99 d100 e101 f102 g103

This way, with flatMap() you can convert a Stream<List<Object>> to Stream<Object>. However, 
the important concept is that this method returns a stream and not a single element (as map() does).
 */
	}
}
