package com.array;

import java.util.Scanner;

//Modify a value into an array at specific index
public class ReplaceElementFromArray {

	public static void main(String[] args) {
		System.out.println("Modify a value into an array at specific index");
		Scanner input = new Scanner(System.in);
		int[]a = new int[5];
		
		System.out.println("Enter the 5 element into array");
		for(int i=0;i<a.length;i++){
			a[i]=input.nextInt();
		}
		
		System.out.println("Enter the position where you want to modify the element");
		int pos=input.nextInt();
		
		System.out.println("Enter new value");
		a[pos-1]=input.nextInt();
		
		System.out.println("Modified Array:");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
