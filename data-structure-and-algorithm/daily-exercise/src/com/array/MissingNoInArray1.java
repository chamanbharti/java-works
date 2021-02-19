package com.array;

import java.util.Arrays;

public class MissingNoInArray1{
	
	static int[] a= {3,5,4,8,44};
	//static int[] a = {1,4,5,3,7,8,6};
	public static void main(String[] args){

		displayMissing();
		
}
	private static void displayMissing() {

		System.out.println("Given array(already sorted): ");
		for(int j = 0;j<a.length;j++){
			System.out.print(a[j]+" ");//display it
		}
		System.out.println();
		Arrays.sort(a);
		System.out.print("Sorted Array:"+Arrays.toString(a)+"\n");
		int j=0;
		for(int i=1;i<=44;i++){
			if(j<a.length && i==a[j])
				j++;
			else
				System.out.print(i+" ");
		}
	}
	
}
