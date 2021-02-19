package com.pattern;
/*
		 	12345
			12345
			12345
			12345
			12345
 */
public class NumberPattern2 {
	
	public static void main(String[] args) {//main method/main thread
		
		for(int i=1;i<=5;i++){//outer loop for row
			
			for(int j=1;j<=5;j++){//inner loop for column
				
				System.out.print(j);
			}
			
			System.out.println();//for new line
		}
	}
}
