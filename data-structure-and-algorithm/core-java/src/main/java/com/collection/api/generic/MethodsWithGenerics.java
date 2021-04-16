package com.collection.api.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodsWithGenerics {

	public static void main(String[] args) {
		
		List<String> originalList = List.of("Hello","World");
		System.out.println(reverse(originalList));
		System.out.println(originalList);
		
		List<Integer> anotherlList = List.of(1,2,3,4,5);
		List<Integer> reversed = reverse(anotherlList);
		System.out.println("Reversed:"+reversed);
		System.out.println("Original:"+anotherlList);
	}
	
	private static <T> List<T> reverse(List<T> originalList){
		List<T>reverseList = new ArrayList<>(originalList);
		Collections.reverse(reverseList);
		return reverseList;
	}
}
