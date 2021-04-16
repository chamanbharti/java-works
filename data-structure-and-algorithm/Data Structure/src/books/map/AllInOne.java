package books.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class AllInOne {

	 public static void main(String[] args) {
		 HashMap<Integer, String> map = new HashMap<Integer, String>();
	     
	     /*map.put(5, "Five");
	     map.put(8, "Eight");
	     map.put(6, "Six");
	     map.put(4, "Four");
	     map.put(2, "Two");
	     
	     String text = map.get(6);
	     
	     System.out.println(text);
	     for(Map.Entry<Integer, String> entry:map.entrySet()) {
	    	 int key = entry.getKey();
	    	 String value = entry.getValue();
	    	 
	    	 System.out.println(key+": "+value);
	     }*/
		 Map<Integer, String> hashtable = new Hashtable<Integer, String>();
		 Map<Integer, String> hashMap = new HashMap<Integer, String>();
		 Map<Integer, String> identityHashMap = new IdentityHashMap<Integer, String>();
	     Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
	     Map<Integer, String> treeMap = new TreeMap<Integer, String>();
	     Map<Integer, String> weakHashMap = new WeakHashMap<Integer, String>();
	     Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<Integer, String>();
	        
	        testMap(hashtable);
	}
	 public static void testMap(Map<Integer,String> map) {
		 	map.put(9, "fox");
	        map.put(4, "cat");
	        map.put(8, "dog");
	        map.put(1, "giraffe");
	        map.put(0, "swan");
	        map.put(15, "bear");
	        map.put(6, "snake");
	        for(Integer key:map.keySet()) {
	        	String value = map.get(key);
	        	System.out.println(key+": "+value);
	        }
	 }
}
