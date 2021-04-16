package com.binary_decimal;

import java.util.Scanner;

public class HexaToDecimal {
	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter any decimal number: ");
	    String decimal = scanner.nextLine();
	    System.out.println("Hexadecimal number converted to decimal number");
        System.out.println("Decimal number is : " +Integer.parseInt(decimal, 16));
        System.out.println("Octal number is : " +Integer.parseInt(decimal, 8));
	   
	   
	}
}
