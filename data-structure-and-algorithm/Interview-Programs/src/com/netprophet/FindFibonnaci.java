package com.netprophet;

import java.util.Scanner;

public class FindFibonnaci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no to find fibonnaci series..");
		int n = input.nextInt();
		
		int first=-1,second=1;
		int next;
		do{
			
				next = first + second;
				first = second;
				second = next;
			
			System.out.print(next+" ");
			n--;
		}while(n>0);
	}

}
