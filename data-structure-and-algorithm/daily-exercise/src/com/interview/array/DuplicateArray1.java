package com.interview.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArray1 {

	public static void main(String[] args) {
		int[] array = {1,2,3,30,4,40,3,4};
		String[] a = {"A","a","B","C","D","E","D"};
		//Arrays.sort(array);
		//checkDuplicate(array);
		//checkDuplicateUsingSet(array);
		checkDuplicateString(a);
	}
	
	/*public static void checkDuplicate(int[] array) {
		int duplicateCount = 0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i] == array[j] && i != j) {
					System.out.println("duplicate element");
				}
			}
			
		}
	}
	private static void checkDuplicateUsingSet(int[] array) {
		Set<Integer>set = new HashSet<>();
		for(Integer x:array) {
			if(set.add(x)==false) {
				System.out.println("Duplicate element");
			}
		}
		
	}*/
	public static void checkDuplicateString(String[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				//if(a[i] == a[j] && i != j) {
				//if(a[i].equals(a[j]) && i != j) {
				//if(a[i].equalsIgnoreCase(a[j]) && i != j) {
				if(a[i] == a[j] && i != j) {
					if(a[i] == "a")
						continue;
					System.out.println("Duplicate element");
				}
			}
		}
	}
}
