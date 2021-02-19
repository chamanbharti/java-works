package com.array;

import java.util.HashSet;

public class FindCommonElementInTwoArray2 {
	public static void main(String[] args) {
		
		int[] s1 = {1, 5, 9, 4, 6, 7,3,8};
		 
        int[] s2 = {8, 1, 3, 4, 18, 12, 7, 90};
		
		HashSet<Integer> h=new HashSet<>();
		
		for(int i=0;i<s1.length;i++){
			for(int j=0;j<s2.length;j++){
				if(s1[i]==(s2[j])){
					h.add(s1[i]);
				}
			}
		}
		System.out.println(h); //[1, 3, 4, 7, 8]
	}

}
