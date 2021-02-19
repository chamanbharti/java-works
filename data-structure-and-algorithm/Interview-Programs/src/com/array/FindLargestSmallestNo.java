package com.array;

public class FindLargestSmallestNo {
	
	static int i;
	int j;
	static int large;
	static int small;
	
	public static void main(String[] args) {
		
		int[] a = {2,3,4,1,6,7,8};
		
		large = a[0];
		
		for(i=1;i<a.length;i++){
			if(a[i]>large)
			//if(large < a[i])
				large = a[i];
		}
		System.out.println("Large No: "+large);
		
		small = a[0];
		
		for(i=1;i<a.length;i++){
			if(a[i]<small ){
			//if(small > a[i]){
				
				small = a[i];
			}
		}
		System.out.println("Smallest No: "+small);
	}

}
