package com.java8.streams.creation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		
		/**
		 New methods have been added to Java libraries to return a stream.

		We can create stream in the following ways.
		
		Create Streams from value
		Create Streams from values
		Create Streams from functions
		Create Streams from arrays
		Create Streams from collections
		Create Streams from Empty streams
		Create Streams from files
		Create Streams from other sources
		
		1.
		List<String> words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao"});
		Stream<String> stream = words.stream();

		2.
		Stream<String> stream = Stream.of("hello","hola", "hallo", "ciao");
		
		3.
		String[] words = {"hello", "hola", "hallo", "ciao"};
		Stream<String> stream = Stream.of(words);
		
		
		 */
		
		System.out.println("******Create Streams from value******");
		//<T> Stream<T> of(T  t)
		System.out.println("creates a stream which contains a single value.");
		Stream<String> stream = Stream.of("Chaman");
		System.out.println(stream);
		stream.forEach(System.out::println);
		 System.out.println("...........................................");
		 
		System.out.println("******Create Streams from values******");
		//<T> Stream<T> of(T...values)
		System.out.println("creates a stream with four strings.");
		 Stream<String> stream2  = Stream.of("XML", "Java",  "CSS", "SQL");
		 System.out.println(stream2);
		 stream2.forEach(System.out::println);
		 System.out.println("...........................................");
		 
		 
		 System.out.println("******Create Streams from arrays******");
		 System.out.println("creates a stream from an array of objects.");
		 String[] names = {"XML", "Java",  "CSS", "SQL"};
		 Stream<String> stream3 = Stream.of(names);
		 stream3.forEach(System.out::println);
		 System.out.println("...........................................");
		 
		 System.out.println("******Create Streams from collections******");
		 
		 //List<String> list = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao"});
		 
		 List<String> list = Arrays.asList("Chaman","Bharti");
		 Stream<String> collectionStream = list.stream();
		 collectionStream.forEach(System.out::println);
		 System.out.println("...........................................");
		 
		 //We can use Stream.Builder<T> to create streams.
		 System.out.println("creates a stream builder.");
		 Stream<String> stream4 = Stream.<String>builder()
				 .add("XML")
				 .add("Java")
				 .add("CSS")
				 .add("SQL")
				 .build();
		 stream4.forEach(System.out::println);
		 
		 
		 System.out.println("******Create Streams from Empty streams******");
		 Stream<String> stream5 = Stream.empty();
		 stream5.forEach(System.out::println);
		 
		 System.out.println("******IntStream from range******");
		 /**
		    IntStream range(int start, int end)
			IntStream rangeClosed(int start, int end).
		  */
		 System.out.println("IntStream range(int start, int end)");
		 IntStream oneToFive = IntStream.range(1, 6);
		 oneToFive.forEach(System.out::println);
		 System.out.println("IntStream rangeClosed(int start, int end)");
		 IntStream oneToSix = IntStream.rangeClosed(1, 6);
		 oneToSix.forEach(System.out::println);
		 System.out.println("...........................................");
	}
}
