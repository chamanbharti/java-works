package com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class SortingStream {

	public static void main(String[] args) {
		
			/**
			 Sorting a Stream
		Sorting a stream is simple.
		
		1
		Stream<T> sorted()
		
		The method above returns a stream with the elements sorted according to their natural order. For example:
		*/
		List<Integer>list = Arrays.asList(57,38,37,54,2);
		//list.stream().sorted().forEach(s->System.out.print(s+" "));
		list.stream().sorted((a,b)->(b-a)).forEach(s->System.out.print(s+" "));
		System.out.println();
		/**
		 The only requirement is that the elements of the stream implement java.lang.Comparable (that way, they are sorted in natural order). 
		 Otherwise, a ClassCastException may be thrown.
		 If we want to sort using a different order, 
		 there's another version of this method that takes a java.util.Comparator 
		 (this version is not available for primitive stream like IntStream):
		Stream<T> sorted(Comparator<? super T> comparator)
		For example:
		 */
		List<String> strings = Arrays.asList("Stream","Operations","on","Collections");
		strings.stream().sorted().forEach(s->System.out.print(s+" "));//Collections Operations Stream on 
		System.out.println();
		strings.stream().sorted( (a,b) -> b.length() - a.length()).forEach(s->System.out.print(s+" "));//Collections Operations Stream on 
	}
}
