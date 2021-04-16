package com.array;

import java.util.Arrays;

public class FindDuplicateNumber3 {
	static int a =0;
	public static void main(String[] args) {
		System.out.println("");
		int[] no = {1,2,3,4,7,5,8,6,7,5,8};
		//Arrays.sort(no);
		sortArray(no);
		System.out.println("Array with sorting element");
		for(int i=0;i<no.length;i++){
			System.out.print(no[i]+" ");
		}
		System.out.println();
		//
		//System.out.println(Arrays.toString(no));
		for(int i =1;i<no.length;i++){
			if(no[i-1] == no[i] && no[i-1]!=a){
				System.out.println("Duplicate: "+no[i]);
			}
				a = no[i-1];
		}
		//removing duplicate element from array
		int length=no.length;
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				//if any two element are equal
				if(no[i]==no[j]){
					
					no[j]=no[length-1];
					length--;
					j--;
				}
			}
		}
		int uniqueArray[] = Arrays.copyOf(no,length);
		sortArray(uniqueArray);
		System.out.println("\nArray with unique element");
		for(int i=0;i<uniqueArray.length;i++){
			System.out.print(uniqueArray[i]+" ");
		}
		
	}
	private static void sortArray(int[] a) {
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}
