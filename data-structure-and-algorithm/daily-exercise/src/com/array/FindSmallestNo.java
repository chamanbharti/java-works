package com.array;

public class FindSmallestNo {
	public static void main(String[] args) {
				int[] no = {8,9,2,3,4,1,5,6,7,10};
				//Arrays.sort(no);
				int small = no[0];
				int index=0;
				for(int i =1;i<no.length;i++){
					if(small > no[i]){
					//if(no[i] < small){
						small = no[i];
						index=i;
					}
					
				}
				System.out.println("smallest No: "+small);
				System.out.println("smallest Index: "+index);
	}

}
