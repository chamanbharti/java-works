package com.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee  implements Comparable<Employee>
{
	private int id;//0
	private  String name;
	
	
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
	public int compareTo(Employee e) {
		
		//ascending  order
//		if(id==e.getId()) {
//			return 0;
//		}else if(id>e.getId()) {
//			return 1;
//		}
//		return -1;
		
//		return id - e.getId();
		
		//ascending  order
//		if(id==e.getId()) {
//			return 0;
//		}else if(id<e.getId()) {
//			return 1;
//		}
//		return -1;
		
//		return e.getId() - id;
		
		//insertion order
//		if(e.getId() == e.getId()) {
//			return 0;
////		}else if(e.getId() > e.getId()) {
//		}else if(e.getId() < e.getId()) {
//			return 1;
//		}
//		return -1;
		
		return e.getId() - e.getId();
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(2, "Chaman");
		Employee e2 = new Employee(1, "Dheeraj");
		Employee e3 = new Employee(21, "Aman");
		Employee e4 = new Employee(11, "Shyaam");
		List<Employee>list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		Collections.sort(list); 
//		Collections.sort(list, Collections.reverseOrder());  
		for(Employee st:list){  
		System.out.println(st.getId()+" "+st.getName());  
		}
		
		
	}
}
