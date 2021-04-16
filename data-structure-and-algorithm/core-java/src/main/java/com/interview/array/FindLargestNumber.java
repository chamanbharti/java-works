package com.interview.array;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		int[] no = {80,9,2,3,4,0,1,5,6,107,10};
		int large = no[0];
		int index = 0;
		for(int i=0;i<no.length;i++) {
			if(large < no[i]) { // 1st method
//			if(no[i] > large) { //2nd method
				large = no[i];
				index = i;
			}
		}
		System.out.println("no["+index+"]:"+large);
	}
}
