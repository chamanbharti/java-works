package com.primenumber;

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String[] args) {
		int i,num,count;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Max range: ");
		int n =input.nextInt();
		
		for(num = 1;num<=n;num++){
			count = 0;
		
		for(i=2;i<=num/2;i++){
			if(num%i==0){
				count++;
				break;
			}
		}
		if(count == 0 && num!= 1)
			System.out.print(num+" ");
	}


	}
}
