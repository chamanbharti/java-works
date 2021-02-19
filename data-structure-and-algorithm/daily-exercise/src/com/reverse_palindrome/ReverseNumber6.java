package com.reverse_palindrome;

import java.util.Scanner;

public class ReverseNumber6 {
	
	public static void main(String[] args) {
		
		String original,reverse = "";
		Scanner input = new Scanner(System.in);
		
		/*System.out.println("Enter a string to check if it is palindrome");
		original = input.nextLine();
		
		int length = original.length();
		
		for(int i = length - 1; i >= 0; i--){
			reverse = reverse + original.charAt(i);	
		}
		if(original.equals(reverse))
			System.out.println("entered string is palindrome!");
		else
			System.out.println("entered string is not palindrome!");*/
		// step 2 using command prompt
		//StringBuffer sb1 = new StringBuffer(args[0]);
		StringBuilder sb1 = new StringBuilder(args[0]);
		StringBuffer sb2 = new StringBuffer(sb1);
		sb1.reverse();
		System.out.println("Given string is:"+sb2);
		System.out.println("Reverse string is:"+sb1);
		if(String.valueOf(sb1).compareTo(String.valueOf(sb2)) == 0)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
