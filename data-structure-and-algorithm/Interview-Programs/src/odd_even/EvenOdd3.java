package odd_even;

import java.util.*;
public class EvenOdd3
{
	public static void main(String args[])
	{
		int no;
		int min;
		int max;
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the minimum range:");
		min=input.nextInt();
		System.out.println("Enter the maximum range:");
		max=input.nextInt();
		
		/*System.out.print("Sum of even numbers in given range is:");
		for(no=min;no<=max;no++){
			if(no%2 == 0)
				//System.out.print(no+" ");
				sum = sum+no;
		}
		System.out.print(sum);*/
		
		System.out.print("Sum of odd numbers in given range is:");
		for(no=min;no<=max;no++){
			if(no%2 != 0)
				//System.out.print(no+" ");
				sum = sum+no;
		}
		System.out.print(sum);
	}
}