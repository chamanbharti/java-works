package com.collection.api.generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeforeGeneric {

	public static void main(String[] args) {
//		List list = new ArrayList();
//		list.add(10);
//		list.add("10");
//		//with generics, it is required to specify the type of object we need to store.
//		List<Integer>list2 = new ArrayList<>();
//		list2.add(10);
//		list2.add("10");//CE
		
//		List list = new ArrayList();
//		list.add("hello");
//		String s = (String)list.get(0);//typecasting
//		System.out.println("s:"+s);
//		//after generics, we don't need to typecast the object
//		List<String>list2 = new ArrayList<>();
//		list2.add("Hello");
//		String ss = list2.get(0);//no typecasting
//		System.out.println("ss:"+ss);
		
//		long startTime = System.currentTimeMillis();
//		List<String>list3 = new ArrayList<>();
//		list3.add("Chaman");
//		list3.add("Bharti");
//		//list3.add(32);//CE
//		String s = list3.get(1);//typecasting is not required
//		System.out.println("Elements:"+s);
//		
//		System.out.println("**Iterator**");
//		Iterator<String>itr = list3.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		System.out.println("TotalTime:"+(System.currentTimeMillis() - startTime));
		
//		startTime = System.currentTimeMillis();
//		List<String>list4 = new LinkedList<>();
//		list4.add("Chaman");
//		list4.add("Bharti");
//		//list3.add(32);//CE
//		String str = list4.get(1);//typecasting is not required
//		System.out.println("Elements:"+str);
//		
//		System.out.println("**Iterator2**");
//		Iterator<String>itr2 = list4.iterator();
//		while(itr2.hasNext()) {
//			System.out.println(itr2.next());
//		}
//		System.out.println("TotalTime:"+(System.currentTimeMillis() - startTime));
		
//		long startTime = System.currentTimeMillis();
//		Set<String>list4 = new HashSet<>();
//		list4.add("Chaman");
//		list4.add("Bharti");
//		//list3.add(32);//CE
//		
//		System.out.println("**HashSet**");
//		Iterator<String>itr2 = list4.iterator();
//		while(itr2.hasNext()) {
//			System.out.println(itr2.next());
//		}
//		System.out.println("TotalTime:"+(System.currentTimeMillis() - startTime));
		
//		startTime = System.currentTimeMillis();
//		Set<String>list5 = new LinkedHashSet<>();
//		list5.add("Chaman");
//		list5.add("Bharti");
//		//list3.add(32);//CE
//		
//		System.out.println("**HashSet**");
//		Iterator<String>itr3 = list5.iterator();
//		while(itr3.hasNext()) {
//			System.out.println(itr3.next());
//		}
//		System.out.println("TotalTime:"+(System.currentTimeMillis() - startTime));
		
		long startTime = System.currentTimeMillis();
		Map<Integer,String>map = new HashMap<>();
		map.put(1,"Chaman");
		map.put(2,"Bharti");
		
		//now use Map.Entry for Set and Iterator
		System.out.println("**HashMap**");
		Set<Map.Entry<Integer, String>> mapItr = map.entrySet();
		Iterator<Map.Entry<Integer, String>>mapItr2 = mapItr.iterator();
		while(mapItr2.hasNext()) {
			//System.out.println(mapItr2.next());
			Map.Entry<Integer, String> e = mapItr2.next();//no need to typecast
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("TotalTime:"+(System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		Map<Integer,String>map2 = new LinkedHashMap<>();
		map2.put(1,"Chaman");
		map2.put(2,"Bharti");
		
		//now use Map.Entry for Set and Iterator
		System.out.println("**LinkedHashMap**");
		Set<Map.Entry<Integer, String>> linkedmapItr = map2.entrySet();
		Iterator<Map.Entry<Integer, String>>linkedmapItr2 = linkedmapItr.iterator();
		while(linkedmapItr2.hasNext()) {
			//System.out.println(mapItr2.next());
			Map.Entry<Integer, String> e = linkedmapItr2.next();//no need to typecast
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("TotalTime:"+(System.currentTimeMillis() - startTime));
	}
}
