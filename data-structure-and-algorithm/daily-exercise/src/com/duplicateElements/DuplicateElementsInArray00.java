package com.duplicateElements;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElementsInArray00 {
	public static void main(String[] args) {
		
		int arr[]={1,2,3,5,6,2,1};
		String s[]={"chaman","bharti","chaman","sahil"};
		HashSet<String>duplicate=new HashSet<>();
		HashSet<String>noDuplicate=new HashSet<>();
		//step I
		/*for(int i=0;i<arr.length;i++) {
			if(!noDuplicate.contains(arr[i])) {
				noDuplicate.add(arr[i]);
			}else {
				duplicate.add(arr[i]);
			}
		}*/
		//step II
		for(String no:s) {
			if(!noDuplicate.contains(no)) {
				noDuplicate.add(no);
			}else {
				duplicate.add(no);
			}
		}
		System.out.println("actual array:"+Arrays.toString(s));
		System.out.println("duplicate:"+duplicate);
		System.out.println("No duplicate:"+noDuplicate);
		
	}

}
