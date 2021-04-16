package com.rest.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.dao.EmployeeRepository;
import com.model.Employee;
import com.service.EmployeeService;
@RunWith(SpringRunner.class)
public class EmployeeIntegrationTesting {

	@Autowired
	private EmployeeService service;
	
	@MockBean
	private EmployeeRepository repository;
	
	@Test
	public void getEmployeesTest() {
		when(repository.findAll()).thenReturn(Stream.of(new Employee("Roshan","Bharti","roshan.bharti@gmail.com")).collect(Collectors.toList()));
		assertEquals(3, service.getEmployees().size());
	}
}
