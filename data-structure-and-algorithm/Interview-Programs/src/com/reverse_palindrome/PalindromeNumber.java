package com.reverse_palindrome;
import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		int sum = 0;
		int r = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = input.nextInt();
		
		int temp=num;
		while(num!=0){
			r=num%10;
			num = num/10;
			sum = sum*10+r;
		}
		System.out.println("Reverse No :"+sum);
		if(temp==sum)
			System.out.println(temp+" is palindrome");
		else
			System.out.println(temp+" is not palindrome");
	}

}
