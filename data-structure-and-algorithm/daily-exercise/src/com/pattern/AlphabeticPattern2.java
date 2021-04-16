package com.pattern;
/*
		  	A B C D E 
			A B C D E 
			A B C D E 
			A B C D E 
			A B C D E 
 */
public class AlphabeticPattern2 {
	
	public static void main(String[] args) {
		
		for(char i='A';i<='E';i++){//outer loop for row
			
			for(char j='A';j<='E';j++){//inner loop for column
				
				System.out.print(j+" ");
			}
			
			System.out.println();//for new line
		}
	}
}
