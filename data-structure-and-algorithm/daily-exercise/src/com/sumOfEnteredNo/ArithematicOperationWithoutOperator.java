package com.sumOfEnteredNo;

import java.util.Scanner;

public class ArithematicOperationWithoutOperator {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first no...");
		int num1 = input.nextInt();
		System.out.println("Enter second no...");
		int num2 = input.nextInt();
		
		 int sum = num1 - (-num2);//addition
		//int sum = num1 - ~num2 - 1;
		 
		 int sum2 = num1 + ~num2 + 1;//subtraction
		System.out.printf("Sum of two integers: %d",sum);
		System.out.printf("Sum of two integers: %d",sum2);
	}

}
