package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.ResourceNotFoundException;
import com.model.Student;
import com.model.UserDetail;
import com.repository.StudentRepository;
@CrossOrigin(origins = "*")
//@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	BiPredicate<String, String>isNullOrEmpty = (s1,s2) -> (s1 != null && s2 != null) && (s1.length() !=0 && s2.length() != 0);
	BiPredicate<String, String>isBothNotEqual = (s1,s2) -> (s1.equals(s2));
	
	Map<String, String> errors;
	@PostMapping(path = "/student")
	public ResponseEntity<Object> createStudent(@RequestBody @Valid Student student, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			errors = new HashMap<>();
			for (FieldError error:bindingResult.getFieldErrors()) {
				errors.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Object>(errors, HttpStatus.NOT_ACCEPTABLE);
		}
		Student st = studentRepository.findByEmail(student.getEmail());
		if(st != null) {
//			return new ResponseEntity<Object>(HttpStatus.CONFLICT);
			return new ResponseEntity<Object>("Duplicate email id",HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Object>(studentRepository.save(student),HttpStatus.OK);
	}
	
//	@PostMapping(path = "/user")
//	public ResponseEntity<User> createUser(User user) {
//		return ResponseEntity.ok().body(studentRepository.save(user));
//	}
	
//	@GetMapping(path = "/users")
//	public List<User> getUsers() {
//		return studentRepository.findAll();
//	}
	
//	@GetMapping(path = "/users")
//	public ResponseEntity<List<User>> getUsers() {
//		return ResponseEntity.ok().body(studentRepository.findAll());
//	}
	
//	
//	@GetMapping("/user/{id}")
//	public User getUser(@PathVariable(value = "id") Long id)
//			throws ResourceNotFoundException {
//		User user = studentRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + id));
//		return user;
//	}
//	
//	
//	@PutMapping("/user")
//	public User updateUser(@RequestBody User user) {
//		return studentRepository.save(user);
//	}
	
//	@GetMapping("/user/{id}")
//	public ResponseEntity<User> getUser(@PathVariable(value = "id") Long id)
//			throws ResourceNotFoundException {
//		User user = studentRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + id));
//		return ResponseEntity.ok().body(user);
//	}
	
//	@DeleteMapping("/user/{id}")
//	public boolean deleteUser(@PathVariable(value = "id") Long id) {
//		studentRepository.deleteById(id);
//		return true;
//	}
	
//	@DeleteMapping("/user/{id}")
//	public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long id)
//			throws ResourceNotFoundException {
//		User user = studentRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + id));
//
//		studentRepository.delete(user);
//		Map<String, Boolean> response = new HashMap<>();
//		response.put("deleted", Boolean.TRUE);
//		return response;
//	}
	
}

