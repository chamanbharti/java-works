package com.split_digit;

import java.util.Scanner;

public class SplitDigit2 {
	public static void main(String[] args) {
		
		int num,temp,i;
		int factor=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter no :");
		num=input.nextInt();
		
		//temp=num;
		for(temp=num;temp>0;temp=temp/10){
	
			factor=factor*10;
		}
		
		System.out.println("Each digits of given no are :");
		while(factor>1){
			factor=factor/10;
			i=num/factor;
			
			num=num % factor;
			System.out.print(i+" ");
			
		}
		input.close();
	}

}
