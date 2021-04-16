package books.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class LinkedHashSetTest {

public static void main(String[] args) {
		
		
		Set<Temp>map = new LinkedHashSet<>();//16 by default
		map.add(new Temp(5));
		map.add(new Temp(2));
		map.add(new Temp(6));
		map.add(new Temp(15));
		map.add(new Temp(23));
		map.add(new Temp(16));
		map.add(new Temp(32));
		
		
	
		
		System.out.println(map);
		//iterating formula
		//it iterate insertion order
		
		
	}
}
