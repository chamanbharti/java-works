package com.sorting.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapSorting {

	public static void main(String[] args) {
		
		Map<String, String> unsortMap = new HashMap<String, String>();
        unsortMap.put("Z", "z");
        unsortMap.put("B", "b");
        unsortMap.put("A", "a");
        unsortMap.put("C", "c");
        unsortMap.put("D", "d");
        unsortMap.put("E", "e");
        unsortMap.put("Y", "y");
        unsortMap.put("N", "n");
        unsortMap.put("J", "j");
        unsortMap.put("M", "m");
        unsortMap.put("F", "f");
        
        System.out.println("\nSorted Map......By Key");
        /* 2. Sort by Key
         * 1. Uses java.util.TreeMap, it will sort the Map by keys automatically.
         * 2. Yet another java.util.TreeMap example, provide a custom Comparator to sort the key in descending order.
         */
//        Map<String,String>tree = new TreeMap<>(unsortMap);
//        print(tree);
        
//        Map<String,String>treeMap = new TreeMap<>(
//        		new Comparator<String>() {
//        		public int compare(String a,String b) {
//        			return a.compareTo(b);
//        		}
//        		}
//        		);
//        treeMap.putAll(unsortMap);
//        printMap(treeMap);
        
        //using java 8 lambda
        
        /*
        Map<String,String>treeMap = new TreeMap<>(
        		//(Comparator<String>) (a,b)->a.compareTo(b)
        		                       (a,b)->a.compareTo(b)
        		);
        treeMap.putAll(unsortMap);
        printMap(treeMap);
        */
        
        System.out.println("\nSorted Map......By Value");
        /* 2. Sort by Value
         * Converts the Map into a List<Map>, sorts the List<Map> with a custom Comparator 
         * and put it into a new insertion order map – LinkedHashMap
         */
       // Map<String, String> sortedMap = sortByValue(unsortMap);
        Map<String, String> sortedMap = sortByValueUpgraded(unsortMap);
        printMap(sortedMap);
        
        
	}
	
	private static Map<String,String>sortByValue(Map<String,String>unsortMap){
		// 1 convert map to list of map
		List<Map.Entry<String,String>>list = new LinkedList<Map.Entry<String,String>>(unsortMap.entrySet());
		// 2 sort list with collections.sort , provide a custom comparator
		// try switch the a,b position for a different order
		Collections.sort(list,new Comparator<Map.Entry<String,String>>(){
			public int compare(Map.Entry<String,String> a,Map.Entry<String,String> b) {
				return a.getValue().compareTo(b.getValue());
			}
		});
		
		// 3 loop the sorted list and put it into a new insertion order map linked hash map
		Map<String,String>sortedMap = new LinkedHashMap<>();
		for(Map.Entry<String,String>entry:list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	private static <K,V extends Comparable<? super V>> Map<K,V> sortByValueUpgraded(Map<K,V>unsortMap){
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(unsortMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
	}
	
	public static void printMap(Map<String,String>map) {
		for(Map.Entry<String,String>entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
