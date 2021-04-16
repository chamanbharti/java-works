package com.primenumber;

import java.util.Scanner;

public class PrimeNumber0 {
	public static void main(String[] args) {
		int i,count=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num =input.nextInt();
		
		for(i=2;i<=num/2;i++){
			if(num%i==0){
				count++;
				break;
			}
		}
		if(count == 0 && num!= 1)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");
	}

}
