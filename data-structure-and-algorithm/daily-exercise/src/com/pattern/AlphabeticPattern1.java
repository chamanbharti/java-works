package com.pattern;
/*
		  	A A A A A 
			B B B B B 
			C C C C C 
			D D D D D 
			E E E E E 
 */
public class AlphabeticPattern1 {
	
	public static void main(String[] args) {
		
		for(char i='A';i<='E';i++){//outer loop for row
			
			for(char j='A';j<='E';j++){//inner loop for column
				
				System.out.print(i+" ");
			}
			
			System.out.println();//for new line
		}
	}
}
