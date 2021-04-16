package com.sumOfEnteredNo;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int reverse = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no...");
		int num = input.nextInt();
		
		
		// Step 1
		while(num>0){
			int remainder = num % 10;
			num = num / 10;
			reverse = reverse * 10 + remainder;
			
		}
	//	Step 2
		/*for(; num!= 0; num = num /10){
			int remainder = num % 10;
			//num = num / 10;
			reverse = reverse * 10 + remainder;
			
		}*/
	/*	Step 3
		while(num!=0){
			int remainder = num % 10;
			num = num / 10;
			reverse = reverse * 10 + remainder;
		}
		*/
		System.out.println("Reverse No is :"+reverse);
		
	}

}
