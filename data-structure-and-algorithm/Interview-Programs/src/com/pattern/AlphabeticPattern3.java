package com.pattern;
/*
		  	E E E E E 
			D D D D D 
			C C C C C 
			B B B B B 
			A A A A A 
 */
public class AlphabeticPattern3 {
	
	public static void main(String[] args) {
		
		for(char i='E';i>='A';i--){//outer loop for row
			
			for(char j='E';j>='A';j--){//inner loop for column
				
				System.out.print(i+" ");
			}
			
			System.out.println();//for new line
		}
	}
}
