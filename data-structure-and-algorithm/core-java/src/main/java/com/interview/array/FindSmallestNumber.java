package com.interview.array;

public class FindSmallestNumber {

	public static void main(String[] args) {
		
		int[] no = {80,9,2,3,4,0,1,5,6,7,10};
		int small = no[0];
		int index = 0;
		for(int i=0;i<no.length;i++) {
//			if(small > no[i]) { //1st method
			if(no[i] < small) { //2nd method
				small = no[i];
				index = i;
			}
		}
		System.out.println("no["+index+"]:"+small);
	}
}
