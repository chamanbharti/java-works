package com.perfectnumber;
import java.util.Scanner;

public class PerfectNumber3 {
	public static void main(String[] args) {
		
		int n,i=1,sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no: ");
		n =input.nextInt();
			do {
				if(n%i == 0)
					sum = sum + i;
				    i++;
			}while(i<n);
			if(sum==n){
				System.out.println(i+" is a perfect number");
			}
			else{
				System.out.println(i+" is not a perfect number");
			}
	}
}
