package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class InitializeAL1 {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<>(Arrays.asList("Rahi","Chaman","Sahil"));
		System.out.println("Elements are: "+obj);
		for(String s:obj){
			System.out.println(s);
		}
		Iterator<String> itr = obj.iterator();
		System.out.println("Iterator:");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
