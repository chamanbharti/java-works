package com.armstrongnumber;

import java.util.Scanner;
//program to print Armstrong numbers from 1 to 500
public class ArmStrongNumber5 {
	public static void main(String[] args) {
		int num,r,sum=0,temp;
		
		for(num=1;num<=500;num++){
			temp = num;
			//sum = 0;
			if(num % 2 !=0){
				System.out.print(num+" ");
			}
		}
	}

}
