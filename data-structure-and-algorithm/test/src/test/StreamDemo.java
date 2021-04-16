package test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamDemo {

	public static void main(String[] args) {
		
//		Set<String> set = new TreeSet<>(Arrays.asList("three", "one", "two"));
//        Stream<String> stream = StreamSupport.stream(set.spliterator(), false);
//        stream.forEach(System.out::println);
		
		List<String> set = Arrays.asList("three", "one", "two", "one");
        Stream<String> stream = StreamSupport.stream(() -> set.spliterator(), Spliterator.SORTED, false);
        stream.forEach(System.out::println);
	}
}
