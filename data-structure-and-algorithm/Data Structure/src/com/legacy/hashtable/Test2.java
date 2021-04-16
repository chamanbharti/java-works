package com.legacy.hashtable;

import java.util.Hashtable;

public class Test2 {
	public static void main(String[] args) {
		Hashtable<String, Integer> numbers= new Hashtable<String, Integer>();
	   numbers.put("one", 1);
	   numbers.put("two", 2);
	   numbers.put("three", 3);
	//To retrieve a number, use the following code:

	   
	   Integer n = numbers.get("two");
	   if (n != null) {
	     System.out.println("two = " + n);
	   }
	}

}
