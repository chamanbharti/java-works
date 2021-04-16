package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.service.Greeting;

@Controller
public class GreetingController {

	private Greeting greeting;

	@Autowired
	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	
	public String sayHello() {
		String s = greeting.getGreeting();
		System.out.println(s);
		return s;
	}
	
	
}
