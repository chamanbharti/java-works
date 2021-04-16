package com.array;

import java.util.Arrays;

public class EqualityOfTwoArrays4 {
	public static void main(String[] args) {
		
		 String[][] s1 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
		 
	        String[][] s2 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
	 
	        System.out.println(Arrays.deepEquals(s1, s2));     //Output : true
	         
	        //Calling equals() method on same arrays will return false
	         
	        System.out.println(Arrays.equals(s1, s2));        //Output : false
	         
	        //That's why use deepEquals() method to compare multidimensional arrays
	}

}
