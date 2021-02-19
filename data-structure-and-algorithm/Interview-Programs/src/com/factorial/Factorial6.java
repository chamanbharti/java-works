package com.factorial;

public class Factorial6 {
  public static void main(String[] args)
  {
	  int n=5;
	  
	  int result=factorial(n);
	  
	  System.out.println("The Factorial no of 5 is "+result);
  }
  
  public static int factorial(int n)
  {
	  if(n==0)
	  {
		  return 1;
	  }
	  
	  else
	  {
		  return n*factorial(n-1);
	  }
  }
}
