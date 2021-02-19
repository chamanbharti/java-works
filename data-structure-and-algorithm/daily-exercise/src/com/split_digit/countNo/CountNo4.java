package com.split_digit.countNo;

import java.util.Scanner;

public class CountNo4 {
	static int count=0;
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int count=0;
		System.out.println("Enter no: ");
		int num=input.nextInt();
		
		count=countDigits(num);
		System.out.println("Total digits are :"+count);
		input.close();
	}

	private static int countDigits(int num) {
		
		if(num!=0){
			count++;
			countDigits(num/10);
		}
		return count;
	}

}
