package com.interview.array;

import java.util.HashMap;
import java.util.Map;

public class FindGivenNoIsSum3 {
		// Naive method to find a pair in an array with given sum
		public static void findPair(int[] a, int sum)
		{
			// create an empty HashMap
			Map<Integer, Integer>map = new HashMap<>();
			
			//do for each element
			for(int i=0;i<a.length;i++) {
				//check if pair (a[i], sum-a[i}) exists
				//if difference is seen before, print the pair
				if(map.containsKey(sum - a[i])) {
					System.out.println("Pair found at index "+map.get(sum - a[i])+" and "+i);
					//return;
				}
				
				//store index of current element in the map
				map.put(a[i], i);
			}
			//no pair with given sum exists in the array
			System.out.println("Pair not found");
		}

		// Find pair with given sum in the array
		public static void main (String[] args)
		{
			int a[] = { 8, 7, 2, 5, 3, 1 };
			int sum = 10;

			findPair(a, sum);
		}
	}