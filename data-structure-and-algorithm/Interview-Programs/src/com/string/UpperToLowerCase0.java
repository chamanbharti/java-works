package com.string;

import java.util.Scanner;
 
public class UpperToLowerCase0 {
	
	static int i;
	public static void main(String[] args) {
		String str="";
		 
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter any string ");
		  str = input.nextLine();
		  changeString(str);
		  
	}
	static void changeString(String s){
		
		for(int i=0;i<s.length();i++){
			
			int ch = s.charAt(i);
			
			if(ch >=65 && ch <=90){
				ch = ch + 32;
				System.out.print((char)ch);
			}
			
			if(ch == 32){
				System.out.println(" ");
			}
			
		}
		
	}

}
