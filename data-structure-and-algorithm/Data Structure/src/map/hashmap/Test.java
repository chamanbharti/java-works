package map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Radek");
		map.put(2, "Jonh");
		map.put(3, "Gracy");
		
		//iterate map's elements
		
		//map view
		System.out.println("Map View");
		System.out.println(map);//{1=Radek, 2=Jonh, 3=Gracy}
		 
		
		//Collection View Of Map
		
		 //1 Set entrySet()
		 //As Key-Value Pair
		System.out.println("1 Set entrySet()\nAs Key-Value Pair");
		  Set set = map.entrySet();
		  System.out.println(set);//[1=Radek, 2=Jonh, 3=Gracy]
		  
		  //2 Set keySet() 
		  //As Key Only
		  System.out.println("2 Set keySet() \nAs Key Only");
		  Set set2 = map.keySet();
		  System.out.println(set2);//[1, 2, 3]
		  
		//3 Collection values()
		//As Value Only
		  System.out.println("3 Collection values()\nAs Value Only");
		  Collection values = map.values();//[Radek, Jonh, Gracy]
		  System.out.println(values);
		  
		//4 Converting to Set so that we can traverse
		  //this is Non Generic old style 
	  System.out.println("4 Converting to Set so that we can traverse\nthis is Non Generic old style");
	  Set set3 = map.entrySet();
	  Iterator itr = set3.iterator();
	  while(itr.hasNext()) {
		//Converting to Map.Entry so that we can get key and value separately  
		  Map.Entry entry = (Map.Entry)itr.next();
		  System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
	  }
		 
		//5 using for loop  
		System.out.println("5 using for loop");
		  for(Map.Entry m:map.entrySet()) {
			  System.out.println("Key:"+m.getKey()+" Value:"+m.getValue());
		  }
		  
		//6 using for loop using key-value
		System.out.println("5 using for loop using key-value");
		  for(Map.Entry m:map.entrySet()) {
			  Integer key = (Integer) m.getKey();
			  String value = (String) m.getValue();
			  System.out.println("Key:"+key+" Value:"+value);
		  }
			  
		//7. Using entrySet()
	   System.out.println("7. Using entrySet()");
	   for(Map.Entry<Integer,String>entry:map.entrySet()) {
		   System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
	   }
		 
		//8.Using iterator() through the KeySet()
	   System.out.println("8.Using iterator() through the KeySet()");
	   Iterator iterator = map.keySet().iterator();
	   while(iterator.hasNext()) {
		   Integer key = (Integer) iterator.next();
		   System.out.println("Key:"+key+" value:"+map.get(key));
	   }
	   
	   //9.Using forEach() Java 8
	   System.out.println("9.Using forEach() Java 8");
	   map.forEach((key,value) ->{
		   System.out.println("Key:"+key+" Value:"+value);
	   });
	   
	   //10.Using stream() Java 8
	   System.out.println("10.Using stream() Java 8");
	   map.entrySet().stream().forEach( e->
	   System.out.println("Key:"+e.getKey()+" Value:"+e.getValue())
	   );
	   
	}
}
