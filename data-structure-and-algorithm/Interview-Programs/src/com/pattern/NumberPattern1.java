package com.pattern;
/*
		 1  1  1  1  1 
		 2  2  2  2  2 
		 3  3  3  3  3 
		 4  4  4  4  4 
		 5  5  5  5  5 
 */
public class NumberPattern1 {
	
	public static void main(String[] args) {//main method/main thread
		
		//for(int i=5;i>=1;i--){//outer loop for row
		for(int i=1;i<=5;i++){//outer loop for row
			
			for(int j=1;j<=5;j++){//inner loop for column
				
				System.out.print(" "+i+" ");
			}
			
			System.out.println();//for new line
		}
	}
}
