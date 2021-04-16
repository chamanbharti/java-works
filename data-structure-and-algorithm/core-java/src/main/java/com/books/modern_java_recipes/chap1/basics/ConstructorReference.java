package com.books.modern_java_recipes.chap1.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
interface A{
	public Sample get();
}
class Sample{
	Sample(){
		System.out.println("Constructor");
	}
}
public class ConstructorReference {

	public static void main(String[] args) {
		
		//using lambda expression
		A a = () -> {
			Sample s = new Sample();
			return s;
		};
		Sample s1 = a.get();
		System.out.println(s1);
		
		A aa = Sample::new;
		Sample s2 = aa.get();
		System.out.println(s2);
		
		
		List<String> names = Arrays.asList("Grace Hopper", "Barbara Liskov", "Ada Lovelace",
				"Karen Spärck Jones");
		// Converting a list of people to a list of names
		//List<String>namesList = names.stream().map(person -> person.getn)
		
		// Transforming strings into Person instances
		List<Person> people = names.stream().map(name -> new Person(name)).collect(Collectors.toList());
		System.out.println(people);
		// or alternatively
		List<Person> people2 = names.stream().map(Person::new).collect(Collectors.toList());
		System.out.println(people2);
		
		// A copy constructor for Person
		// Converting a list to a stream and back
		/*
		Person before = new Person("Grace Hopper");
		List<Person> people3 = Stream.of(before).collect(Collectors.toList());
		Person after = people3.get(0);
		System.out.println(before == after);
		before.setName("Grace Murray Hopper");
		System.out.println("Grace Murray Hopper".equals(after.getName()));
		*/
		// Using the copy constructor
		Person before = new Person("Grace Hopper");
		List<Person> people3 = Stream.of(before).map(Person::new).collect(Collectors.toList());
		Person after = people3.get(0);
		System.out.println(before == after);
		before.setName("Rear Admiral Dr. Grace Murray Hopper");
		System.out.println(before.equals(after));
		
		// Varargs constructor
		// A Person constructor that takes a variable argument list of String
		// Using the varargs constructor
		List<Person> people4 = names.stream()
				.map(name -> name.split(" "))
				.map(Person::new)
				.collect(Collectors.toList());
		System.out.println("Varargs ctor, names=" + people4);
		
		// Creating an array of Person references
		Person[] people5 = names.stream().map(Person::new).toArray(Person[]::new);
		System.out.println(Arrays.toString(people5));
		
		
	}
}
