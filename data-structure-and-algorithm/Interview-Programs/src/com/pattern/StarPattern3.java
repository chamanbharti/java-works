package com.pattern;
/*
		  	*****
			****
			***
			**
			*
 */
public class StarPattern3 {
	
	public static void main(String[] args) {//main method/main thread
		
		for(int i=1;i<=5;i++){//outer loop for row
			
			for(int j=5;j>=i;j--){//inner loop for column(decreasing order)
				
				System.out.print("*");
			}
			
			System.out.println();//for new line
		}
	}
}
