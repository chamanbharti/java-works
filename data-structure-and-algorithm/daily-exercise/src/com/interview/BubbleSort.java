package com.interview;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {

	public static void main(String[] args) {
		Integer[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23}; 
		
		System.out.println("Sorted Array:");
		//Arrays.sort(a);
		//Arrays.sort(a,0,3);
		Arrays.sort(a,Collections.reverseOrder());
		
		for(int i=0;i<10;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//bubble(a);
		
	}
	public static void bubble(int[] a) {
		
		/*for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}*/
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]<a[j+1]) {//< for descending and > for ascending
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.print("Sorted Array:\n");
		for(int i=0;i<10;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
