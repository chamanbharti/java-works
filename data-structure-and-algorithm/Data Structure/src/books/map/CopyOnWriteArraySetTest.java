package books.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetTest {

public static void main(String[] args) {
		
		
	CopyOnWriteArraySet<Temp>map = new CopyOnWriteArraySet<>();
		map.add(new Temp(5));
		map.add(new Temp(2));
		map.add(new Temp(6));
		map.add(new Temp(15));
		map.add(new Temp(23));
		map.add(new Temp(16));
		map.add(new Temp(32));
		
		
	
		
		System.out.println(map);
		//iterating formula
		// from bottom to top 
		// from  left to right
		
		
	}
}
