package com.interview.occurence;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {

	public static void main(String[] args) {
		String s = "Chamanaman";
		char[] a = s.toCharArray();
		Map<Character,Integer>map = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			Character key = a[i];
			Integer value = map.get(key);
			if(map.containsKey(key)) {
				map.put(key, ++value);
			}else {
				map.put(key, 1);
			}
		}
		System.out.println(map);
	}
}
