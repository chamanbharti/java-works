package com.pattern;
/*
		  	*
		  	**
			***
			****
			*****
 */
public class StarPattern2 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){//outer loop for row
			
			for(int j=1;j<=i;j++){//inner loop for column(increasing order)
				
				System.out.print("*");
			}
			
			System.out.println();//for new line
		}
	}
}
