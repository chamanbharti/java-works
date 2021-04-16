package com.books.modern_java_recipes.chap1.basics;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Person {

	private String name;
	public Person() {}
	public Person(String name) {
	this.name = name;
	}
	
	// A copy constructor for Person
	public Person(Person p) {
		this.name = p.name;
	}
	
	// Varargs constructor
	// A Person constructor that takes a variable argument list of String
	public Person(String... names) {
		this.name = Arrays.stream(names).collect(Collectors.joining(" "));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "[name=" + name + "]";
	}
	
}
