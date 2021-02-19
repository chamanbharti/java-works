package com.array;

import java.util.HashSet;

public class FindCommonElementInTwoArray1 {
	public static void main(String[] args) {
		
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		 
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
		
		HashSet<String> h=new HashSet<>();
		
		for(int i=0;i<s1.length;i++){
			for(int j=0;j<s2.length;j++){
				if(s1[i].equals(s2[j])){
					h.add(s1[i]);
				}
			}
		}
		System.out.println(h);
	}

}
