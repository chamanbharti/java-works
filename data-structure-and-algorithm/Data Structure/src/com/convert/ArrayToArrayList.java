package com.convert;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		//Convert Array to ArrayList
		String[] countries = {"India", "Switzerland", "Italy", "France"};
		System.out.println("Array of countries: "+countries);// [Ljava.lang.String;@15db9742
		//System.out.println("ArrayList of countries: "+Arrays.toString(countries));
		
		List list = Arrays.asList(countries);
		System.out.println("ArrayList of countries: "+list); 
		/*
		 * The above code will work great. But list object is immutable.
		 * hus you will not be able to add new values to it. 
		 * In case you try to add new value to list, it will throw UnsupportedOperationException.
		 */
		list.add("China");//UnsupportedOperationException
		
		/*int[] a = {1,2,3,4,5,6,7};
		System.out.println("Array : "+a);//Array : [I@15db9742
		System.out.println("Array : "+Arrays.toString(a));//Array : [1, 2, 3, 4, 5, 6, 7]
		
		List list = Arrays.asList(a);
		System.out.println("ArrayList of a: "+list);*/
	}

}
