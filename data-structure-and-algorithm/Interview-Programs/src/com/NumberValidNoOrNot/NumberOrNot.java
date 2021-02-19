package com.NumberValidNoOrNot;

import java.util.*;
import java.util.Arrays;
public class NumberOrNot
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String n = sc.nextLine();
		/*if( Integer.parseInt(n)==Integer.valueOf(n))
		{
			System.out.println(n + "is an Integer");
		}
		else
		{
			System.out.println(n + "is NOT an Integer");
		}*/
		//this step doesn't show exception
		try {
			if( Integer.parseInt(n)==Integer.valueOf(n))
			{
				System.out.println(n + "is an Integer");
			}
			
		}catch(NumberFormatException e) {
			//new NumberFormatException(e+":"+n+" is NOT an Integer");
			System.out.println(n + " is NOT an Integer\nPlease enter integer(number)");
		}
	}
}
