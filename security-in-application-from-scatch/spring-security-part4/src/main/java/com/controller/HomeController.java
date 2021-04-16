package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.MyUserService;

@RestController
public class HomeController {

	@Autowired
	MyUserService service;
	
	@GetMapping("/test2")
	public String sayHi() {
		return "Hi Spring Security using UserDetailsManager!!";
	}
	
	@PostMapping("/createUser")
	public void addUser(@RequestBody User user) {
		service.addUser(user);
	}
}
