package com.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test2 {
public static void main(String[] args) {
	String[] str1 = {"abc","abc","deb","edb","deb"};
	String[] str2 = {"abc","abc","deb","edb","deb"};
	//Brute Force Method
	int[] str= {1,2,3,1,3,4,5,4,6};
	for(int n:str) {
		System.out.print(n+" ");
	}
	System.out.println();
	System.out.print("Duplicate Element is:");
	for(int i=0;i<str.length-1;i++) {
		for(int j=i+1;j<str.length;j++) {
			//if(str[i]==(str[j]) && (i!=j)){
			if(str[i]==(str[j])){ // for duplicate print
			//if(str[i]==(str[j]) && (i!=j)){
				System.out.print(+str[i]+" ");
			}
		}
	}
	System.out.println();
	/*HashSet<String>set = new HashSet<>();
	for(String s:str) {
		if(!set.add(s)) {
			System.out.println("Duplicate Element is:"+s);
		}
	}*/
	//check array equlity
	/*boolean equalOrNot=true;
	if(str1.length == str2.length) {
		for(int i=0;i<str1.length;i++) {
			if(str1[i] != str2[i]) {
				equalOrNot=false;
			}
		}
	}else {
		equalOrNot=false;
	}
	if(equalOrNot)
		System.out.println("Two array is equal");
	else
		System.out.println("Two array is not equal");*/
	//System.out.println(Arrays.equals(str1, str2));
	//System.out.println(Arrays.deepEquals(str1, str2));
	//remove duplicate from array
	HashSet<String>hs = new HashSet<>(Arrays.asList(str1));
	System.out.println(hs);
}

}

