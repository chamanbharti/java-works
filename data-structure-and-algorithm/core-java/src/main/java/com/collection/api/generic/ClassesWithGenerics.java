package com.collection.api.generic;
/**
 * Benefits of Generics:
 * Eliminate casts
 * Provide stronger checks at compile-time
 * Enable implementation of generic classes and algorithms
 * 
 * @author Chaman.Bharti
 *
 */

import java.util.ArrayList;
import java.util.List;

public class ClassesWithGenerics {

	public static void main(String[] args) {
		/*
		List al = new ArrayList();
		al.add("hello");
		al.add(42);
		
		String hello = (String)al.get(0);
		int no = (Integer)al.get(1);
		*/
		
		/*
		List<String> al = new ArrayList<>();
		al.add("hello");
		al.add("world");
		*/
		
		/*
		Pair1 p = new Pair1("Hello","World");
		System.out.println(p);
		
		Pair1 pp = new Pair1(42,500);//CE
		*/
		
		/*
		Pair2<String>strings = new Pair2<>("Hello","World");
		Pair2<Integer>integers = new Pair2<>(42,500);
		System.out.println(strings);
		System.out.println(integers);
		
		Pair2<Person> people = new Pair2<>(new Person("Chaman"),new Person("Bharti"));
		System.out.println(people);
		*/
		
		Pair3<String,Integer> stringIntegerPair = new Pair3<>("Hello",42);
		String first = stringIntegerPair.getFirst();
		Integer second = stringIntegerPair.getSecond();
		System.out.println(first);
		System.out.println(second);
		
		
	}
	
}
