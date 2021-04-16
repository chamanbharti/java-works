package com.square;

import java.util.Scanner;

public class FindSquareRoot {
	public static void main(String[] args) {
		//Find given number's square root
		System.out.println("Enter a number to find it's square root");
		double num=new Scanner(System.in).nextDouble();
		System.out.println("The Square root of "+num+" is = "+sqrt(num));
		System.out.println(Math.sqrt(num));
	}
	private static double sqrt(Double n){
		double t;
		double squareRoot=n/2;
		do{
			t=squareRoot;
			squareRoot=(t+(n/t))/2;
		}while((t-squareRoot)!=0);
		return squareRoot;
	}

}
