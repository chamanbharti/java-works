package complexprogram;

import java.util.Scanner;
//Fibonacci series program in java using recursion
public class FibbonaciExample2 {
	public static void main(String[] args) {
		int n, i = 0, c;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the number of terms ");
		 n = in.nextInt();
		 
		   System.out.print("First terms of Fibonacci series are :-");
		 System.out.println();
		   for ( c = 1 ; c <= n ; c++ )
		   {
		      System.out.println(Fibonacci(i));
		      i++;
		   }
		 
	}
	static int Fibonacci(int n)
	{
	   if ( n == 0 )
	      return 0;
	   else if ( n == 1 )
	      return 1;
	   else
	      return ( Fibonacci(n-1) + Fibonacci(n-2) );
	} 

}
