package com.array;

import java.util.Scanner;
//Searching an element in array 
public class SearchElementInArray {
	public static void main(String[] args) {
		System.out.println("Searching an element in array ");
		Scanner input = new Scanner(System.in);
		int[]a = new int[5];
		
		System.out.println("Enter the element into array");
		for(int i=0;i<a.length;i++){
			a[i]=input.nextInt();
		}
		
		System.out.println("Enter the element for searching");
		int n=input.nextInt();
		
		int i=0;
		while(a[i]!=n){
			i++;
		}
		System.out.println(n+" is found at index "+(i+1));
		
	}

}
