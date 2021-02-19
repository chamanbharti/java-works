package com.interview.array;

public class Test {

	public static void main(String[] args) {
		int[] a = {2, 6, 3, 9, 11};
		/*
		 * 
		 2+6=8
		 2+3=5
		 2+9=11
		 2+11=13
		 
		 6+3=9
		 6+9=15
		 6+11=17
		 
		 3+9=12
		 3+11=14
		 
		 9+11=20
		 */
		int sum = 9;
		//the output should be {6,3}
		
		for (int i = 0; i < a.length; i++) {
			//for (int j = 0; j < a.length; j++) {/Is the reverse of pair is acceptable
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]==sum) {
					System.out.println("("+a[i]+"+"+a[j]+")="+sum);
				}
			}
		}
	}
}
