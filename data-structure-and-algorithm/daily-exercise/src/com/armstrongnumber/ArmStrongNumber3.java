package com.armstrongnumber;

import java.util.Scanner;
//program to print Armstrong numbers from 1 to 500
public class ArmStrongNumber3 {
	public static void main(String[] args) {
		int num,r,sum=0,temp;
		
		for(num=1;num<=500;num++){
			temp = num;
			//sum = 0;
			while(temp!=0){
				r = temp % 10;
				temp = temp /10;
				sum = sum + (r*r*r);
			}
		}
		if(sum == num)
			System.out.println(num);
	}

}
