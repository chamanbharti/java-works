package com.string;

import java.io.IOException;
import java.util.Scanner;

public class CheckVowelConstant {
	public static void main(String[] args) throws IOException{
		char ch;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter character: ");
		ch = input.next().charAt(0);
		if( (ch=='a') || (ch=='e') || (ch=='i')|| (ch=='o')|| (ch=='u')||  (ch=='A') || (ch=='E') || (ch=='I')|| (ch=='O')|| (ch=='U'))
			System.out.println("given character is vowel");
		else
			System.out.println("character is constant");
		
	}

}
