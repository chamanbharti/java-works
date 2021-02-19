package com.neon_number;

import java.io.IOException;

public class NeonNumber3 {

	public static void main(String[] args) throws IOException {
		//printing neon number upto 10000
		for(int i = 1;i<=10000;i++) {
			if(checkNeon(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	static boolean checkNeon(int x) {
		//storing the square of x
		int sqr = x * x;
		
		//calculating the sum of sum of digits of square
		int sum_digits = 0;
		while(sqr!=0) {
			sum_digits = sum_digits + sqr % 10;
			sqr = sqr / 10;
		}
		return (sum_digits == x);
		
	}
}
