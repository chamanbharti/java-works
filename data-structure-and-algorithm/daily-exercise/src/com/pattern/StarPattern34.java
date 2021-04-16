package com.pattern;
/*
		*****
		 ****
		  ***
		   **
		    * 
 */
public class StarPattern34 {
	
	public static void main(String[] args) {//main method/main thread
		int n=5;
		for(int i=1;i<=n;i++){//outer loop for row
			
			for(int j=1;j<=n;j++){//inner loop for column to print space
				if((j==1|| j==n)||(i==1||i==n))
					System.out.print(j);
				else
					System.out.print(" ");//print space
			}
			System.out.println();//for new line
		}
	}
}
