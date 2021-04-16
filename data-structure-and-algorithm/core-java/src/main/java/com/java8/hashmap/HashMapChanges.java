package java8.hashmap;

import java.util.HashMap;

public class HashMapChanges {

	public static void main(String[] args) {
		//before java8 hash implemented LinkedList for collision
		//now after java8 it has impleted red black tree
		HashMap<String, Integer>map = new HashMap<>();
		map.put(null,10);
		map.put(null,20);
		System.out.println( map);
	}
}
