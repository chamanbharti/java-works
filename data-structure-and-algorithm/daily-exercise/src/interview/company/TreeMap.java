package interview.company;

import java.util.Map;

public class TreeMap {

	public static void main(String[] args) {
		
		Map<Integer, Object>tm = new java.util.TreeMap<>();
		tm.put(1, null);
		tm.put(19, null);
		tm.put(5, null);
		tm.put(11, null);
		tm.put(3, null);
		
		System.out.println(tm);
	}
}
