package synchronise;

import java.util.*;


public class SynchronizeMap {
	
	public static void main(String[] args) {
	//creating HashMap object which is not synchronized
		HashMap<String,Integer>map=new HashMap<>();
		
		map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);
        map.put("FIVE", 5);
        
        //getting synchronized map
        Map<String,Integer> synchronizedMap = Collections.synchronizedMap(map);
        Set<String> keySet = synchronizedMap.keySet();
        System.out.println("Keys........");

      //While iterating over synchronizedMap, you must use synchronized block.
        synchronized (synchronizedMap) {
			Iterator<String>it=keySet.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
        Collection<Integer> values = synchronizedMap.values();
        
        System.out.println("Values.............");
        //While iterating over synchronizedMap, you must use synchronized block.
        synchronized (synchronizedMap) {
			Iterator<Integer>it=values.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
}

}
