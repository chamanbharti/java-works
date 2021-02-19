package failfast_failsafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastDemo0 {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("Apple", "iPhone");
		map.put("HTC", "HTC one");
		map.put("Samsung", "S5");
		
		 // getting iterator
		Iterator<String> itr = map.keySet().iterator();
		while(itr.hasNext()){
			String obj = itr.next();
			//String obj2 = map.get(obj);
			System.out.println(map.get(obj));
			//String delete = map.remove(obj2);
			//map.put("Sony", "Xperia Z");
			itr.remove();
			
		}
	}

}
