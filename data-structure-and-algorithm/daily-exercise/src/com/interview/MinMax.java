package com.interview;

import java.util.Scanner;

public class MinMax {

	static int[] a = {11,4,7,90,2,202};
	static int min=a[0];
	static int max=a[0];
	static String[] s = {"Chaman","aman","Sahil Bharti","Rahi Akela","naman"};
	static int index=0;
	public static void main(String[] args) {
		
		int min = min();
		System.out.println("min value="+min);
		int max = max();
		System.out.println("max value="+max);
		String minWord = minWord();
		System.out.println("min word="+minWord);
		String maxWord = maxWord();
		System.out.println("min word="+maxWord+" and index="+index);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no into a2 array");
		
	}
	public static int min(){
		for(int i=0;i<a.length;i++) {
			/*if(min>a[i]) {
				min=a[i];
			}*/
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	public static int max(){
		for(int i=0;i<a.length;i++) {
			/*if(max<a[i]) {
				max=a[i];
			}*/
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	public static String minWord() {
		String smallWord=s[0];
		for(int i=0;i<s.length;i++) {
			/*if(smallWord.length() > s[i].length()) {
				smallWord=s[i];
			}*/
			if(s[i].length() < smallWord.length()) {
				smallWord=s[i];
			}
		}
		return smallWord;
	}
	public static String maxWord() {
		String bigWord = s[0];
		
		for(int i=0;i<s.length;i++) {
			/*if(bigWord.length() < s[i].length()) {
				bigWord = s[i];
			}*/
			if(s[i].length() > bigWord.length() ) {
				bigWord = s[i];
				index = i;
			}
		}
		return bigWord;
	}
}
