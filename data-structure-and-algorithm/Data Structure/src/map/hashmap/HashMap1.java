package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(102,"Rahul"); 
		hm.put(101,"Vijay");  
		hm.put(100,"Amit");  
		
		for(Map.Entry entry:hm.entrySet()){
			
			System.out.println(entry.getKey()+" "+entry.getValue()+" "+entry.hashCode());
			if(entry.getKey().equals("Rahul")){
				entry.setValue("Chaman");
			}
		}
		System.out.println(hm);
	}

}
