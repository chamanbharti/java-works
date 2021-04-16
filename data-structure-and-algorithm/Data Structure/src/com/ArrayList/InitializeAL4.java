package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class InitializeAL4 {

	public static void main(String[] args) {
		
	ArrayList<String> cities = new ArrayList<String>(Collections.nCopies(10, "Chaman"));
			
	 System.out.println("content of ArrayList cities: "+cities);
	 
	 
	 ArrayList<Integer> intList = new ArrayList<Integer>(Collections.nCopies(10, 5));
	 System.out.println("ArrayList items: "+intList);
	}
}
