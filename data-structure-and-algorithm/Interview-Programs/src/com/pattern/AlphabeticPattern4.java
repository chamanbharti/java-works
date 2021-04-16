package com.pattern;
/*
		  	E D C B A 
			E D C B A 
			E D C B A 
			E D C B A 
			E D C B A 
 */
public class AlphabeticPattern4 {
	
	public static void main(String[] args) {
		
		for(char i='E';i>='A';i--){//outer loop for row
			
			for(char j='E';j>='A';j--){//inner loop for column
				
				System.out.print(j+" ");
			}
			
			System.out.println();//for new line
		}
	}
}
