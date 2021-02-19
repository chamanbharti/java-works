package com.pattern;
/*
		 	5 4 3 2 1 
			5 4 3 2 1 
			5 4 3 2 1 
			5 4 3 2 1 
			5 4 3 2 1 
 */
public class NumberPattern4 {
	
	public static void main(String[] args) {//main method/main thread
		
		for(int i=5;i>=1;i--){//outer loop for row
			
			for(int j=5;j>=1;j--){//inner loop for column(ascending order)
				
				System.out.print(j+" ");
			}
			
			System.out.println();//for new line
		}
	}
}
