package books.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTest {

public static void main(String[] args) {
		
		
		
		//Map<Integer,String>map = new HashMap<>();
		
//		map.put(1, "A");
//		map.put(1, "A");//duplicate key is not allowed
//		map.put(2, "A");//duplicate value is allowed
//		map.put(null, "B");//null key is allowed
//		map.put(null, "B");//duplicate null key allowed but doesn't print it
//		map.put(3, null);//null value allowed
//		map.put(4, null);//duplicate null value allowed
//		System.out.println(map);
		//output will be like {null=B, 1=A, 2=A, 3=null, 4=null}
		
		Map<Temp,String>map = new WeakHashMap<>();//16 by default
		map.put(new Temp(5), "A");
		map.put(new Temp(2), "B");
		map.put(new Temp(6), "C");
		map.put(new Temp(15), "D");
		map.put(new Temp(23), "E");
		map.put(new Temp(16), "F");
		map.put(new Temp(32), "G");
		map.put(new Temp(3), "Maa1");
		map.put(new Temp(5), "Maa2");
		
	
		
		System.out.println(map);
		//iterating formula
		// from top to bottom 
		// from right to left
		
		
	}
}
