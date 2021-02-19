package com.perfectnumber;

import java.util.Scanner;

/*
Definition of perfect number or what is perfect number?
Perfect no is a positive no which sum of all positive divisors excluding that is equal to that no. For example 6 is perfect no since divisor of 6 are 1,2,and 3.
sum of its divisor is 
1 + 2 + 3 = 6
Note: 6 is the smallest perfect number.

Next perfect number is 28 since 1+ 2 + 4 + 7 + 14 = 28
Some more perfect numbers: 496, 8128
*/
public class PerfectNumber1 {
	public static void main(String[] args) {
		
		int i,sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n =input.nextInt();
		
		for(i=1;i<n;i++) {
			if(n%i==0) {
				sum = sum + i;
			}
		}
		if(sum==n){
			System.out.println(i+" is a perfect number");
		}
		else{
			System.out.println(i+" is not a perfect number");
		}
		
	}
}
