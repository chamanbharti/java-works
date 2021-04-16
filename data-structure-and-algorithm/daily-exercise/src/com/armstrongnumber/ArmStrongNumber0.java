package com.armstrongnumber;

import java.util.Scanner;

public class ArmStrongNumber0 {
	public static void main(String[] args) {
		int r,sum=0,temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter No: ");
		int num = input.nextInt();
		
		int count=0;
		temp = num;
			//num = num/10;
			while(num!=0){
						r = num % 10;
						num = num/10;
						sum = sum + (r*r*r);
					}
					
				
		if(sum == temp)
			System.out.printf("%d is an Armstrong number",temp);
		else
			System.out.printf("%d is not an Armstrong number",temp);
	}

}
