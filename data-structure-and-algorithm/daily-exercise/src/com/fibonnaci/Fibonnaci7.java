package com.fibonnaci;

import java.util.Scanner;

public class Fibonnaci7 {

	public static void main(String[] args) {
		int next;
		int first=0;
		int second=1;
		System.out.println("Enter no to find fibonacci series");
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		/*while(true) {
			next = first + second;
			
			if(next>=n) {
				break;
			}
			first = second;
			second = next;
			System.out.print(next+" ");
		}*/
		/*for(int i=0;i<n;i++) {
			next = first + second;
			first = second;
			second = next;
			System.out.print(next+" ");
		}*/
		/*while(n>0) {
			next = first + second;
			first = second;
			second = next;
			System.out.print(next+" ");
			n--;
		}*/
		do {
			next = first + second;
			first = second;
			second = next;
			System.out.print(next+" ");
			n--;
		}while(n>0);
		
		
	}
}
