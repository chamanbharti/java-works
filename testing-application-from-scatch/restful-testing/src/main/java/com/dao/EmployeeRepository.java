package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{}
