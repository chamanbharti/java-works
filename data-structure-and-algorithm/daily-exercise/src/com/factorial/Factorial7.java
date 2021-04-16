package com.factorial;
import java.util.Scanner;//to be able to use scanner predefined function for input
 
class Factorial7 {
	
	//static long f=1;
  public static void main(String[] args)
  {
	 // long f=1;
	  int i,num,min,max;
	  
	  Scanner input=new Scanner(System.in);// input is an object and you can choose your own too.
	  System.out.println("Enter the minimum range: ");
	  min = input.nextInt();

	  System.out.println("Enter the maximum range: ");
	  max = input.nextInt();

	  System.out.print("Factorial series in given range: ");
	  
	 for(num=min;num<=max;num++){
		 
		long f=1;
		 for(i=1;i<=num;i++)
			 {
			 	f = f*i;
			 }
			
			 System.out.print(f+" ");
	 }

  }
  
}

