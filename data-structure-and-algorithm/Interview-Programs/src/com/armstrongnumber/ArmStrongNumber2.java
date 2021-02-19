package com.armstrongnumber;

import java.util.Scanner;
//Armstrong number in c using for loop
public class ArmStrongNumber2 {
	public static void main(String[] args) {
		int r,sum=0,temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter No: ");
		int num = input.nextInt();
		
		//temp = num;
		for(temp=num;num!=0;num=num/10){
			r = num % 10;
			sum = sum + (r*r*r);
		}
		if(sum == temp)
			System.out.printf("%d is an Armstrong number",temp);
		else
			System.out.printf("%d is not an Armstrong number",temp);
	}

}
