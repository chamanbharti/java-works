package com.factorial;
import java.util.Scanner;
public class Factorial2 {
	
	public static void main(String[] args)
	  {
		  int n,i=1,f=1;
		  @SuppressWarnings("resource")
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter no: ");
		  n = input.nextInt();
		  
		  while(i<=n)
		  {
			  f=f*i;
			  i++;
		  }
		  
		  System.out.println("The Factorial no of 5 is "+f);
	  }
}
