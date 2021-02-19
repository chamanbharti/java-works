package com.interview.array;

import java.util.Arrays;
import java.util.List;

public class FindLargestSmallestNo {

	public static void main(String[] args) {
		int[] no = {2,3,40,0,1,6,7,8};
		Arrays.sort(no);
		int len = no.length;
		System.out.println(Arrays.toString(no));
		System.out.println(no[len-3]);
		int small=no[0],big = no[0];
		int indexOfSmall=0,indexOfBig = 0;
		for(int i=0;i<no.length;i++) {
			if(small>no[i]) {
//			if(no[i]<small) {
				small = no[i];
				indexOfSmall = i;
			}
		}
		
		for(int i=0;i<no.length;i++) {
			if(big<no[i]) {
//			if(no[i]>big) {
				big = no[i];
				indexOfBig = i;
			}
		}
		
		System.out.println("Smallest number is:["+indexOfSmall+"]:"+small);
		System.out.println("Largest number is:["+indexOfBig+"]:"+big);
	}
}
