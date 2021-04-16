package com.interview;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionArray {

	public static void main(String[] args) {
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		 
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        
        HashSet<String>set = new HashSet<>();
        for(int i=0;i<s1.length;i++) {
        	for(int j=0;j<s2.length;j++) {
        		if(s1[i].equals(s2[j])) {
        			set.add(s1[i]);
        		}
        	}
        }
        System.out.println(set);
        HashSet<String>set1 = new HashSet<>(Arrays.asList(s1));
        HashSet<String>set2 = new HashSet<>(Arrays.asList(s2));
        set1.retainAll(set2);
        System.out.println(set1);
	}
}
