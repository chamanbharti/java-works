package com.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p = new Person(1, "Chaman");
		Person p1 = new Person(2, "Chaman");
		Person p2 = new Person(2, "Chaman");
		
		Set<Person> sh = new HashSet<Person>();
		
		sh.add(p);
		sh.add(p1);
		sh.add(p2);
		
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
	}
}
