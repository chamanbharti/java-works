package com.reverse_palindrome;

import java.util.Scanner;

public class ReverseNumber1 {
	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			int i,num,r,s=0;
		     
		    System.out.print("Enter The Number:");
		    num = input.nextInt();
		     
		    //LOOP FOR FINDING THE REVERSE OF A NUMBER
		    for(i=num;i>0; )
		    {
		        r=i%10;
		        s=s*10+r;
		        i=i/10;
		    }
		   /* for(;num!=0;num=num/10)
		    {
		        r=num%10;
		        s=s*10+r;
		       // i=i/10;
		    }*/
		   /* i=num;
		    for(;i!=0;i=i/10)
		    {
		        r=num%10;
		        s=s*10+r;
		       // i=i/10;
		    }*/
		    System.out.printf("The Reverse Number of %d is %d\n",num,s);
		    if(s==num)
		    	System.out.println("Number is palindrome!");
		    else
		    	System.out.println("Number is not palindrome!");
		    
	}
}
