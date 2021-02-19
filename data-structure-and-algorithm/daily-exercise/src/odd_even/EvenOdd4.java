package odd_even;

import java.util.*;
public class EvenOdd4
{
	public static void main(String args[])
	{
		int no;
		int min;
		int max;
		int odd_sum =0,even_sum = 0;
		//int odd_sum,even_sum = 0;//wrong way declaration of local variable
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the minimum range:");
		min=input.nextInt();
		System.out.println("Enter the maximum range:");
		max=input.nextInt();
		
		System.out.println("Sum of even and odd numbers in given range is:");
		for(no=min;no<=max;no++){
			if(no%2 == 0)
				//System.out.print(no+" ");
				even_sum = even_sum+no;
			else
				odd_sum = odd_sum+no;
		}
		System.out.println("Sum of even numbers in given range is: "+even_sum);
		System.out.println("Sum of even numbers in given range is: "+odd_sum);
		
		
	}
}