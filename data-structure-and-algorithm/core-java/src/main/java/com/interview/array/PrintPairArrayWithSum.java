package com.interview.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
//https://www.geeksforgeeks.org/print-all-pairs-with-given-sum/
public class PrintPairArrayWithSum {

	public static void main(String[] args) {
//		int a[] = {1,7,2,5,3,4,3,5,9,11};
		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
		int sum = 7;
		
		printPairs(numbers,sum);
		//printPairsUsingHash(numbers,sum);
		//printPairs(numbersWithDuplicates,sum);
		printPairsUsingHash(numbersWithDuplicates,sum);
		printPairsUsingSet(numbersWithDuplicates,sum);
	}
	public static void printPairsUsingSet(int[] numbers, int n){ 
		System.out.println("Using Set");
		if(numbers.length < 2){ 
			return; 
			} 
		Set set = new HashSet(numbers.length); 
		for(int value : numbers){ 
			int target = n - value; // if target number is not in set then add 
			if(!set.contains(target)){ 
				set.add(value); 
				}else { 
					System.out.printf("(%d, %d) %n", value, target); 
					} 
			} 
		}

	private static void printPairsUsingHash(int[] arr, int sum) {
		System.out.println("Using Map");
		// Store counts of all elements in map m
	    HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
	 // Traverse through all elements
	    
	    for(int i = 0; i < arr.length; i++) 
	    {
	         
	        // Search if a pair can be formed with arr[i].
	        int rem = sum - arr[i];
	        if (mp.containsKey(rem)) 
	        {
	            int count = mp.get(rem);
	             
	            for(int j = 0; j < count; j++)
	                System.out.print("(" + rem + "+" + arr[i] +")" + " = "+sum+"\n");
	        }
	        if (mp.containsKey(arr[i]))
	        {
	            mp.put(arr[i], mp.get(arr[i]) + 1);
	        }
	        else
	        {
	            mp.put(arr[i], 1);
	        }
	    }
	}

	private static void printPairs(int[] a, int sum) {
		//complexity of this solution is O(n^2)
		for(int i=0;i<a.length;i++) {
		//for (int j = 0; j < n; j++) {/Is the reverse of pair is acceptable
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==sum) {
					System.out.println("("+a[i]+"+"+a[j]+") = "+sum);
				}
			}
		}
		
	}
}
