package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class HashSetDemo<K,V> {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Chaman");
		hs.add("Chaman");
		System.out.println(hs.size());
		HashMap<String, String>hm = new HashMap<>();
		hm.put("Chaman", "Bharti");
		hm.put("Sahil", "Bharti");
		ArrayList al = new ArrayList();
		LinkedList al2 = new LinkedList();
		//Set set = hm.keySet();
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		for(Map.Entry entry:hm.entrySet()) {
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			//System.out.println(key+":"+value);
		}
		//System.out.println(hm);
	}
	
}
