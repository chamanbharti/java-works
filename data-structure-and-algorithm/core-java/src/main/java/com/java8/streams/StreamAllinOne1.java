package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamAllinOne1 {

	public static void main(String ...s) {
		List<String> countryList=Arrays.asList(
				new String[] {"India", "China","Nepal","Russia"}
				);
		
		System.out.println("=======================");
		System.out.println("Using anonymous class");
		System.out.println("=======================");
		
		// Using anonymous class
		countryList.stream().forEach(
				new Consumer<String>() {
					public void accept(String country) {
						country = country.toUpperCase();
						System.out.println(country);
					};
				}
				);
		System.out.println("=======================");
		System.out.println("Using lambda expression");
		System.out.println("=======================");
		
		// Using lambda expression
		countryList.stream().forEach(
					//country -> System.out.println(country)
				country -> {
					country = country.toUpperCase();
					System.out.println(country);
				  }
				);
		
		System.out.println("=======================");
		System.out.println("Using Method references");
		System.out.println("=======================");
      // Using method reference
	   countryList.stream().forEach(
			   	System.out::println
			   );
	   
	   List<String> stringList = Arrays.asList("John", "Martin", "Mary", "Steve");
	   
	   System.out.println("=======================");
		System.out.println("Using map()");
		System.out.println("=======================");
	   stringList.stream()
//	   .map( (str) -> str.toUpperCase())
	   .map( str -> str.toUpperCase())
	   .forEach(System.out::println);
	   
	   System.out.println("=======================");
		System.out.println("Using Method references");
		System.out.println("=======================");
	}

}
