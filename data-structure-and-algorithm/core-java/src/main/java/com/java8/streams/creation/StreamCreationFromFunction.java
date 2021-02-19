package java8.streams.creation;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationFromFunction {

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
		 */
		
		 
		 System.out.println("******Create Streams from functions******");
		 System.out.println("******** Stream.iterate().limit().forEach() *********");
//		 Stream<Long> tenNaturalNumbers = Stream.iterate(1L, n->n+1)
//				 .limit(10);
//		 tenNaturalNumbers.forEach(System.out::println);
		Stream.iterate(1L, n->n+1)
				 .limit(10)
		 .forEach(System.out::println);
		 
		 System.out.println("******** Stream.iterate().fitler().limit().forEach() *********");
		 Stream.iterate(2L, n->n+1)
		 .filter(StreamCreationFromFunction::isOdd)
		 .limit(5)
		 .forEach(System.out::println);
		 System.out.println("...........................................");
		 
		 System.out.println("******** Stream.iterate().fitler().skip().limit().forEach() *********");
		 Stream.iterate(2L, n->n+1)
		 .filter(StreamCreationFromFunction::isOdd)
		 .skip(100)
		 .limit(5)
		 .forEach(System.out::println);
		 System.out.println("...........................................");
		 
		 System.out.println("******** Stream.generate().limit().forEach() *********");
		 Stream.generate(Math::random)
		 .limit(5)
		 .forEach(System.out::println);
		 System.out.println("...........................................");
		 /**
		  To generate a stream in which the next element is generated based on the previous one, 
		  you will need to use a Supplier that stores the last generated element.
		  */
		 System.out.println("******** Stream.generate().limit().forEach() *********");
		 Stream.generate(StreamCreationFromFunction::next)
		 .limit(5)
		 .forEach(System.out::println);
		 System.out.println("...........................................");
		 
		 System.out.println("******** Random Stream1 *********");
		 new Random().ints()
		 .limit(5)
		 .forEach(System.out::println);
		 System.out.println("...........................................");
		 
		 System.out.println("******** Random Stream2 *********");
		 Stream.generate(new Random()::nextInt)
		 .limit(5)
		 .forEach(System.out::println);
		 System.out.println("...........................................");
		 
		 System.out.println("******** Random IntStream1 *********");
		 IntStream.generate(new Random()::nextInt)
		 .limit(5)
		 .forEach(System.out::println);
		 System.out.println("...........................................");
		 
		 System.out.println("******** Random IntStream2 *********");
		 IntStream.generate( () -> 0)
		 .limit(5)
		 .forEach(System.out::println);
		 System.out.println("...........................................");
		 
	}
	public static boolean isOdd(long number) {
		if(number % 2 == 0) {
			return false;
		}
		return true;
	}
	static int i = 0;
	private static int next() {
		i++;
		return i;
	}
}
