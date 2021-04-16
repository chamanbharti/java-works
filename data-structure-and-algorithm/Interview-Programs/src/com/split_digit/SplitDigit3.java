package com.split_digit;

import java.util.Scanner;

public class SplitDigit3 {
	public static void main(String[] args) {
		
		int num,temp,i;
		int factor=1;
		int count1=0;
		int count2=0;
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
			if(i==1){
				count1++;
			}
			if(i==2){
				count2++;
			}
			num=num % factor;
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("1 comes "+count1+" times");
		System.out.println("2 comes "+count2+" times");
		input.close();
	}

}
