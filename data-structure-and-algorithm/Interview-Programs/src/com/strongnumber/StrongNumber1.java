package com.strongnumber;

import java.util.Scanner;

public class StrongNumber1 {
	public static void main(String[] args) {
		
		int sum=0,temp;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = input.nextInt();
		
		temp = num;
		while(num!=0){
			int i=1,f=1;
			int r = num%10;
			
			while(i<=r){
				f = f*i;
				i++;
			}
			sum = sum + f;
			num = num / 10;
		}
		if(sum == temp)
			System.out.println(temp+" is strong number");
		else
			System.out.println(temp+" is not strong number");
	}

}
