package com.binary_decimal;

import java.util.Scanner;

public class DecimalToBinary {
	
	int count0 = 0;
	int count1 = 0;
	public String toBinary(int n){
		if(n == 0){
			return "0";
		}
		
		String binary = "";
		
		while(n>0){
			int rev = n % 2;
			if(rev == 0){
				count0++;
			}
			else{
				count1++;
			}
			binary = rev + binary;
			n	   = n / 2;
		}
		System.out.println("Total no of 0: "+count0);
		System.out.println("Total no of 1: "+count1);
		return binary;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int decimal = scanner.nextInt();
		DecimalToBinary db = new DecimalToBinary();
		String binary = db.toBinary(decimal);
		System.out.println("The binary representation is: "+binary);
	}

}
