package com.interview.reverse;

public class ReverseArrayElement {
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6};
		System.out.println("Before Reverse Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		reverseArray(a);
	}

	private static void reverseArray(int[] a) {
		
		if(a == null || a.length < 2) return;
		
		System.out.print("\nAfter Reverse Array\n");
		for(int i=0;i<a.length/2;i++) {
			int temp = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = temp;
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
