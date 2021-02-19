package com.strongnumber;

import java.util.Scanner;

public class StrongNumber2 {
	public static void main(String[] args) {
		
		int num,i,f,r,sum,temp;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter mininum range: ");
		int min = input.nextInt();
		System.out.println("Enter maximum range: ");
		int max = input.nextInt();
		System.out.println("Strong numbers in given range are: ");
		
		for(num=min; num <= max; num++){
		      temp = num;
		      sum=0;

		      while(temp!=0){
		           i=1;
		           f=1;
		           r=temp%10;

		           while(i<=r){
		             f=f*i;
		             i++;
		           }
		         sum=sum+f;
		         temp=temp/10;
		      }
		        
		      if(sum==num)
		           System.out.print(num+" ");
		  }
  }
}
