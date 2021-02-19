package com.interview;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		
		Student s1 = new Student("Bharti", 12);
		Student s2 = new Student("Bharti", 12);
		
		Set<Student> hs = new HashSet<>();
		hs.add(s1);
		hs.add(s2);
		//before hashCode()
		System.out.println(s1.equals(s2));//true
		//before equals and hashCode()
		System.out.println("The Size of HashSet:"+hs.size());//The Size of HashSet:2
		//after equals and hashCode()
		System.out.println("The Size of HashSet:"+hs.size());//The Size of HashSet:1
	}

}
