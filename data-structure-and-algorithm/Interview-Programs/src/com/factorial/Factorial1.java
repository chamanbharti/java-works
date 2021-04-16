package com.factorial;

import java.util.Scanner;

public class Factorial1 {
  public static void main(String[] args)
  {
	  int n,i,f=1;
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter no: ");
	  n = input.nextInt();
	  
	  for(i=1;i<=n;i++)
	  {
		  f=f*i;
	  }
	  
	  System.out.println("The Factorial no of 5 is "+f);
  }
}
