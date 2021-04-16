package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
//Write a java program to find intersection of two arrays?
//Write a java program to find common elements between two arrays?
public class FindCommonElementInTwoArray5 {
	public static void main(String[] args) {
		
		findCommon(new int[]{1,4,6,3,9,7},new int[]{2,5,4,7,10});
	}
	static public void findCommon(int array1[],int array2[]){
		Map map1=new HashMap<>();
		Map map2=new HashMap<>();
		
		for(int i=0;i<array1.length;i++){
			map1.put(array1[i], "const");
		}
		
		for(int i=0;i<array2.length;i++){
			if(!map1.containsKey(array2[i]))
			map1.put(array1[i], "const");
			else{
				System.out.println("Common element "+array2[i]);
				map2.put(array2[i], "const");
			}
		}
		System.out.println("Common elements "+map2);
	}

}
