package com.array;

import java.util.Arrays;

public class EqualityOfTwoArrays {
	public static void main(String[] args) {
		
		int[] array1 = {1,3,2,4,5};
		int[] array2 = {1,2,3,5,4};
		
		boolean equalOrNot = true;
		Arrays.sort(array1);
		Arrays.sort(array2);
		//bubble sort
		/*for(int i=0;i<array1.length-1;i++){
			for(int j=0;j<array1.length-i-1;j++){
				if(array1[j]>array1[j+1]){
					int temp=array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=temp;
				}
			}
		}
		for(int i=0;i<array2.length-1;i++){
			for(int j=0;j<array2.length-i-1;j++){
				if(array2[j]>array2[j+1]){
					int temp=array2[j];
					array2[j]=array2[j+1];
					array2[j+1]=temp;
				}
			}
		}*/
		if(array1.length == array2.length){
			for(int i=0;i<array1.length;i++){
				if(array1[i] != array2[i]){
					equalOrNot = false;
				}
			}
		}
		else{
			equalOrNot = false;
		}
		
		if(equalOrNot){
			System.out.println("Two Arrays Are Equals");
		}
		else{
			System.out.println("Two Arrays Are not Equals");
		}
	}

}
