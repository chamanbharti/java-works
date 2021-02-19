package com.sumOfEnteredNo;

//http://www.cquestions.com/2010/06/write-c-program-to-find-out-sum-of.html
//http://javaconceptoftheday.com/sum-of-all-digits-of-a-number-in-java/
public class SumOfEnteredNo {
	public static void main(String[] args) {
		
		sumOfAllDigits(12345);
		 
       sumOfAllDigits(416872);
 
        sumOfAllDigits(5674283);
 
        sumOfAllDigits(475496215);
	}

	private static void sumOfAllDigits(int i) {

		/*
		 Step 1
		 int sum =0;
		while(i>0){
			int remainder = i % 10;
			i = i / 10;
			sum = sum + remainder;
			
		}*/
	/*	Step 2
		int sum =0;
		for(; i!= 0; i = i /10){
			int remainder = i % 10;
			//i = i / 10;
			sum = sum + remainder;
			
		}*/
		int sum =  0;
		while(i!=0){
			int remainder = i % 10;
			i = i / 10;
			sum = sum + remainder;
		}
		System.out.println(sum);
	}



}
