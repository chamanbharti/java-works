package com.armstrongnumber;

import java.util.Scanner;

public class ArmStrongNumber1 {
	public static void main(String[] args) {
		int num,r,sum=0,temp;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the minimum range: ");
		int min = input.nextInt();
		System.out.println("Enter the maximum range: ");
		int max = input.nextInt();
		
		for(num=min;num<=max;num++){
			temp = num;
			sum = 0;
			while(temp!=0){
				r = temp % 10;
				temp = temp/10;
				sum = sum + (r*r*r);
			}
		}
		if(sum == num)
			System.out.printf("Armstrong numbers in given range are %d ",num);
		return;
	}

}
