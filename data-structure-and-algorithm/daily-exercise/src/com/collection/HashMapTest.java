package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String>hp = new HashMap<>();
		hp.put(1, "Rahi Akela");
		hp.put(2, "Chaman Bharti");
		hp.put(3, "Sahil Bharti");
		hp.put(4, "Aman Bharti");
		hp.put(5, "Naman Bharti");
		Set set = hp.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
	
		}
		/*for(Map.Entry<Integer, String>entry:hp.entrySet()) {
			
			System.out.print(entry.getKey()+" ");
			System.out.print(entry.getValue()+" ");
		}*/
	}
}
