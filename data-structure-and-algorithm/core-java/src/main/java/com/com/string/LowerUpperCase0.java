package com.string;

import java.util.Scanner;
 
public class LowerUpperCase0 {
	
	static int i;
	public static void main(String[] args) {
		String str="";
		 
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter any string ");
		  str = input.nextLine();
		  changeString(str);
		  checkString(str);
	}
	static void changeString(String str){
		
		for(int i=0;i<str.length();i++){
			
			int ch = str.charAt(i);
			
			if(ch >= 97 && ch <=122){
				
				ch = ch -32;
				System.out.print((char)ch);
			}
			if(ch == 32){
				System.out.println("");
			}
		}
	}
		
		static void checkString(String str){
			char[] s;
			
			for(int i=0;i<str.length();i++){
				
				int ch = str.charAt(i);
				
				if(ch >= 97 && ch <=122){
					
					ch = ch -32;
					//s=ch;
					System.out.print((char)ch);
				}
				if(ch == 32){
					System.out.println("");
				}
			}
	}
	
		

}
