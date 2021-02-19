package com.pattern;

import java.util.Scanner;

public class NumberInputPattern {
	public static void main(String[] args) {
		//Print * or digit according to given input number
		System.out.println("Enter the number");
		int number=new Scanner(System.in).nextInt();
		
		int remainder,counter=0;
		int store[]=new int[20];//array to store remainder
		while(number!=0){
			remainder=number%10;
			number = number/10;
			store[counter++]=remainder;
		}
		while(counter!=0){
			counter=counter-1;
			System.out.println();
			for(int i=1;i<=store[counter];i++){

				//System.out.print(" * ");
				System.out.print(i);
			}
		}
	}

}
