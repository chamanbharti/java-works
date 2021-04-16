package com.interview.pattern.star;
//https://www.javatpoint.com/how-to-print-pattern-in-java
public class StarPrint1 {

	/**
	 
	 * 
	 * *
	 * * *
	 * * * *
	 
	 */
	public static void main(String[] args) {
		int row=4;
		//int col=4; j has used as col
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
