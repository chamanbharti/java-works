package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
//https://java2blog.com/java-8-stream/?utm_source=vdoai_stories
public class StreamAllinOne2 {

	public static void main(String[] args) {
		
//		Stream s = Stream.empty();
//		System.out.println(s);
		
//		List<String> stringList=Arrays.asList("Andy","Peter","Amy","Mary");
//		stringList.stream()
//		.map((s)-> s.toUpperCase())
//		.forEach(System.out::println);
		
//		Stream<String> streamArray = Stream.of("X","Y","Z");
//		streamArray.forEach(System.out::println);
		
//		Stream<Integer> intStream = Stream.generate( () -> 1).limit(5);
//		intStream.forEach(System.out::println);
		
//		Stream<Integer> intStream = Stream.iterate(100, n -> n+1).limit(5);
//		intStream.forEach(System.out::println);
		
//		Stream<String> nameStream = Stream.of("mohan","john","vaibhav","amit");
//		Stream<String> nameStartJ = nameStream.map(String::toUpperCase)
//											  .peek(e -> System.out.println(e))
//											  .filter(s -> s.startsWith("J"));
//		System.out.println("Calling terminal operation: count");
//		long count = nameStartJ.count();
//		System.out.println(count);
		
		//Order of operations
//		Stream<String> nameStream = Stream.of("mohan","john","vaibhav","amit");
//		Stream<String> nameStartJ = nameStream.map(
//				(s) -> {
//					System.out.println("Map:"+s);
//					return s.toUpperCase();
//				})
//				.filter( (s) ->{
//					System.out.println("Filter:"+s);
//					return s.startsWith("J");
//				});
//		Optional<String>findAny = nameStartJ.findAny();
//		System.out.println("Final Output:"+findAny.get());
		
		//Primitive Streams
	}

}
