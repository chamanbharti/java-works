package map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap0 {
	public static void main(String[] args) {
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		
		hm.put(5, "Kalim Roshan Sailani");
		hm.put(4, "Kalim Roshan Sailani");
		hm.put(3, "Sabila Khatun");
		hm.put(2, "Rahi Akela");
		hm.put(1, "Chaman Bharti");
		hm.put(0, "Nasrin Praveen");
		//hm.put(105, "");
		//hm.put(106, "");
		//hm.put(107, "Rahi Akela");
		//hm.put(108, "Rahi Akela");
		
		for(Map.Entry<Integer, String> m : hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
