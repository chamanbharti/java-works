package com.pattern;
/*
		 	1 
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5 

 */
public class NumberPattern6 {
	
	public static void main(String[] args) {//main method/main thread
		
		for(int i=1;i<=5;i++){//outer loop for row
			
			for(int j=1;j<=i;j++){
				
				System.out.print(j+" ");
			}
			System.out.println();//for new line
		}
	}
}
