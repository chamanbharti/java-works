package com.binary_decimal;

import java.util.Scanner;

public class DecimalToBinary2 {
	
	int count0 = 0;
	int count1 = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int decimal = scanner.nextInt();
		System.out.println("Binar no is : "+Integer.toBinaryString(decimal));
	}

}
