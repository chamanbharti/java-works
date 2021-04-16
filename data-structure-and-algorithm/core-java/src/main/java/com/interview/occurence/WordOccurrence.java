package com.interview.occurence;

import java.util.HashMap;
import java.util.Map;

public class WordOccurrence {

	public static void main(String[] args) {
		
		String s = "Chaman is an engineer working in an IT company and Chaman is having good command on different languages.";
		String[] str = s.split(" ");
		Map<String,Integer> map = new HashMap<>();
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
			String key = str[i];
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
