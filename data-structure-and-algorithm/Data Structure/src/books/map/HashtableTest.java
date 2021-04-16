package books.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableTest {
	public static void main(String[] args) {
		
		//Hashtable<Temp, String>map=new Hashtable<>(25);//11 by default
		
		//map.put(1, "A");
		//map.put(1, "A");//duplicate key is not allowed
		//map.put(2, "A");//duplicate value is allowed
		//output will be like {2=A, 1=A}
		
		Map<Temp,String>map = new HashMap<>();
		map.put(new Temp(5), "A");
		map.put(new Temp(2), "A");
		map.put(new Temp(6), "A");
		map.put(new Temp(15), "D");
		map.put(new Temp(23), "E");
		map.put(new Temp(16), "F");
		map.put(new Temp(32), "G");
		
	
		//map.put(null, "B");//NPE
		//map.put(new Temp(2), null);//NPE
		System.out.println(map);
		//iterating formula
		// from top to bottom
		// from right to left
		
		
	}

}
