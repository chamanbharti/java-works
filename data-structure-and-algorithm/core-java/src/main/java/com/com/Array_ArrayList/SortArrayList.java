package com.Array_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("India");
		   listofcountries.add("US");
		   listofcountries.add("China");
		   listofcountries.add("Denmark");

		   /*Unsorted List*/
		   System.out.println("Before Sorting:");
		   for(String counter:listofcountries){
			   System.out.println(counter);
		   }
		   //Sort statement
		   Collections.sort(listofcountries);
		   //Sorted List
		   System.out.println("After Sorting:"); 
		   for(String counter:listofcountries){
			   System.out.println(counter);
		   }
		   /* Sorting in decreasing order*/
		   Collections.sort(listofcountries, Collections.reverseOrder());

		   /* Sorted List in reverse order*/
		   System.out.println("ArrayList in descending order:");
		   for(String str:listofcountries){
			   System.out.println(str);
		   }
	}

}
