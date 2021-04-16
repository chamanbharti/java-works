package com.binary_decimal;

import java.util.Scanner;

public class DecimalToOctal2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int decimal = scanner.nextInt();
		System.out.println("The Octal representation is: "+Integer.toOctalString(decimal));
	}

}
