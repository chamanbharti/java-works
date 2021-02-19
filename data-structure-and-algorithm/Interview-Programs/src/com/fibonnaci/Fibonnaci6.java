package com.fibonnaci;

import java.util.Scanner;

public class Fibonnaci6 {
	
	public static void main(String[] args) {
		
		int first=0,second=1,next,i=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter no :");
		int n = input.nextInt();
		System.out.println(first+" "+second);
		int f=Fibonnaci(n);
		System.out.println(f);
			
		
	}
	static int Fibonnaci(int n) {
		
		 if(n == 0){
			 return 0; 
		 }
			
		 else if(n == 1){
			 return 1;
		 }
			
		 else {
			 return (Fibonnaci(n-1) + Fibonnaci(n-2));
		 }
		 
			 
	}
	/*static void Fibonnaci(int n) {
		//int first=0,second=1,next;
		 while(n>0){
			 next = first + second;
			 first = second;
			 second = next;
			 System.out.print(next+" ");
			 n--;
			 
		 }
			
	}*/
	/*static void Fibonnaci(int n) {
		int first=0,second=1,next;
		 while(n>0){
			 next = first + second;
			 first = second;
			 second = next;
			 System.out.print(next+" ");
			 Fibonnaci(n-1);
			 
		 }
			
	}*/

}
