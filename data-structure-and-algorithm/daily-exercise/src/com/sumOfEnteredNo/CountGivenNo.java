package com.sumOfEnteredNo;

import java.util.Scanner;

public class CountGivenNo {
	public static void main(String[] args) {
		
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Ente digit: ");
		//if user enter 12345678910 then Exception in thread "main" java.util.InputMismatchException: For input string: "12345678910"
		int num = input.nextInt();
		
		while(num > 0){
			num = num / 10;
			count++;
		}
		System.out.println("Total Digits: "+count);
	}

}
