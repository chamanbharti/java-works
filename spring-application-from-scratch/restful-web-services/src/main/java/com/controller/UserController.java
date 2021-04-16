package com.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("users")// http://localhost:8080/users
public class UserController {

	@GetMapping(path = "/{userId}")
	public  String getUser(@PathVariable String userId) {
		return "get user was called with userId:"+userId;
	}
	
//	@GetMapping
//	public  String getUser(@RequestParam(value = "page", defaultValue = "1") int page,
//	@RequestParam(value = "limit", defaultValue = "50") int limit) {
//		return "get user was called with page:"+page+" limit:"+limit;
//	}
	
	//it gets error
//	@GetMapping
//	public  String getUser(@RequestParam(value = "page", required = false) int page,
//	@RequestParam(value = "limit", defaultValue = "50") int limit) {
//		return "get user was called with page:"+page+" limit:"+limit;
//	}
	
	@GetMapping
	public  String getUser(
			@RequestParam(value = "page",  defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "50") int limit,
			@RequestParam(value = "sort",defaultValue = "desc",  required = true) String sort
			) {
		return "get user was called with page:"+page+" limit:"+limit+" sort:"+sort;
	}
	
	@GetMapping("/foos")
	@ResponseBody
	public String getFoos(@RequestParam String id) {
	    return "ID: " + id;
	}
	
	@PostMapping
	public  String createUser() {
		return "create user was called";
	}
	
	@PutMapping
	public  String updateUser() {
		return "update user was called";
	}
	
	@PatchMapping
	public  String partialUpdateUser() {
		return "partial update user was called";
	}
	
	@DeleteMapping
	public  String deleteUser() {
		return "delete user was called";
	}
}
