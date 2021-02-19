package com.duplicateElements;

import java.util.HashSet;

public class DuplicateElementsInArray3 {
	public static void main(String[] args) {
		//String array
		/*String[] strArray = {"abc","def","mno","xyz","pqr","xyz","def"};
		
		for(int i=0;i<strArray.length-1;i++){
			for(int j=i+1;j<strArray.length;j++){
				if( strArray[i].equals(strArray[j]) && (i!=j)){
					System.out.println("Duplicate Element is "+strArray[j]);
				}
			}
		}*/
		
		// int array
		/*int[] intArray = {123,125,452,156,123,125,452};
		
		for(int i=0;i<intArray.length-1;i++){
			for(int j=i+1;j<intArray.length;j++){
				if( intArray[i]==(intArray[j]) && (i!=j)){
					System.out.println("Duplicate Element is "+intArray[j]);
				}
			}*/
		  //using hashset
		/*String[] strArray = {"abc","def","mno","xyz","pqr","xyz","def"};
		HashSet<String> set = new HashSet<>();
		for(String arrayElement:strArray){
			if(!set.add(arrayElement)){
				System.out.println("Duplicate Element is "+arrayElement);
			}
		}*/
		
		// int array
		Integer[] intArray = {123,125,452,156,123,125,452};
				HashSet<Integer> set = new HashSet<>();
					for(Integer arrayElement:intArray){
						if(!set.add(arrayElement)){
							System.out.println("Duplicate Element is "+arrayElement);
						}
					}
		
	}

}
