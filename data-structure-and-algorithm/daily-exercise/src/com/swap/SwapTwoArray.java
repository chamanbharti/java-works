package com.swap;

import java.util.Scanner;

public class SwapTwoArray {
	public static void main(String[] args) {
		int a[]=new int [5];
		int b[]=new int [5];
		int c[]=new int [5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Array ");
		for(int i=0;i<a.length;i++){
			a[i] = input.nextInt();
		}
		
		System.out.println("Enter Second Array ");
		for(int i=0;i<b.length;i++){
			b[i] = input.nextInt();
		}
		
		//swap logic
		for(int i=0;i<a.length;i++){
			c[i] = a[i];
			a[i] = b[i];
			b[i] = c[i];
		}
		System.out.println("Array After Swapping");
		System.out.println("First Array");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		System.out.println("Second Arary");
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+"\t");
		}
	}

}
