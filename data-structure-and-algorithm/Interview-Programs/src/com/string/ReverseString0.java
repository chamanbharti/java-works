package com.string;

import java.io.IOException;

public class ReverseString0 {
	
	static int i,c=0,res;
	public static void main(String[] args) throws IOException{
		
		System.out.println("Original String is: ");
		System.out.println("Java Concept Of The Day");
		ReverseString0.stringReverse("Java Concept Of The Day");
	}

	public static void stringReverse(String string) {
		
		char ch[] = new char[string.length()];
		
		for(i=0;i<string.length();i++)
			ch[i] = string.charAt(i);
		
		for(i=string.length()-1;i>=0;i--)
			System.out.print(ch[i]);
		
	}

}
