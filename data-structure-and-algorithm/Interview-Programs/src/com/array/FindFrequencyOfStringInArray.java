package com.array;

import java.util.Scanner;

public class FindFrequencyOfStringInArray {

	public static void main(String[] args) {
		
		String[] arr = {"aba","baba","aba","xzxb"}; 
        String[] q   = {"aba","xzxb","ab"}; 
        answerQueries(arr, q);
		
	}
	    /* Returns count of occurrences of s in arr[] */
	    static int search(String[]arr, String s) 
	    { 
	            int counter = 0; 
	            for (int j = 0; j < arr.length; j++) 
	  
	                /* checking if string given in query is 
	                  present in the given string. If present, 
	                  increase times*/
	                if (s.equals(arr[j])) 
	                    counter++; 
	  
	           return counter; 
	    } 
	  
	    static void answerQueries(String[] arr, String q[]) 
	    { 
	        for (int i=0;i<q.length; i++) 
	            System.out.print(search(arr, q[i]) + " "); 
	    } 
}
