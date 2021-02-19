package com.set.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class SortArrayList {
	public static void main(String[] args) {
		Set<String> listofcountries = new HashSet<String>();
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
		  // Collections.sort(listofcountries);
		   //Sorted List
		   System.out.println("After Sorting:"); 
		   for(String counter:listofcountries){
			   System.out.println(counter);
		   }
		    //Sorting in decreasing order
		 //  Collections.sort(listofcountries, Collections.reverseOrder());

		   // Sorted List in reverse order
		   System.out.println("ArrayList in descending order:");
		   for(String str:listofcountries){
			   System.out.println(str);
		   }
	}

}
