package com.duplicateElements;

import java.util.Arrays;

public class DuplicateElementsInArray2 {
	public static void main(String[] args) {
		
		int[] array = {40,30,19,30,4,16,43,4,39,16,55,30};
		
		int n = array.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(array[i] == array[j]){
					array[j] = array[n-1];
					j--;
					n--;
				}
			}
		}
		
		int[] uniqueArray = Arrays.copyOf(array, n);
		int length = uniqueArray.length;
		int temp=0;
		for(int i=0;i<length-1;i++){
			for(int j=0;j<length-i-1;j++){
				if(uniqueArray[j] > uniqueArray[j+1]){
					temp = uniqueArray[j];
					uniqueArray[j]= uniqueArray[j+1];
					uniqueArray[j+1]=temp;
				}
			}
		}
		for(int i=0;i<uniqueArray.length;i++){
			System.out.print(uniqueArray[i]+"\t");
		}
	}

}
