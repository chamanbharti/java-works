package com.books.modern_java_recipes.chap1.basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReference {

	public static void main(String[] args) {
		
		/*
		 * Consumer can be implemented as either a lambda expression or as a method reference.
			Using a method reference to access println
		 */
		System.out.println("using lambda expression");
		Stream.of(3, 1, 4, 1, 5, 9).forEach(x -> System.out.println(x));
		System.out.println("using method reference");
		Stream.of(3, 1, 4, 1, 5, 9).forEach(System.out::println);
		
		// equivalent to System.out::println
		// x -> System.out.println(x)
		
		System.out.println("using own consumer");
		Consumer<Integer>printer = System.out::println;
		Stream.of(3, 1, 4, 1, 5, 9).forEach(printer);
		
		// Using a method reference to a static method
		Stream.generate(Math::random).limit(10).forEach(System.out::println);
		
		//Invoking a multiple-argument instance method from a class reference
		List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
//		List<String> sorted = strings.stream().sorted( (a,b) -> a.compareTo(b)).collect(Collectors.toList());
		List<String> sorted = strings.stream().sorted(String::compareTo).collect(Collectors.toList());
		System.out.println(sorted);
		
		//Invoking the length method on String using a method reference
		Stream.of("this", "is", "a", "stream", "of", "strings").map(s->s.length()).forEach(s-> System.out.println(s));
		// Lambda expression equivalents for method references
		Stream.of("this", "is", "a", "stream", "of", "strings").map(String::length).forEach(System.out::println);
	}
}
