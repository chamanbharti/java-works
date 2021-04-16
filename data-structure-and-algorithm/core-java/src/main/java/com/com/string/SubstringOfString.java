package com.string;

import java.util.Scanner;

public class SubstringOfString {
	public static void main(String[] args) {
		String str,substr;
		int i,c,length;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string ");
		str = scanner.nextLine();
		length = str.length();
		System.out.println("Enter length of string is: "+length);
		for (c = 0; c < length; c++) {
			for (i = 1; i <= length-c; i++) {
				substr = str.substring(c + i);
				System.out.println(substr);
			}
		}
	}

}
