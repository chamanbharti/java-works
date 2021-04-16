package map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(5, "Kalim Roshan Sailani");
		hm.put(4, "Kalim  Sailani");
		//hm.put(3, "Sabila Khatun");
		//hm.put(2, "Rahi Akela");
		//hm.put(1, "Chaman Bharti");
		//hm.put(0, "Nasrin Praveen");
		//hm.put(null, "");
		//hm.put(null, "");
		//hm.put(107, "Rahi Akela");
		
		//for key only
		//Set<K> keySet()
		Set keyset = hm.keySet();
		System.out.println(keyset);//[0, 1, 2, 3, 4, 5]
		
		//for values only
		Collection c = hm.values();
		System.out.println(c);
		
		// for key-value
		Set entrySet = hm.entrySet();
		System.out.println(entrySet);
		
		Iterator itr = entrySet.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println("Key:"+m1.getKey()+" Value:"+m1.getValue());
		}
		
		/*for(Integer entry:hm.keySet()){
			System.out.println(entry);
		}*/
		
		//new style
		//for key-value both
		for(Map.Entry<Integer, String>map:hm.entrySet()){
			//System.out.println(map.getKey()+" "+map.getValue());
		}
		
		//old style
		//Set<Map.Entry<K,V>> entrySet()
		Set set = hm.entrySet();//converting to Set so that we can traverse
		//System.out.println(set);
		//[0=Nasrin Praveen, 1=Chaman Bharti,4=Kalim Roshan Sailani, 5=Kalim Roshan Sailani]

		//Iterator itr = set.iterator();
		//while(itr.hasNext()){
			//converting to Map.Entry so that we can get key and value separately
		//	Map.Entry entry=(Map.Entry)itr.next();
			
			//System.out.println(entry.getKey()+" "+entry.getValue());
	//	}
		
		//Collection<V> values()
		//System.out.println(hm.values());
		//[Nasrin Praveen, Chaman Bharti,Kalim Roshan Sailani, Kalim Roshan Sailani]
	}

}
