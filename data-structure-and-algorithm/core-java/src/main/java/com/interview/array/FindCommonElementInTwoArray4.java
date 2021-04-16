package com.array;

import java.util.Arrays;
import java.util.HashSet;
//Write a java program to find intersection of two arrays?
//Write a java program to find common elements between two arrays?
public class FindCommonElementInTwoArray4 {
	public static void main(String[] args) {
		
		Integer[] s1 = {1, 5, 9, 4, 6, 7,3,8};
		 
		Integer[] s2 = {8, 1, 3, 4, 18, 12, 7, 90};
		
		HashSet<Integer> h=new HashSet<>(Arrays.asList(s1));
		HashSet<Integer> hh=new HashSet<>(Arrays.asList(s2));
		
		h.retainAll(hh);
		System.out.println(h); //[1, 3, 4, 7, 8]
	}

}
