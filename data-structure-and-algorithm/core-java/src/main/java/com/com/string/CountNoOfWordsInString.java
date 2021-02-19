package com.string;

import java.util.Scanner;

public class CountNoOfWordsInString {
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		String[] words = s.trim().split(" ");
		System.out.println("Number of words in the string = "+words.length);
	}

}
