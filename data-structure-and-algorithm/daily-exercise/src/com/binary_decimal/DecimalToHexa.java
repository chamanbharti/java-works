package com.binary_decimal;

import java.util.Scanner;

public class DecimalToHexa {
	
	public String toHexa(int n){
		
		if(n == 0){
			return "0";
		}
		
		String hexa = "";
		
		while(n>0){
			int rev = n % 16;
			if(rev < 10)
				rev	=rev + 48;
			else
				rev = rev + 55;
			
			hexa = rev + hexa;
			n	   = n / 16;
		}
		return hexa;
	}
	public static void main(String[] args) {
		int i = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int decimal = scanner.nextInt();
		DecimalToHexa dh = new DecimalToHexa();
		String hexa = dh.toHexa(decimal);
		System.out.println("The Hexa representation is: ");
		for(int j=i-1;j>0;j--){
			System.out.println(hexa);
		}
	}
}
