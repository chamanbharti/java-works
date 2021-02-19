package com.array;

import java.util.Arrays;

public class FindSecondLargestNo3 {
	public static void main(String[] args) {
		
		int nums[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
		int maxOne = 0;
		int maxTwo = 0;
		for (int i=0;i<nums.length; i++)
		{
			if (maxOne < nums[i])
			{
				maxTwo = maxOne;
				maxOne = nums[i];
			}
			else if (maxTwo < nums[i])
			{
				maxTwo = nums[i];
			}
		}
		System.out.println("Largest Number: " + maxOne);
		System.out.println("Second Largest Number: " + maxTwo);
		
	}

}
