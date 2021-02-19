package com.interview.map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableVsHashMap {

	public static void main(String ...s) {
		
		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
		
//		String s1 = null;
//		Integer i = null;
//		hashtable.put(s1, i);
//		System.out.println(hashtable);//NullPointerException
		
//		String s1 = "A";
//		Integer i = 10;
//		hashtable.put(s1, i);
//		System.out.println(hashtable);
		
//		HashMap<String, Integer> map = new HashMap<String, Integer>();		
//		String s2 = null;
//		Integer ii = null;
//		String s3 = null;
//		Integer iii = null;
//		map.put(s2, ii);
//		map.put(s3, iii);
//		System.out.println(map);//{null=null}
	
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String s2 = "Aman";
		System.out.println(s2.hashCode());
		Integer ii = 19;
		String s3 = "Sunny";
		System.out.println(s3.hashCode());
		Integer iii = 20;
		map.put(s2, ii);  
		map.put(s3, iii);  
		System.out.println(map);//{null=null}
		
	}

}
