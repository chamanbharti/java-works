package com.leapyear;

import java.util.Scanner;

public class LeapYear2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year to check leap year");
		int year = input.nextInt();
		
		if(year % 400 ==0 && (year % 100 !=0) || year % 4 ==0)
			System.out.println("Leap Year");
		else
			System.out.println("not leap year");
	}

}
