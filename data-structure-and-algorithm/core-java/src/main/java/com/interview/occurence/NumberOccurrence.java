package com.interview.occurence;

import java.util.HashMap;
import java.util.Map;

public class NumberOccurrence {

	public static void main(String[] args) {
		
		int no = 12312;
		Map<Integer,Integer>map = new HashMap<>();
		while(no>0) {
			int key = no%10;
			no = no/10;
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
