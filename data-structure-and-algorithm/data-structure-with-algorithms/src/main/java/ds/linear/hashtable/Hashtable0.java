package ds.linear.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable0 {

	public static void main(String[] args) {
		Map<String,String>map = new Hashtable<>();
		map.put("one", "ONE");
		map.put("two", "TWO");
		map.put("three", "THREE");
		System.out.println(map);
		map.put("four", "FOUR");
		map.put("one", "Modified");
		map.put("one", "newValue");
		System.out.println(map);
		System.out.println(map.containsKey("one"));
		System.out.println(map.containsKey("five"));
		System.out.println(map.get("one"));
		System.out.println(map.get("five"));
		System.out.println(map);
		System.out.println(map.remove("one2"));
		System.out.println(map);
		System.out.println(map.size());
	}
}
