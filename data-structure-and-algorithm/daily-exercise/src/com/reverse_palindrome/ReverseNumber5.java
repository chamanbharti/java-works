package com.reverse_palindrome;

import java.util.Scanner;

public class ReverseNumber5 {
	
    
	public static void main(String[] args) {
		int num,r,sum,temp;
	    int min,max;
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter Minimum Number:");
	    min = input.nextInt();
	    System.out.print("Enter Maximum Number:");
	    max = input.nextInt();
	    System.out.print("Palindrome numbers in given range are: ");
	   
	   for(num=min;num<=max;num++){
		   temp = num;
		   sum = 0;
		   while(temp>0){
			   r = temp%10;
			   temp = temp/10;
			   sum = sum * 10 + r;
		   }
		   if(num == sum)
			   System.out.print(num+" ");
	   }
	}

}
