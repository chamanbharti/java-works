package failfast_failsafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastDemo01 {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("Apple", "iPhone");
		map.put("HTC", "HTC one");
		map.put("Samsung", "S5");
		
		 // getting iterator
		 System.out.println("size before iteration " +map.size());
		Iterator<String> itr = map.keySet().iterator();
		while(itr.hasNext()){
			
			System.out.println(map.get(itr.next()));
			// trying to add new value to a map while iterating it
			//map.put("Lenovo", "K Notes");//it will show CME
			//updating existing value while iterating
			//map.put("Samsung", "J2");//it will not show any Exception
			// removing value using iterator remove method
			//map.remove("HTC");//it will show CME
			itr.remove();//it will not show any Exception
			
			
		}
		System.out.println("size after iteration "+map.size());
	}

}
