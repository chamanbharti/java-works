package com.java8.flat_map_flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class OneToOne {

	public static void main(String[] args) {
		
		/**
		 * Java 8 stream api provides map() and flatMap() method.
		 * Both these methods are intermediate methods and returns another stream as part of the output
		 * 
		 * map() method used for transformation
		 * flatMap() used for transformation & flattering
		 * flatMap() -> map() + flattering
		 * 
		 * 
		 * map() method used for transformation
		 * 
		 * map() takes stream<T> as input and return stream<R>
		 * stream<R> map(Stream<T> input){}
		 * <R> stream<R> map(Function<? super T, ? extends R> mapper);
		 * It's mapper function produces single value for each input value.
		 * hence it is also called One-To-One mapping.
		 * 
		 * * flatMap()-> map() + flattering
		 * 
		 * flatMap() takes stream<stream<T>> as input and return stream<R>
		 * stream<R> map(Stream<Stream<T> input){}
		 * <R> stream<R> flatMap(Function<? super T, ? extends stream<? extends R>> mapper);
		 * It's mapper function produces multiple value for each input value.
		 * hence it is also called One-To-Many mapping.
		 */
		
		List<Customer>customers = FakeDatabase.getAll();
		// List<Customer> convert List<String> -> Data Transformation
		// mapping: customer -> customer.getEmail
		//          customer -> customer.getEmail() -> one to one mapping
		List<String>emails = customers.stream()
				.map(customer -> customer.getEmail())
				.collect(Collectors.toList());
		System.out.println(emails);
		
		//customer -> customer.getPhoneNumbers() -> one to many mapping
		List<List<String>>phoneNumbers = customers.stream()
				.map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println(phoneNumbers);
		
		List<String>phoneNumbers2 = customers.stream()
				.flatMap(customer -> customer.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println(phoneNumbers2);
	}
}
