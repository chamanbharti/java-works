package com.collection.api.generic;

public class GenericMethod {

	public static <E> void printArray(E[] elements) {
		for(E element: elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	public static <Chaman> void printArray2(Chaman[] elements) {
		for(Chaman element: elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] intArray = { 10, 20, 30, 40, 50 };  
		 System.out.println("Printing Integer Array");  
	     printArray( intArray  );
	     Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	      System.out.println("Array doubleArray contains:");
	      printArray(doubleArray);   // pass an Integer array
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	      System.out.println("Array charArray contains:");
	      printArray(charArray);   // pass an Integer array
	      String[] stringArray = { "Hello", "Java", "Python", "JS" };
	      System.out.println("Array stringArray contains:");
	      printArray2(stringArray);   // pass an Integer array
	}
}
