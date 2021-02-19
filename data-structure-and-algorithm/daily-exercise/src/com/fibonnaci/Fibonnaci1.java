package com.fibonnaci;

import java.util.Scanner;

public class Fibonnaci1 {
	public static void main(String[] args) {
		
		int first=0,second=1,next,i;
		long sum = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no :");
		int n = input.nextInt();
		// step 1
		/*for(i=0;i<n;i++){
			
			if(i<=1)
				next = i;
			else{
				next = first + second;
				first = second;
				second = next;
			}
			System.out.print(next+" ");
		}*/
		
		// step 2
		System.out.print(first+" "+second+" ");
		for(i=2;i<n;i++){
			
			next = first + second;
			first = second;
			second = next;
			//sum of fibonnaci no.
			sum = sum + second;
			System.out.print(next+" ");
		}
		System.out.println();
		System.out.print("Sum of fibonacci: "+sum);
		
	}

}
