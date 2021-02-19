package com.spynumber;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		
		int n,sum=0,prod=1;
		int num;
		int d;//last digit
		System.out.println("Enter number ");
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		num=n;
		while(n>0) {
			d=n%10;
			sum=sum+d;
			prod=prod*d;
			n=n/10;
		}
		if(sum==prod) {
			System.out.println(num+" is spy number");
		}else {
			System.out.println(num+" is not spy number");
		}
	}
}
