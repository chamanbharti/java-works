package com.reverse_palindrome;

import java.util.Scanner;

public class ReverseNumber4 {
	static int sum = 0,r;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num,reverse;
	    System.out.print("Enter The Number:");
	    num = input.nextInt();
	    //LOOP recusion FINDING THE REVERSE OF A NUMBER
	   
	    reverse=rev(num);
	    System.out.printf("The Reverse Number of %d is %d\n",num,reverse);
	    if(sum==num)
	    	System.out.println("Number is palindrome!");
	    else
	    	System.out.println("Number is not palindrome!");
}

	private static int rev(int num) {
		if(num>0){
			r=num%10;
	        sum=sum*10+r;
	        rev(num/10);
		}
		else
			return 0;
		return sum;
	}
}
