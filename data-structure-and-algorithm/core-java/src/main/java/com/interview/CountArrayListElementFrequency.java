package com.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//https://mkyong.com/java/how-to-count-duplicated-items-in-java-list/
//https://mkyong.com/java8/java-8-find-duplicate-elements-in-a-stream/

public class CountArrayListElementFrequency {

	public static void main(String ...s) {
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
		System.out.println("a : " + Collections.frequency(list, "a"));
		System.out.println("a frequency:"+frequency(list, null));
		System.out.println("\nExample 2 - Count all with frequency with Set");
		Set<String> uniqueSet = new HashSet<>(list);
		for(String str:uniqueSet) {
//			System.out.println(str+": "+frequency(list, str));
			System.out.println(str+": "+Collections.frequency(list, str));
		}
		
		System.out.println("\nExample 3 - Count all with Map");
		Map<String, Integer>map = new HashMap<>();
		for(String str:list) {
			Integer count = map.get(str);
			map.put(str, (count == null)?1:count+1);
			
		}
		printMap(map);
		
		System.out.println("\nExample 4 - Count all with SortedMap");
		Map<String, Integer>treeMap = new TreeMap<>(map);
		printMap(treeMap);
	}
   private static void printMap(Map<String, Integer> map) {
		for(Map.Entry<String, Integer>entry:map.entrySet()) {
			System.out.println(entry.getKey()+" came "+entry.getValue()+" times");
		}
		
	}
public static int frequency(Collection<?> c, Object o) {
        int result = 0;
        if (o == null) {
            for (Object e : c)
                if (e == null)
                    result++;
        } else {
            for (Object e : c)
                if (o.equals(e))
                    result++;
        }
        return result;
    }

}
