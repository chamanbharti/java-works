package com.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashCodeTest {
	
	public static void main(String[] args){
		
		Employee e = new Employee();
		Employee ee = new Employee();
		Employee eee = new Employee();
		
		e.setId(100);
		ee.setId(100);
		eee.setId(100);
		
		//prints false in console
		/*System.out.println(e.equals(ee));//false if equals() is not overrided
		System.out.println(e == ee);//false if equals() is not overrided
		 */			
		
		//prints true in console
		System.out.println(e.equals(ee));// true after override equals()
		System.out.println(e == ee);//false
		
		Set<Employee> employees = new HashSet<>();
		employees.add(e);
		employees.add(ee);
		employees.add(eee);
		
		System.out.println(e.hashCode());
		System.out.println(ee.hashCode());
		System.out.println(eee.hashCode());
		
		//Prints two objects
		System.out.println(employees);
	}
	
	

}
