package com.sorting.comparable;

import java.util.Arrays;

public class ArraySortUsingWrapperClass {

	public static void main(String[] args) {
		String[] fruits = new String[] {"Pineapple","Apple", "Orange", "Banana"}; 
		Arrays.sort(fruits);
		int i = 0;
		for(String s:fruits) {
			System.out.println("fruits "+ ++i +" : "+s);
		}
	}
}
