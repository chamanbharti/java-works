package com.junit.hello_world;

import java.util.StringTokenizer;

public class Calculation2 {

	public static int findMax(int arr[]) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static int findMax2(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static int cube(int n) {
		return n*n*n;
	}
	//method that returns reverse words   
    public static String reverseWord(String str){  
		StringBuilder result = new StringBuilder();
		StringTokenizer tokenizer = new StringTokenizer(str,"");
		
		while(tokenizer.hasMoreElements()) {
			StringBuilder sb = new StringBuilder();
			sb.append(tokenizer.nextToken());
			sb.reverse();
			
			result.append(sb);
			result.append("");
		}
		return result.toString();
	}
}
