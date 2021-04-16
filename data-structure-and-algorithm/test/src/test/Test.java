package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
class Employee{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		
		
//		Set<String>set = new HashSet<>();
//		String s1 = new String("Chaman");
//		String s2 = new String("Chaman");
//		set.add(s1);
//		set.add(s2);
//		System.out.println(set.size());//1
		
//		Set<Integer>set = new HashSet<>();
//		Integer s1 = 10;
//		Integer s2 = 10;
//		set.add(s1);
//		set.add(s2);
//		System.out.println(set.size());//1
		
//		Set<Employee>set = new HashSet<>();
//		Employee e1 = new Employee(10,"Chaman");
//		Employee e2 = new Employee(10,"Chaman");
//		set.add(e1);
//		set.add(e2);
//		set.add(e2);
//		System.out.println(e1.hashCode());
//		System.out.println(e2.hashCode());
//		System.out.println(set.size());//1
		
//		List<Integer>list = new ArrayList<>();
//		list.add(1);
//		list.add(1);
//		list.add(2);
//		List<Integer>list2 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(list2);
		
//		List<String>list = new ArrayList<>();
//		list.add("1");
//		list.add("1");
//		list.add("2");
//		for(String s:list) {
//		int i = Integer.valueOf(s);
//		if(i%2==0) {
//			list2.add(s);
//		}
//		
//	}
//		List<String>list2 = list.stream().filter(i->Integer.valueOf(i)%2==0).collect(Collectors.toList());
//		List<String>list2 = list.stream().filter(i->(Integer.valueOf(i))%2 !=0).collect(Collectors.toList());
//		System.out.println(list2);
		
//		String s1 = "Chaman";
//		String s2 = "Chaman";
//		System.out.println(s1== s2);//true
//		System.out.println(s1.equals(s2));//true
		
		String s1 = "Chaman";
		String s2 = new String("Chaman");
		System.out.println(s1== s2);//false
		System.out.println(s1.equals(s2));//true
	}
}
