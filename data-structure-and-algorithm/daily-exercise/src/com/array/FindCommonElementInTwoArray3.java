package com.array;

import java.util.Arrays;
import java.util.HashSet;

public class FindCommonElementInTwoArray3 {
	public static void main(String[] args) {
		
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		 
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
		
		HashSet<String> h=new HashSet<>(Arrays.asList(s1));
		HashSet<String> hh=new HashSet<>(Arrays.asList(s2));
		
		h.retainAll(hh);
		System.out.println(h);  //[FIVE, FOUR, THREE]
	}

}
