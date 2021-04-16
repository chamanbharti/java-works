package map.hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Demo {

	public static void main(String[] args) {
		
//		//Map<String,Object> hp = new Hashtable<>();//NullPointerException
//		Map<String,Object> hp = new HashMap<>();
//		//Map<String,Object> hp = new LinkedHashMap<>();
//		//Map<String,Object> hp = new WeakHashMap<>();
//		//Map<String,Object> hp = new IdentityHashMap<>();
//		//Map<String,Object> hp = new ConcurrentHashMap<>();//NullPointerException
////		hp.put(null, null);
////		hp.put(null, null);
//		
//		//put(String key, Integer value)
//		hp.put("z", 11);
//		hp.put("y", 12);
//		hp.put("c", 13);
//		hp.put("d", 14);
//		hp.put("e", 15);
//		System.out.println(hp);
//		//putIfAbsent(String key, Integer value)
//		hp.putIfAbsent("o", 20);
//		hp.putIfAbsent("o", 22);
//		
//		//HashMap API's for accessing keys and modifying their associated value
//		//isEmpty()
//		System.out.println(hp.isEmpty());
//		//size()
//		System.out.println(hp.size());
//		
//		//containsKey(Object key)
//		System.out.println("is key:c is available:"+hp.containsKey("c"));
//		//containsValue(Object value)
//		System.out.println("is value:12 is available:"+hp.containsValue(12));
//		//get(Object key)
//		System.out.println("get value of d:"+hp.get("d"));
//		
//		//HashMap remove API's with Examples
//		//remove(Object key)
//		System.out.println(hp.remove("o"));
//		//remove(Object key, Object value)
//		System.out.println(hp.remove("e",15));
//		System.out.println(Integer.MAX_VALUE);
//		
//		hp.forEach( (k,v) -> {
//			System.out.println(k+"="+v);
//		});
//		for(Map.Entry<String, Object>itr:hp.entrySet()) {
//			System.out.println(itr.getKey()+"="+itr.getValue());
//			System.out.println(itr.setValue(900));
//			
//		}
//		System.out.println(hp.keySet());
//		System.out.println(hp.values());
//		for(Entry<String,Object>j:hp.entrySet()) {
//			System.out.println(j.getKey()+"="+j.getValue());
//		}
//		
//		LinkedHashMap<String, String> userCityMapping = new LinkedHashMap<>();
//
//		userCityMapping.put("Rajeev", "Bengaluru");
//		userCityMapping.put("Chris", "London");
//		userCityMapping.put("David", "Paris");
//		userCityMapping.put("Jesse", "California");
//
//		 System.out.println(userCityMapping.entrySet().iterator());
//		 Map<Integer,String> identityHashMap = new IdentityHashMap<>();
//		 identityHashMap.put(1, "Java");
//         identityHashMap.put(new Integer(1), "J2EE");
//         identityHashMap.put(2, "J2SE");
//         identityHashMap.put(new Integer(2), "Spring");
//         identityHashMap.put(3, "Hibernate");
//         System.out.println(identityHashMap);
		
		int a=10;
		int b=20;
		int c=0;
		int tem=a;
		a=b;
		b=tem;
//		a=a+b;//10+20=30
//		b=a-b;//30-20=10
//		a=a-b;//30-10=20
		System.out.println("a="+a+" b="+b);
	
		int num=29;
		
		boolean flag=false;
		//for(int i=2;i<=num/2;i++) {
		int i=2;
		while(i<=num/2) {
			if(num%i==0) {
				flag=true;
				break;
			}
		 i++;
		}
		if(!flag) {
			System.out.println(num+" is prime");
		}else {
			System.out.println(num+" is not prime");
		}
         
	}
}
