package com.java8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo2 {
	public static void main(String[] args) {
		
//		List<Employee> employeeList = createEmployeeList();
//		Optional<Employee> employee = findEmployee(employeeList,"Adam");
//		if(employee.isPresent()) {
//			//employee = null;
//			Employee employee1 = employee.get();
//			System.out.println("Employee name: "+employee1.getName());
//		}else {
//			System.out.println("There is no employee with name Adam");
//		}
		
		//Check value in Optional
		//You can check if there is value wrapped inside Optional using isPresent method.
//		List<Employee> employeeList = createEmployeeList();
//		Optional<Employee> employee = findEmployee(employeeList,"Adam");
//		if(employee.isPresent()) {
//		//employee = null;
//		Employee employee1 = employee.get();
//		System.out.println("Employee name: "+employee1.getName());
//		}else {
//			System.out.println("There is no employee with name Adam");
//		}
		
		//Conditional action in Optional
		//You can use ifPresent method to execute action if value is present in Optional.
//		List<Employee> employeeList = createEmployeeList();
//		Optional<Employee> employee1 = findEmployee(employeeList,"Adam");
//		Optional<Employee> employee2 = findEmployee(employeeList,"John");
//		
//		employee1.ifPresent( (employee)->System.out.println("Employee name: "+employee.getName()+" found in list"));
//		employee2.ifPresent( (employee)->System.out.println("Employee name: "+employee.getName()+" found in list"));
	
		//Default value in Optional using orElse
		//You can return default value in case there is no value in Optional using orElse method.
//		List<Employee> employeeList = createEmployeeList();
//		Optional<Employee> employeeOpt = findEmployee(employeeList,"Adam");
//		Employee employee1 = employeeOpt.orElse(new Employee("Dummy",0));
//		System.out.println("Employee name: "+employee1.getName());
//		
//		Optional<Employee> employeeOpt2 = findEmployee(employeeList,"Martin");
//		Employee employee2= employeeOpt2.orElse(new Employee("Dummy",0));
//		System.out.println("Employee name: "+employee2.getName());
		
		//Default value in Optional using orElseGet
		//orElseGet is lazy counter part of orElse.
		//It takes supplier as parameter and will be called only if value is not present in Optional.
		
//		List<Employee> employeeList = createEmployeeList();
//		Optional<Employee> employeeOpt = findEmployee(employeeList,"Adam");
//		Employee employee1 = employeeOpt.orElseGet(()->new Employee("Dummy",0));
//		System.out.println("Employee name: "+employee1.getName());
//		
//		Optional<Employee> employeeOpt2 = findEmployee(employeeList,"Martin");
//		Employee employee2 = employeeOpt2.orElseGet(()->new Employee("Dummy",0));
//		System.out.println("Employee name: "+employee2.getName());
		
		//Throwing exception from Optional
		//You can use orElseThrow to throw exception in case Optional is empty. 
		//It is similar to get() method but in this case, 
		//you can choose to throw any Exception rathar than NoSuchMethodException.
		
		List<Employee> employeeList = createEmployeeList();
		Optional<Employee> employeeOpt = findEmployee(employeeList,"Adam");
		Employee employee1 = employeeOpt.orElseThrow(() -> new RuntimeException("Employee not found"));
		System.out.println("Employee name: "+employee1.getName());
		
		Optional<Employee> employeeOpt2 = findEmployee(employeeList,"Martin");
		Employee employee2 = employeeOpt2.orElseThrow(() -> new RuntimeException("Employee not found"));
		System.out.println("Employee name: "+employee2.getName());
		
	}

	private static Optional<Employee> findEmployee(List<Employee> employeeList, String name) {
		for(Employee e: employeeList) {
			if(e.getName().equalsIgnoreCase(name)) {
				return Optional.of(e);
			}
		}
		return Optional.empty();
	}

	private static List<Employee> createEmployeeList() {
		List<Employee> employeeList=new ArrayList<>();
		
		Employee e1=new Employee("John",21);
		Employee e2=new Employee("Martin",22);
		Employee e3=new Employee("Mary",31);
		Employee e4=new Employee("Stephan",18);
		Employee e5=new Employee("Gary",26);
		
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		
		return employeeList;
	}

}
