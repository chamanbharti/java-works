package com.factorial;

import java.util.Scanner;

public class Factorial5 {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a no: ");
	int num = input.nextInt();
	
	int f=factorial(num);
	 System.out.println("Factorial of "+num+" is "+f);
   }

	private static int factorial(int num) {
		if(num==0)
			return 1;
		else
			return (num*(factorial(num-1)));
		//return (num*(factorial(num)));//Exception in thread "main" java.lang.StackOverflowError
	}
}
