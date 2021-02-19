package com.array;

import java.util.Arrays;

public class FindSecondLargestNo0 {
	public static void main(String[] args) {
		
		int nums[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
		exchangeSort(nums);
		bubbleSort(nums);
		System.out.println("Largest Number:"+nums[nums.length-1]);
		System.out.println("Second Largest Number:"+nums[nums.length-2]);
		System.out.println("Third Largest Number:"+nums[nums.length-3]);
	}
	//step 1
	private static int exchangeSort(int a[]){
		int temp=0;
		//exchange sort
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				//if(a[i]>a[j]){//ascending order
				if(a[i]<a[j]){//descending order
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Descending order");
		for(int no:a){
			System.out.print(no+" ");
		}
		System.out.println();
		return temp;
	}
	
	//step 2
	/*private static int[] Exchangesort(int a[]){
		int temp=0;
		//exchange sort
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}*/
	
	private static int[] bubbleSort(int[] a){
		int temp=0;
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){//ascending order
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Ascending order");
		for(int no:a){
			System.out.print(no+" ");
		}
		System.out.println();
		return a;
	}

}
