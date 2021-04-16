package design_pattern.behavioural.iterator;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapIteratorDemo {
	public static void main(String args[]){  
		
		  Map<Integer, String> map = new Hashtable<>(); 
		 //Map<Integer, String> map = new HashMap<>();
		 //Map<Integer, String> map = new LinkedHashMap<>();
		 //Map<Integer, String> map = new IdentityHashMap<>();
		//Map<Integer, String> map = new WeakHashMap<>();
		//Map<Integer, String> map = new TreeMap<>();
		//Map<Integer, String> map = new ConcurrentHashMap<>();
		  map.put(1, "Ravi");
		  map.put(2, "Vijay");  
		  map.put(3, "Ravi");  
		  map.put(4, "Ajay");  
		  

		  System.out.print("\n1 for each loop using keySet : \n");
		  Set<Integer> keySets = map.keySet();
		  for(Iterator<Integer> iterator = keySets.iterator();iterator.hasNext();) {
			  Integer key = iterator.next();
			  System.out.print(key+"="+map.get(key));
		  }
	  
		  System.out.print("\n2 for each loop using entrySet: \n");
		  Set<Entry<Integer, String>> entries = map.entrySet();
		  for(Entry<Integer, String>entry:entries) {
			  System.out.print("("+entry.getKey()+","+entry.getValue()+")");
		  }
		  
		  System.out.print("\n3 Iterator using entrySet: \n");
		  
//		  Set set=map.entrySet();  
//		  Iterator itr=set.iterator();  
//		  while(itr.hasNext()){  
//		  Map.Entry entry=(Map.Entry)itr.next();  
//		  System.out.print("("+entry.getKey()+","+entry.getValue()+") ");  
//		 }  
		  
		  Set<Map.Entry<Integer, String>> set = map.entrySet();
		  Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		  while(itr.hasNext()) {
			  Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>)itr.next();
			  System.out.print("("+entry.getKey()+","+entry.getValue()+")");
		  }

		  System.out.print("\n4 Using Map.Entry and EntrySet inside For loop :\n"); 
		  for(Map.Entry<Integer, String> m:map.entrySet()) {
			  System.out.print("("+m.getKey()+","+m.getValue()+")");
		  }
		  
		  System.out.print("\n5 Using forEach() of java 8 : \n");
		  map.forEach((key,value)->System.out.print("("+key+","+value+")"));

	}	
}
