package com.split_digit.countNo;

import java.util.Scanner;

public class CountNo2 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int count=0;
		System.out.println("Enter no: ");
		int num=input.nextInt();
		/*do{
			num=num/10;
			count++;
		}(num>0);*/
		for(;num>0;num=num/10){
			count++;
		}
		System.out.println("Total digits are :"+count);
		input.close();
	}

}
