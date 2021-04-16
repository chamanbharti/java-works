package com.netprophet;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] array1 = {76,23,45,23,7,193,654,324,24};
		//collection api
		//Arrays.sort(array1);
		//System.out.println("Ascending order:"+Arrays.toString(array1));
		int[] array2 = bubbleSort(array1);
		int n = array2.length;
		
		/*for(int i=0;i<n;i++){
			System.out.print(array2[i]+",");
		}*/

		for(int i:array2){
			System.out.print(i);
			System.out.print(" , ");
		}
	}

	private static int[] bubbleSort(int[] array1) {
		int temp;
		for(int i=0;i<array1.length - 1;i++){
			for(int j=0;j<array1.length - i - 1;j++){
				if(array1[j] > array1[j+1]){//ascending order
				//if(array1[j] < array1[j+1]){//descending order
					temp = array1[j];
					array1[j] = array1[j+1];
					array1[j+1] = temp;
				}
			}
		}
		return array1;
	}
}
