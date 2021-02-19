package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
public class Stream {

	public static void main(String[] args) {
//		String[] names = { "XML", "Java", "SQL", "CSS" };
//		java.util.stream.Stream<String> stream = java.util.stream.Stream.of(names);
//	    stream.forEach(System.out::println);
		
//		java.util.stream.Stream<String> stream  = java.util.stream.Stream.<String>builder()
//				.add("XML").add("Java").add("CSS").build();
//	    stream.forEachOrdered(System.out::println);
		
//		IntStream oneToFive = IntStream.range(1, 6);
//		IntStream oneToFive = IntStream.rangeClosed(1, 5);
//		oneToFive.forEachOrdered(System.out::println);
		
//		java.util.stream.Stream<Long> tenNaturalNumbers = java.util.stream.Stream.iterate(1L, n  ->  n  + 1)
//		        .limit(10);
//
//		    tenNaturalNumbers.forEach(System.out::println);
		
//		java.util.stream.Stream.iterate(2L, n  ->  n  + 1)
//		        .filter(Stream::isOdd)
//		        .skip(100)
//		        .limit(5)
//		        .forEach(System.out::println);
		
		java.util.stream.Stream.generate(Math::random)
        .limit(5)
        .forEach(System.out::println);
		
		IntStream.generate(() ->  9)
	    .limit(15)
	    .forEach(System.out::println);

	}
	
	public static boolean isOdd(long number) {
		if(number % 2 == 0) {
			return false;
		}
		return true;
	}
}
