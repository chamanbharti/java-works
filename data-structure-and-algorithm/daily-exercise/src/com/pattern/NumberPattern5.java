package com.pattern;
/*
		 	1 
			2 2 
			3 3 3 
			4 4 4 4 
			5 5 5 5 5 

 */
public class NumberPattern5 {
	
	public static void main(String[] args) {//main method/main thread
		
		for(int i=1;i<=5;i++){//outer loop for row
			
			for(int j=1;j<=i;j++){
				
				System.out.print(i+" ");
			}
			System.out.println();//for new line
		}
	}
}
