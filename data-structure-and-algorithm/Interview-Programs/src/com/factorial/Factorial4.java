package com.factorial;

import java.util.Scanner;

public class Factorial4 {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a no: ");
	int num = input.nextInt();
	int f=factorial(num);
	 System.out.println("Factorial of "+num+" is "+f);
   }

	private static int factorial(int num) {
		int i,f=1;
		for(i=1;i<=num;i++){
			f = f * i;
			
		}
		return f;
	}
}
