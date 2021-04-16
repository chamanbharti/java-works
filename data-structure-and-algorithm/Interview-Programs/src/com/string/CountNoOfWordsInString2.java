package com.string;

import java.util.Scanner;

public class CountNoOfWordsInString2 {
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		
		int count=1;
		for(int i=0;i<s.length()-1;i++){
			if( (s.charAt(i) == ' ') && (s.charAt(i+1) !=' ') ){
				count++;
			}
		}
		System.out.println("Number of words in the string = "+count);
	}

}
