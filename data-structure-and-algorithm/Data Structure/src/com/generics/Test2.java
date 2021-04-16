package com.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		Integer[]intArray = {10,20,30,40,50};
		Character[]charArray =  { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' }; 
		
		System.out.println("Printing Integer Array");
		printArray(intArray);
		System.out.println("Printing Integer Array");
		printArray(charArray);
	}

	private static<E> void printArray(E[] elements) {
		for(E element : elements){
			System.out.println(element);
		}
		
	}

}
