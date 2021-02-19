package java8.map.flatmap;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Student{
	int i=10;
	public Student(int i) {
		this.i = i;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (i != other.i)
//			return false;
//		return true;
//	}
	
}
public class Test {

	public static void main(String[] args) {
//		HashMap<Student,String> map = new HashMap<>();
		
//		HashSet<Student>set = new HashSet<>();
//		Student s1 = new Student(10);
//		Student s2 = new Student(10);
//		set.add(s1);
//		set.add(s2);
//		System.out.println("SET:"+set.size());
//		
//		HashSet<Integer>set2 = new HashSet<>();
//		Integer i = 10;
//		Integer j = 10;
//		set2.add(i);
//		set2.add(j);
//		System.out.println("SET:"+set2.size());
//		map.put(s1, "Alok");
//		map.put(s2, "Alok");
//		System.out.println("MAP:"+map.size());
//		
//		String s="Alok";
//		String ss = new String("Alok");
//		System.out.println(s.equals(ss));
//		System.out.println(s==ss);
//		String sss = new String("Alok");
//		System.out.println(ss.equals(sss));
//		System.out.println(ss==sss);
//		
		 Map<String, Integer> unsortMap = new HashMap<>();
	        unsortMap.put("z", 10);
	        unsortMap.put("b", 5);
	        unsortMap.put("a", 6);
	        unsortMap.put("c", 20);
	        unsortMap.put("d", 1);
	        unsortMap.put("e", 7);
	        unsortMap.put("y", 8);
	        unsortMap.put("n", 99);
	        unsortMap.put("g", 50);
	        unsortMap.put("m", 2);
	        unsortMap.put("f", 9);
	        System.out.println(unsortMap.entrySet().iterator().next());
	        System.out.println(unsortMap.entrySet().stream().findFirst().get());
//	        
//	        Map<String, Integer> result = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
//	        		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue) -> oldValue,LinkedHashMap::new));
//	      System.out.println(result);  

}
}
