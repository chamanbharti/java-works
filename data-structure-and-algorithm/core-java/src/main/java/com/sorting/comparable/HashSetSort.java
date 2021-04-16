package com.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HashSetSort {

	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<String>();
//		Set<String> fruits = new LinkedHashSet<String>();
        
	    fruits.add("Pineapple");
	    fruits.add("Apple");
	    fruits.add("Orange");
	    fruits.add("Banana");
	    System.out.println("HashSet element before sorting : ");
	    int i = 0;
		for(String s:fruits) {
			System.out.println("fruits "+ ++i +" : "+s);
		}
		
	 // Sorting HashSet using List
	    List<String>list = new ArrayList<>(fruits);
	    Collections.sort(list);
	    System.out.println("HashSet element in sorted order : ");

	    i = 0;
		for(String s:list) {
			System.out.println("fruits "+ ++i +" : "+s);
		}
		
		// Sorting HashSet using TreeSet
		//Set<String>treeSet = new TreeSet<>(fruits); // Approach I
		Set<String>treeSet = new TreeSet<>(); // Approach II
		treeSet.addAll(fruits);
		System.out.println("HashSet element in sorted order using TreeSet : ");
		 i = 0;
		for(String s:treeSet) {
			System.out.println("fruits "+ ++i +" : "+s);
		}
		
		
		System.out.println("HashSet element in sorted order using java 8 : ");
		// java 8 way to sort it would be
		List<String>sortedFruits = fruits.stream()
		.sorted(Comparator.comparing(String::length))//comparator - how you want to sort it
		.collect(Collectors.toList());// collector - what you want to collect it 
		 i = 0;
		for(String s:sortedFruits) {
			System.out.println("fruits "+ ++i +" : "+s);
		}
	}
}
