package com.binary_decimal;

import java.util.Scanner;

public class DecimalToOctal {
	
	public String toOctal(int n){
		if(n == 0){
			return "0";
		}
		
		String octal = "";
		
		while(n>0){
			int rev = n % 8;
			octal = rev + octal;
			n	   = n / 8;
		}
		return octal;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int decimal = scanner.nextInt();
		DecimalToOctal db = new DecimalToOctal();
		String binary = db.toOctal(decimal);
		System.out.println("The Octal representation is: "+binary);
	}

}
