package com.Array_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CustomSorting2 {
	
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "Zues", 26));
		al.add(new Employee(505, "Abey", 24));
		al.add(new Employee(809, "Vignesh", 32));
		
		/*Sorting based on Employee Name*/
		 System.out.println("Employee Name Sorting:");
		Collections.sort(al,Employee.employeeName); 
		
		for(Employee e:al){
			System.out.println(e);
		}
		
		//Sorting based on Employee id
		System.out.println("EmployeeId Sorting:");
		Collections.sort(al, Employee.empId);
		for(Employee id:al){
			System.out.println(id);
		}
	}

}
