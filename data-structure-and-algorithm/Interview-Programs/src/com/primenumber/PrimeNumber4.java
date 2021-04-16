package com.primenumber;

import java.util.Scanner;

public class PrimeNumber4 {
	public static void main(String[] args) {
		int i,count,num,sum=0;
		
		for(num = 1;num<=100;num++){

	         count = 0;

	         for(i=2;i<=num/2;i++){
	             if(num%i==0){
	                 count++;
	                 break;
	             }
	        }
			if(count == 0 && num!= 1)
				sum = sum + num;
				System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("Sum of prime no is :"+sum);
		
	}

}
