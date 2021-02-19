package thread.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		
		//Object putIfAbsent(Object key,Object value)
		
//		Map<Integer,String>map = new HashMap<>();
//		map.put(101, "Chaman");
//		map.put(101, "Bharti");
//		System.out.println(map);//{101=Bharti}
		
//		Map<Integer,String>map1 = new ConcurrentHashMap<>();
//		map1.put(101, "Chaman");
//		map1.put(101, "Bharti");
//		System.out.println(map1);//{101=Bharti}
		
//		map1.put(101, "Chaman");
//		map1.putIfAbsent(101, "Bharti");
//		System.out.println(map1);//{101=Chaman}
		
		//boolean remove(Object key,Object value)
		
//		Map<Integer,String>map = new HashMap<>();
//		String m = map.put(101, "Chaman");
//		System.out.println("m:"+m);
//		String removed = map.remove(101);
//		System.out.println("removed:"+removed);
//		System.out.println(map);//{}
//				
//		Map<Integer,String>map1 = new ConcurrentHashMap<>();
//		map1.put(101, "Bharti");
//		map1.remove(101,"Bharti");
//		System.out.println(map1);//{101=Bharti}
		
		//boolean replace(Object key,Object oldValue, Object newValue)
		
		Map<Integer,String>map = new HashMap<>();
		String m = map.put(101, "Chaman");
		System.out.println("m:"+m);
		 map.replace(101, "Aman","Bharti");
		System.out.println(map);//{101=Chaman}
		 map.replace(101, "Chaman","Bharti");
		System.out.println(map);//{101=Bharti}
				
		Map<Integer,String>map1 = new ConcurrentHashMap<>();
		map1.put(101, "Bharti");
		map1.remove(101,"Bharti");
		//System.out.println(map1);//{101=Bharti}
				
		
	}
}
