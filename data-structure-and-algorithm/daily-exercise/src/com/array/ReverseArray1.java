package com.array;

import java.util.Arrays;

public class ReverseArray1 {
	public static void main(String[] args) {
		
		int [] a = {8,10,3,45,5,6,9,2,1};
		System.out.println("Array Befor Reverse:");
		//bubble sort logic
		/*for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}*/
		for(int i = 0;i<a.length;i++)
		System.out.print(a[i]+" ");
		System.out.println();
		reverse(a);
	}

	private static void reverse(int[] a) {
		int temp;
		int length= a.length;
		for(int i = 0;i<length/2;i++){
			temp = a[i];
			a[i]=a[length-1-i];
			a[length-1-i]=temp;
		}
		//System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}

}
