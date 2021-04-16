package com.Array_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayInitialization {
	public static void main(String[] args) {
		// 1 step
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("Chaman","Bharti","Rahi","Akela"));
		System.out.println("Elements are:"+al);
		
		// 2 step
			   ArrayList<String> cities = new ArrayList<String>(){{
				   add("Delhi");
				   add("Agra");
				   add("Chennai");
				   }};
			  System.out.println("Content of Array list cities:"+cities);
	     // 3
			  ArrayList<String> books = new ArrayList<String>();
			   books.add("Java Book1");
			   books.add("Java Book2");
			   books.add("Java Book3");
			  System.out.println("Books stored in array list are: "+books);
		// 4
			  ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
			  System.out.println("ArrayList items: "+intlist);
			  ArrayList<String> stringlist = new ArrayList<String>(Collections.nCopies(10, "Chaman"));
			  System.out.println("ArrayList items: "+stringlist);
	}

}
