package map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person(1, "Chaman");
		Person p2 = new Person(2, "Chaman");
		Person p3 = new Person(2, "Chaman");
		
		Map<Person, String> map = new HashMap<Person, String>();
		map.put(p1, "person1");
		map.put(p2, "person2");
		map.put(p3, "person3");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		for(Entry<Person, String> entry : map.entrySet()){
			
			System.out.println(entry.getKey().getId()+"-"+entry.getKey().getName());
		}
		System.out.println(map.get(p3));
		System.out.println(map.get(new Person(1,"Chaman")));
	}
}
