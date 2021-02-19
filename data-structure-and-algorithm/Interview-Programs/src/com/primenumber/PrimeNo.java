package com.primenumber;
import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any no to find prime no:");
		int n=input.nextInt();
		
		for(int i=1;i<n;i++){
			boolean isPrime=true;
			for(int j=2;j<i;j++){
				if(i%j==0)
					isPrime=false;
					break;
				
				}
			
			if(isPrime)
				System.out.println(i+" ");
			}
		}
	}

