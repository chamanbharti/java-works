package com.sorting.comparable;

public class Student implements Comparable<Student> 
{
	public String name;
	public int age;

	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student person) {
		
		// ascending order
		// return name.compareTo(person.name);
		
		// descending order
		// return person.name.compareTo(name);
		
		// insertion order
		return person.name.compareTo(person.name);

	}
}
