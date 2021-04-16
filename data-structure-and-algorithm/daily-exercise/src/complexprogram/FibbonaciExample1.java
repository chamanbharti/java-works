package complexprogram;

import java.util.Scanner;

public class FibbonaciExample1 {
	public static void main(String[] args) {
		 int n, first = 0, second = 1, next, i;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the number of terms ");
		 n = in.nextInt();
		 
		   System.out.print("First terms of Fibonacci series are :-");
		 System.out.println();
		   for ( i = 0 ; i < n ; i++ )
		   {
		      if ( i <= 1 )
		         next = i;
		      else
		      {
		         next = first + second;
		         first = second;
		         second = next;
		      }
		      System.out.println(next);
		   }
		 
	}

}
