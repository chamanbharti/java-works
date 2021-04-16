package com.interview.string;

import java.util.HashSet;

public class StringDuplicate1 {

	public static void main(String[] args) {
		String words = "coffee door flower coffee door";
		String[] wordArray = words.split(" ");
		HashSet<String>hs = new HashSet<>();
		words = "";
		for(String x:wordArray) {
			if(hs.add(x) == true) {
				words = words + x +" ";
			}
		}
		System.out.println(words);
		System.out.println(wordArray.length);
	}
}
