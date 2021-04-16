package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//https://www.dotnetperls.com/duplicates-java
//https://www.mkyong.com/java/how-to-count-duplicated-items-in-java-list/
public class CountDuplicatedList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");
		
		System.out.println("\nExample 1 - Count 'a' with frequency");
		System.out.println("a : "+Collections.frequency(list, "a"));
		
		System.out.println("\nExample 2 - Count all with frequency");
		Set<String>uniqueSet = new HashSet<>(list);
		for(String temp : uniqueSet){
			System.out.println(temp+": "+Collections.frequency(list, temp));
		}
		
		System.out.println("\nExample 3 - Count all with Map");
		Map<String, Integer>map = new HashMap<>();
		for(String temp : list){
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		printMap(map);
		
		System.out.println("\nSorted Map");
		Map<String, Integer> treeMap = new TreeMap<String,Integer>(map);
		printMap(treeMap);
		
	}

	/*private static <K, V> void printMap(Map<K, V> map) {
		for(Map.Entry<K, V> entry : map.entrySet()){
			System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
		}
		
	}*/
	private static <String, Integer> void printMap(Map<String, Integer> map) {
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
		}
		
	}
}
