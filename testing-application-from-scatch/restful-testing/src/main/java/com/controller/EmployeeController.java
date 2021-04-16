package com.controller;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.dao.EmployeeRepository;
import com.model.Employee;
import com.model.Employees;

@RestController()
@RequestMapping(path = "/employees")
public class EmployeeController {

	@Autowired
    private EmployeeRepository employeeRepository;
	
	@GetMapping(path="/", produces = "application/json")
    public Employees getEmployees() 
    {
		Employees response = new Employees();
		ArrayList<Employee> list = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(e->list.add(e));
		response.setEmployeeList(list);
        return response;
    }
	
	@PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {       
                 
        //add resource
		employeeRepository.save(employee);
         
        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(employee.getId())
                                    .toUri();
        //Send location in response
        return ResponseEntity.created(location).build();
    }
}
