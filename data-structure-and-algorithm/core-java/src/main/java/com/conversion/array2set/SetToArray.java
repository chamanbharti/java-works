package com.conversion.array2set;

import java.util.HashSet;
import java.util.Set;

public class SetToArray {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		
		/*Method - 1 (Set.toArray())*/
		String[] array = set.toArray(new String[set.size()]);
		System.out.println("Set To Array Elements Approach I");
        for(int i=0;i<array.length;i++) {
        	System.out.println(array[i]);
        }
        
        /*Method - 2 (Set.toArray())*/
		String[] array2 = set.stream().toArray(String[]::new);
		System.out.println("Set To Array Elements Approach II");
        for(int i=0;i<array2.length;i++) {
        	System.out.println(array2[i]);
        }
	}
}
