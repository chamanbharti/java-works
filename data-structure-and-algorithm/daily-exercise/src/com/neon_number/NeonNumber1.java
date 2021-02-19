package com.neon_number;

import java.util.Scanner;
/*
	A neon number is a number where the sum of digits of square
	of the number is equal to the number itself.
	
		for example:
		9 is a neon number. Its square is 9*9=81 and sum of 
		the digits (8+1) is 9.
		1 is also a neon number.
		
		Note: Except 1 and 9 there are no more neon numbers between 1 to n
		
*/
public class NeonNumber1 {

	public static void main(String[] args) {
		
		int num,sqr,sum=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number ");
		num = input.nextInt();
		
		sqr=num*num;
		
		while(sqr!=0) {
			sum=sum+sqr%10;
			sqr=sqr/10;
		}
		if(sum==num) {
			System.out.println(num+" is neon number");
		}
		else {
			System.out.println(num+" is not neon number");
		}
	}
}
