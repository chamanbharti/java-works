package com.array;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String[] names = {"John", "Jammy", "Luke","Chaman","Aman"}; 
		System.out.println("original array:"+Arrays.toString(names));
		reverse(names);
		System.out.println("Reverse array:"+Arrays.toString(names));

	}
	private static void reverse(String[] a){
		if(a==null || a.length<2){
			return;
		}
		for(int i=0;i<a.length/2;i++){
			String temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		
		
	}

}
