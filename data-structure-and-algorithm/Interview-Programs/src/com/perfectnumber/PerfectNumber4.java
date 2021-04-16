package com.perfectnumber;
import java.util.Scanner;
public class PerfectNumber4 {
	static int n,i,sum;
	public static void main(String[] args) {
		
		int min,max;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the minimum range: ");
		min =input.nextInt();
		System.out.println("Enter the maximum range: ");
		max =input.nextInt();
		
		
		for(n=min;n<=max;n++){
			i=1;
			sum=0;
			while(i<n){
				if(n%i == 0)
					sum = sum + i;
				    i++;
			}
		}
		if(sum==n)
			 System.out.printf("%d ",n);
		
		
	}
}
