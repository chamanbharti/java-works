package com.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

//How to remove duplicate elements from an ArrayList in Java
//http://netjs.blogspot.in/2015/08/how-to-remove-duplicate-elements-from-arraylist-java.html
public class RemoveDuplicacyArrayList {
	public static void main(String[] args) {
		
		/*List<String>list = new ArrayList<>();
		list.add("Delhi");
		list.add("Mumbai");
		list.add("Bangalore");
		list.add("Chennai");
		list.add("Kolkata");
		list.add("Mumbai");
		System.out.println(list);//[Delhi, Mumbai, Bangalore, Chennai, Kolkata, Mumbai]
		
        List<String>newList = new ArrayList<>();
        for(String name:list){
        	if(!newList.contains(name)){
        		newList.add(name);
        	}
        }
        
        for(String name:newList){
        	System.out.println("City Name: "+name);
        }
		System.out.println(newList);*/
		
		/*List<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);//[1, 2, 3, 1, 2, 3]
		
        List<Integer>newList = new ArrayList<>();
        for(Integer name:list){
        	if(!newList.contains(name)){
        		newList.add(name);
        	}
        }
        
        for(Integer name:newList){
        	System.out.println("City Name: "+name);
        }
		System.out.println(newList);
	*/
		/*List<String>list = new ArrayList<>();
		list.add("Delhi");
		list.add("Mumbai");
		list.add("Bangalore");
		list.add("Chennai");
		list.add("Kolkata");
		list.add("Mumbai");
		
		//creating a hashset using the list
		Set<String>set = new HashSet<>(list);
		//remove all elements from the list
		list.clear();
		//add all the elements of the set to create a list without duplicate
		list.addAll(set);
		//displaying the element
		for(String name:list){
			System.out.println("City Name: "+name);
		}*/
		
		//It can be seen that the order is retained now.
		/*List<String>list = new ArrayList<>();
		list.add("Delhi");
		list.add("Mumbai");
		list.add("Bangalore");
		list.add("Chennai");
		list.add("Kolkata");
		list.add("Mumbai");
		
		//creating a hashset using the list
		Set<String>set = new LinkedHashSet<>(list);
		//remove all elements from the list
		//list.clear();
		//add all the elements of the set to create a list without duplicate
		//list.addAll(set);
		//displaying the element
		 ArrayList<String> al = new ArrayList<String>(set);
		for(String name:al){
			System.out.println("City Name: "+name);
		}*/
		
		/*Option with Java 8 Streams

		
		Java 8 streams provide a very simple way to remove duplicate elements from a list.
		Using the distinct method.
		List<String>list = new ArrayList<>();
		list.add("Delhi");
		list.add("Mumbai");
		list.add("Bangalore");
		list.add("Chennai");
		list.add("Kolkata");
		list.add("Mumbai");
		
		list = list.stream().distinct().collect(Collectors.toList());
		
		//displaying the elements
		for(String name:list){
			System.out.println("City Name - "+name);
		}*/
		
		List<String> list = new ArrayList<String>();
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
		
		/*System.out.println("\nExample 2 - Count all with frequency");
		
		Set<String> uniqueSet = new HashSet<>(list);
		for(String temp:uniqueSet){
			System.out.println(temp+" : "+Collections.frequency(list, temp));
		}*/
		System.out.println("\nExample 3 - Count all with Map");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String temp:list){
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		printMap(map);
		
		System.out.println("\nSorted Map");
		Map<String,Integer>treeMap = new TreeMap<String,Integer>(map);
		printMap(treeMap);
		
	}

	private static void printMap(Map<String, Integer> map) {
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
		}
		
	}

}
