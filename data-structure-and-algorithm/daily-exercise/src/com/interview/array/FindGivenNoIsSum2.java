package com.interview.array;

import java.util.Arrays;

public class FindGivenNoIsSum2 {
		// Naive method to find a pair in an array with given sum
		public static void findPair(int[] a, int sum)
		{
			// sort array in ascending order
			Arrays.sort(a);
			//now is in form of [1,2,3,4,5,6,7,8]
			
			//maintain two indices pointing to end points of the array
			int low=0;
			int high = a.length - 1;
			
			//reduce search space a[low..high] at each iteration of loop
			//loop till low is less than high
			while(low<high) {
				//sum found
				if(a[low] + a[high] == sum) {
					System.out.println("Pair found at index "+low+ " and "+high);
				}
				
				//increment low index if total is less than the desired sum
				//decrement high index is total is more than the sum
				if(a[low] + a[high] < sum) {
					low++;
				}else {
					high--;
				}
			}
			//No pair with given sum exists in the array
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