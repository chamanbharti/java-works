package java8.streams.creation;

import java.util.stream.Stream;

public class StreamFromArray {

	public static void main(String[] args) {
		
		 System.out.println("******Create Streams from arrays******");
		 System.out.println("creates a stream from an array of objects.");
		 
		 String[] names = {"XML", "Java",  "CSS", "SQL"};
		 Stream<String> stream3 = Stream.of(names);
		 stream3.forEach(System.out::println);
		 
		 System.out.println("...........................................");
		 
	}
}
