package com.conversion.array2set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayToSet {

	public static void main(String[] args) {
		/* Array  to be converted */ 
		String[] numbers=new String[]{"One","Two","Three","One","Six"};
		
		//Approach I
		Set<String>set = new HashSet<>();
		for(int i=0;i<numbers.length;i++) {
			set.add(numbers[i]);
		}
		System.out.println("Using Approach I");
		set.forEach(System.out::println);
		
		System.out.println("Using Approach II");
		Set<String>set2 = new HashSet<>(Arrays.asList(numbers));
		set2.forEach(System.out::println);
		
		System.out.println("Using Approach III");
		Set<String>set3 = new HashSet<>();
		Collections.addAll(set3, numbers);
		set3.forEach(System.out::println);
		
		System.out.println("Using Approach IV");
//		Set<String>set4 = Set.of(numbers);//java.lang.IllegalArgumentException: duplicate element: One
//		Set<String>set4 = Arrays.stream(numbers).collect(Collectors.toSet());
		Set<String>set4 = Set.copyOf(Arrays.asList(numbers));//since java 10
		set4.forEach(System.out::println);
	}
}
