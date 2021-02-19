package com.fibonnaci;

import java.util.Scanner;

public class Fibonnaci2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no :");
		int n = input.nextInt();
		// step 1
		/*int first=0,second=1,next;
		System.out.print(first+" "+second+" ");
				while(n>2){
					
					next = first + second;
					first = second;
					second = next;
					System.out.print(next+" ");
					n--;
				}*/
		
		// step 2
		int first=-1,second=1,next,i;
		while(n>0){
			
			next = first + second;
			first = second;
			second = next;
			System.out.print(next+" ");
			n--;
		}
		
	}

}
