package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

@RestController
@RequestMapping("/student")
public class BestPracticeToMakeAPI {

	@Autowired
	private StudentService service;
	
	//1. save
//	@PostMapping("/create")
//	public ResponseEntity<String> saveStudent(@RequestBody @Validated Student student){
//		Integer id = service.saveStudent(student);
//		String body = "Student saved with id "+id;
//		return ResponseEntity.ok(body);
//	}
	
	Map<String, String> errors;
	@PostMapping(path = "/create")
	public ResponseEntity<Object> saveStudent(@RequestBody @Validated Student student, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			errors = new HashMap<>();
			for (FieldError error:bindingResult.getFieldErrors()) {
				errors.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Object>(errors, HttpStatus.NOT_ACCEPTABLE);
     }
		
		Optional<Integer> opt = Optional.ofNullable(student.getStdId());
		
		if(!opt.isPresent()) {
			return new ResponseEntity<Object>("id is mandatory",HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Object>(service.saveStudent(student),HttpStatus.OK);
	}
		
	
	//2. fetch all
	@GetMapping("/all")
	public ResponseEntity<List<Student>>getAllStudent(){
		List<Student>list = service.getAllStudents();
		return ResponseEntity.ok(list);
	}
	
	//3. fetch one
	@GetMapping("/one/{id}")
	public ResponseEntity<Student>getOneStudent(@PathVariable Integer id){
		Student s = service.getOneStudent(id);
		return ResponseEntity.ok(s);
	}
	//4. delete
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String>deleteStudent(@PathVariable Integer id){
		service.deleteStudent(id);
		String body = "Student deleted! its id was "+id;
		return ResponseEntity.ok(body);
	}
		
	//5. update
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateStudent(@RequestBody Student student){
		service.updateStudent(student);
		String body = "Student updated "+student.getStdId();
		return ResponseEntity.ok(body);
	}
}
