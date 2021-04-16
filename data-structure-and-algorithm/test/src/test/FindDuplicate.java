package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,3,5,4};
		
		for(int i=0;i<a.length;i++) { //Brute Force Method
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j] && (i != j)) {
					System.out.println(a[i]);
				}
			}
		}
		System.out.println("using set");
		Set<Integer>set = new HashSet<>();
		for(int i:a) {
			boolean b = set.add(i);
			if(b ==  false) {
				System.out.println(i);
			}
		}
		
		System.out.println("using map");
		Map<Integer,Integer>map =  new HashMap<>();
		for(int key:a) {
//			Integer value = map.get(key);
//			if(map.containsKey(key)) {
//				map.put(key, ++value);
//			}else {
//				map.put(key, 1);
//			}
			
			Integer count = map.get(key);
			if(count == null) {
				map.put(key, 1);
			}else {
				count = count + 1;
				map.put(key, count);
			}
		}
		System.out.println("Duplicate elements");
		Set<Map.Entry<Integer, Integer>>entries = map.entrySet();
		for(Map.Entry<Integer, Integer>entry:entries) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
