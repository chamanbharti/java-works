package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Student implements Comparable<Student>{
	int roll;
	String name;
	int age;
	public Student(int roll, String name, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int compareTo(Student s) {
		//for age
		/*if(age == s.age) {
			return 0;
		}else if(age<s.age) {
			return 1;
		}else {
			return -1;
		}*/
		return name.compareTo(s.name);
	}
	public String toString() {
		return "[ID="+roll+" NAME="+name+" Age="+age;
	}
}
public class ObjectSort {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Chaman",60);
		Student s2 = new Student(2,"Rahi",25);
		Student s3 = new Student(10,"Ganesh",40);
		
		ArrayList<Student>al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al);
		System.out.println(al);
		System.out.println("Sorted Student By Name:");
		Collections.sort(al,new NameSort());
		System.out.println(al);
		System.out.println("Sorted Student By Age:");
		Collections.sort(al, new AgeSort());
		System.out.println(al);
	}
}
