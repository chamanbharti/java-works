package com.leapyear;

import java.util.Scanner;

public class LeapYear3 {
	//static int year;
	public static void main(String[] args) {
		int year;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter lowest year to check leap year");
		int min_year = input.nextInt();
		System.out.println("Enter highest year to check leap year");
		int max_year = input.nextInt();
		
		System.out.println("Leap year in given range are: ");
		for(year = min_year;year<=max_year;year++){
			
			if( (year % 4 ==0) && (year % 100!=0)|| (year % 400 ==0) )
			System.out.print(year+" ");
		}
	}

}
