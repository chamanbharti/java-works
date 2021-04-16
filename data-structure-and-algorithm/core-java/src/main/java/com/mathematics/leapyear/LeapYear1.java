package mathematics.leapyear;

import java.util.Scanner;

public class LeapYear1 {
	public static void main(String[] args) {
		System.out.println("Enter year in digit");
		Scanner input = new Scanner(System.in);
		int no = input.nextInt();
		print(no);
		input.close();
	}

	private static void print(int year) {
		if((year % 400 == 0) ?(year % 100 != 0):(year % 4 == 0)) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not A Leap year");
		}
		
	}
}
