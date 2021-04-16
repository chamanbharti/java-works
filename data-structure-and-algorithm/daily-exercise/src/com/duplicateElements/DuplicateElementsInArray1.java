package com.duplicateElements;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElementsInArray1 {
	public static void main(String[] args) {
		//String array
		String[] strArray = {"abc","def","mno","xyz","pqr","xyz","def"};
		int n=strArray.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if( strArray[i].equals(strArray[j])){
					strArray[j]=strArray[n-1];
					j--;
					n--;
				}
			}
		}
		
		String[] uniqueStr = Arrays.copyOf(strArray, n);
		int length = uniqueStr.length;
		for(int i=0;i<length;i++){
			System.out.print(uniqueStr[i]+"\t");
		}
		
	}

}
