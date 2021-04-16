package com.factorial;

import java.util.Scanner;

public class Factorial3{
	
	public static void main(String[] args)
	  {
		  int n,i=1,f=1;
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter no: ");
		  n = input.nextInt();
		  
		  do
		  {
			  f=f*i;
			  i++;
		  }while(i<=n);
		  
		  System.out.println("The Factorial no of 5 is "+f);
	  }
}
