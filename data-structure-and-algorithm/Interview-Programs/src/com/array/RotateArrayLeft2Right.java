package com.array;

import java.util.Scanner;
//Rotation an array from left to right by position n
public class RotateArrayLeft2Right {
	public static void main(String[] args) {
		System.out.println("array from left to right rotation");
		int[]a = new int[5];
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the 10 element into array:");
		for(int i=0;i<a.length;i++){
			a[i] = input.nextInt();
		}
		System.out.println("Enter the position of array where you want to start rotation ");
		n=input.nextInt();
		
		System.out.println("Array before rotation");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		leftRotate(a,n);
		
		System.out.println();
		System.out.println("Array after rotation");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	private static void leftRotate(int[]a,int k){
		if(a == null || k<0){
			throw new IllegalArgumentException("Illegal Argument");
		}
		for(int i=0;i<k;i++){
			for(int j=0;j<a.length-1;j++){
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
		
	}
}
