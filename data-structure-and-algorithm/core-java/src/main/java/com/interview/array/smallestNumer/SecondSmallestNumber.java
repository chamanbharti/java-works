package com.interview.array.smallestNumer;

import java.util.Scanner;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int[] a = {0,6,10,9,8,7,2,4,1,3,5};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) { //ascending order
				if(a[i]<a[j]) { //descending order
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.print("\nEnter which no you to find:");
		Scanner input = new Scanner(System.in);
		int highestNo = input.nextInt();
		System.out.println(a[a.length-highestNo]);
	}
}
