package odd_even;

import java.util.*;
public class EvenOdd2
{
	public static void main(String args[])
	{
		int no;
		int min;
		int max;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the minimum range:");
		min=input.nextInt();
		System.out.println("Enter the maximum range:");
		max=input.nextInt();
		
		/*System.out.println("Even numbers in given range are:");
		for(no=min;no<=max;no++){
			if(no%2 == 0)
				System.out.print(no+" ");
		}*/
		
		System.out.println("Odd numbers in given range are:");
		for(no=min;no<=max;no++){
			if(no%2 != 0)
				System.out.print(no+" ");
		}
	}
}