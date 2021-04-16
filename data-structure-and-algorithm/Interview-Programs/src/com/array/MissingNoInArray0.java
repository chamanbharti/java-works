package com.array;

public class MissingNoInArray0 {
	public static void main(String[] args) {
		int n=8;
		int [] a = {1, 4, 5, 3, 7, 8, 2};
		
		//Step 1
		int sumOfNnumbers = sumOfNnumbers(n);
		
		//Step 2
		int sumOfElements = sumOfElements(a);
		
		//Step 3
		int missingNumber = sumOfNnumbers - sumOfElements;
		System.out.println("Missing Number is "+missingNumber);
	}
	
	static int sumOfNnumbers(int n){
		int sum = n*(n+1)/2;
		return sum;
	}
	
	static int sumOfElements(int [] array){
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum = sum + array[i];
		}
		return sum;
	}
	

}
