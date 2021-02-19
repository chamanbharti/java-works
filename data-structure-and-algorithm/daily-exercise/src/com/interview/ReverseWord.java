package com.interview;

public class ReverseWord {

	public static void main(String[] args) {
		reverseEachWordOfString("Java Concept Of The Day");
	}
	public static void reverseEachWordOfString(String s) {
		String[] words = s.split(" ");
		String reverseString = "";
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String reverseWord = "";
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println(s);
		System.out.println(reverseString);
		String s1=new String("chaman");
		String s2=new String("CHAMAN");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
