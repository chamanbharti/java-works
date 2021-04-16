package com.array;

import java.util.Scanner;

//Rotation an array from right to left by position n
public class RotateArrayRight2Left {
	public static void main(String[] args) {
		System.out.println("array from right to left rotation");
		int[]a = new int[5];
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 10 element into array");
		for(int i=0;i<a.length;i++){
			a[i] = input.nextInt();
		}
		System.out.println("Enter the position where you want to start rotation");
		n=input.nextInt();
		
		System.out.println("Array before rotation");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
		rightRotate(a,n);
		System.out.println();
		System.out.println("Array after rotation");
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	private static void rightRotate(int[] a,int k){
		if(a == null || k < 0){
			throw new IllegalArgumentException("Illegal Argument");
		}
		for(int i=0;i<k;i++){
			for(int j=a.length-1;j>0;j--){
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
	}

}
