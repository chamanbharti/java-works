package com.conversion.array2list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToArrayList {
	public static void main(String[] args) {
		
		String[] array = {"JAVA","STRUTS","JSP","SERVLETS","JSF"};
		
		List<String>list=new ArrayList<>();
		for(String s:array) {
			list.add(s);
		}
        System.out.println("Array To ArrayList Elements Approach I");
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i));
        }
        
//		List<String>list1 = Arrays.asList(array);
 		List<String>list1 = new ArrayList<>(Arrays.asList(array));
        System.out.println("Array To ArrayList Elements Approach II");
        for(int i=0;i<list1.size();i++) {
        	System.out.println(list1.get(i));
        }
		
        System.out.println("Using Approach III");
		List<String>list2 = new ArrayList<>();
		Collections.addAll(list2, array);
		list2.forEach(System.out::println);
		
		System.out.println("Array To ArrayList Elements Approach IV Using Java 8 Stream");
		List<String>list3 = Arrays.stream(array).collect(Collectors.toList());
		 for(int i=0;i<list3.size();i++) {
	        	System.out.println(list3.get(i));
	        }
		 
		 int[] spam = new int[] { 1, 2, 3 };
		List<Integer> al =  Arrays.stream(spam)
		       .boxed()
		       .collect(Collectors.toList());
		for(int i=0;i<al.size();i++) {
        	System.out.println(al.get(i));
        }
		
		List<Integer>list01,list02,list03;
		list01 = Stream.of(1,2,3).collect(Collectors.toList());
		list02 = Stream.of(4,5,6).collect(Collectors.toCollection(ArrayList::new));
		list03 = Stream.of(4,5,6).collect(Collectors.toCollection(LinkedList::new));
	}

}
