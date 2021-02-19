package com.reverse_palindrome;

import java.util.Scanner;

public class ReverseNumber2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int i,num,r,s=0;
	     
	    System.out.print("Enter The Number:");
	    num = input.nextInt();
	    i=num;
	    //LOOP while FINDING THE REVERSE OF A NUMBER
	   
	    while(num>0)
	    {
	        r=num%10;
	        s=s*10+r;
	        num=num/10;
	    }
	     
	    System.out.printf("The Reverse Number of %d is %d\n",i,s);
	    if(s==i)
	    	System.out.println("Number is palindrome!");
	    else
	    	System.out.println("Number is not palindrome!");
}
}
