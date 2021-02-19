package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.EmployeeRepository;
import com.model.Employee;

public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public List<Employee> getEmployees() {
		List<Employee> employees = (List<Employee>) employeeRepository.findAll();
		return employees;
	}
	
	public void deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}
}
