package com.pattern;
/*
		*****
		 ****
		  ***
		   **
		    * 
 */
public class StarPattern130 {
	
	public static void main(String[] args) {//main method/main thread
		int n=5;
		int l=5;
		for(int i=1;i<=n;i++){//outer loop for row
			
			for(int j=1;j<i;j++){//inner loop for column to print space
				
				System.out.print(" ");//print space
			}
			for(int k=1;k<=l;k++){//inner loop for column(decreasing order)
				System.out.print("*");
			}
			l--;
			System.out.println();//for new line
		}
	}
}
