package com.pattern;
/*
		 5  5  5  5  5 
		 4  4  4  4  4 
		 3  3  3  3  3 
		 2  2  2  2  2 
		 1  1  1  1  1 
 */
public class NumberPattern3 {
	
	public static void main(String[] args) {//main method/main thread
		
		for(int i=5;i>=1;i--){//outer loop for row
			
			for(int j=1;j<=5;j++){//inner loop for column
				
				System.out.print(" "+i+" ");
			}
			
			System.out.println();//for new line
		}
	}
}
