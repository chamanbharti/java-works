package com.interview.duplicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		List<String> elements=new ArrayList<>();
		elements.add("One");
		elements.add("Three");
		elements.add("Two");
		elements.add("Three"); /*Duplicate Element*/
		elements.add("Four");
		elements.add("Five");
		elements.add("Four"); 	/*Duplicate Element*/
		System.out.println("Before Operation:"+elements);
		/* Approach I
		//remove duplicate
		Set<String>set = new HashSet<>();
		for(String s:elements) {
			set.add(s);
		}
		
		*/
		
		/*
		 Approach II
		//remove duplicate and find duplicacy count
		Set<String>set = new HashSet<>();
		Set<String>duplicate = new HashSet<>();
		for(String s:elements) {
			if(!set.add(s)) {
				duplicate.add(s);
			}
		}
		System.out.println("After Operation:"+set);
		System.out.println("Duplicate:"+duplicate);
		*/
		
		/*
		//Approach III
		Set<String>duplicate = new HashSet<>();
		Collections.sort(elements);
		for(int i=1;i<elements.size();i++) {
			if(elements.get(i-1).equals(elements.get(i))) {
				duplicate.add(elements.get(i));
			}
		}
		System.out.println("Duplicate:"+duplicate);
		
		*/
		
		/*
		// Approach IV Remove duplicate element
		Set<String>removedDuplicate = new HashSet<>(elements);
		System.out.println("removedDuplicate:"+removedDuplicate);
		*/
		
		//Maintained insertion order
		Set<String>removedDuplicate = new LinkedHashSet<>(elements);
		System.out.println("removedDuplicate:"+removedDuplicate);
	}
}
