package duplicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayList4 {
	static int[] a = {1,2,1,2};
	static String[] b = {"A","A","B","B"};
	public static void main(String[] args) {
		
		System.out.println("Finding duplicate elements in array using brute force method");
		printUsingBruteMethod(a);
		System.out.println("Finding duplicate elements in array using HashSet");
		printUsingHashSet(b);
		System.out.println("Finding duplicate elements in array using Hash Table");
		printUsingMap(b);
	}
	public static void printUsingBruteMethod(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]){
				 System.out.println("Duplicate:"+a[i]);
			    }
				
			}
		}
	}
	
	public static void printUsingHashSet(String[] b) {
		HashSet<String> hs = new HashSet<>();
		for(String s:b) {
			if(hs.add(s) == false) {
				System.out.println("Duplicate:"+s);
			}
		}
	}
	
	public static void printUsingMap(String[] b) {
		Map<String, Integer> map = new HashMap<>();
		for(String name:b) {
			Integer count = map.get(name);
			if(count == null) {
				map.put(name, 1);
			}else {
				map.put(name, ++count);
			}
		}
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> entry:entrySet) {
			if(entry.getValue() > 1) {
				System.out.println("Duplicate Element from Array:"+entry.getKey());
			}
		}
	}
}
