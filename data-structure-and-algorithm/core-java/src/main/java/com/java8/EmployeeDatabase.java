package com.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

	public static List<Employee> getEmployee(){
		return Stream.of(
				new Employee(101,"john","A",60000,32),
				new Employee(109,"peter","B",30000,32),
				new Employee(102,"mak","A",80000,32),
				new Employee(103,"kim","A",90000,32),
				new Employee(104,"json","C",15000,32)
				
				)
				.collect(Collectors.toList());
	}
}
