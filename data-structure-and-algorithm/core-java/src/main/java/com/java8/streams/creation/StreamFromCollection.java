package java8.streams.creation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;
//https://www.geeksforgeeks.org/program-to-convert-a-map-to-a-stream-in-java/
public class StreamFromCollection {

	public static void main(String[] args) {
		
		 System.out.println("******Create Streams from arrays******");
		 System.out.println("creates a stream from an array of objects.");
		 
		 String[] names = {"XML", "Java",  "CSS", "SQL"};
		 Stream<String> stream3 = Stream.of(names);
		 stream3.forEach(System.out::println);
		 System.out.println("...........................................");
		 
		 System.out.println("******Create Streams from collections******");
		 
		 System.out.println("------List>>stream-----");
		 List<String> list = Arrays.asList("Chaman","Bharti");
		 Stream<String> collectionStream = list.stream();
		 collectionStream.forEach(System.out::println);
		 System.out.println("...........................................");
		 
		 System.out.println("------Set>>stream-----");
		 Set<String> setNames = new HashSet<>();
		 setNames.add("XML");
		 setNames.add("Java");
		 
		 Stream<String> sequentialStream = setNames.stream();
		 sequentialStream.forEach(System.out::println);
		 
		 System.out.println("------Set>>parallelStream-----");
		 Stream<String> parallelStream = setNames.parallelStream();
		 parallelStream.forEach(System.out::println); 
		 
		 System.out.println("------Set>>stream-----");
		 Map<String, Integer>map = new HashMap<>();
		 map.put("A", 65);
		 map.put("B", 66);
		 map.put("C", 67);

		 // Convert the Map to Stream 
		// Stream<Map.Entry<String, Integer>> mapStream = convertMapToStream(map);
		// mapStream.forEach(System.out::println);
		 // Print the TreeMap 
		 //thrown excepton:Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		// System.out.println("Stream: "+Arrays.toString(mapStream.toArray()));//
		 
		 //Stream<Integer>keyStream = convertMapToStream2(map);
		 //keyStream.forEach(System.out::println);
		 //System.out.println("Stream: "+Arrays.toString(keyStream.toArray()));
		 
		 Stream<Integer>valueStream = convertMapToStream3(map);
		 valueStream.forEach(System.out::println);
	}

	private static Stream<Entry<String, Integer>> convertMapToStream(Map<String, Integer> map) {
		// return obtained stream
		return map
				//convet Map to Set
				.entrySet()
				//convert the Set to Stream
				.stream();
	}
	private static Stream<String> convertMapToStream2(Map<String, Integer> map) {
		// return obtained stream
		return map
				// Convert the Map to Set<Key> 
				.keySet()
				//convert the Set to Stream
				.stream();
	}
	private static Stream<Integer> convertMapToStream3(Map<String, Integer> map) {
		// return obtained stream
		return map
				// Convert the Map to Set<Key> 
				.values()
				//convert the Set to Stream
				.stream();
	}
}
