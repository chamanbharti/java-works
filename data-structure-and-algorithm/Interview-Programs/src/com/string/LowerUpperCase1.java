package com.string;

import java.util.Scanner;
 
public class LowerUpperCase1 {
	
	static int i;
	public static void main(String[] args) {
		String str="";
		 
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter any string ");
		  str = input.nextLine();
		  String upper = str.toUpperCase();
		  String lower = str.toLowerCase();
		  
		  System.out.println("UpperCase is "+upper);
		  System.out.println("LowerCase is "+lower);
		  
	}
	
		

}
