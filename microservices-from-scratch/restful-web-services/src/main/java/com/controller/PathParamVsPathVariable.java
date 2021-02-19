package com.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//https://www.baeldung.com/spring-requestparam-vs-pathvariable
@RestController
public class PathParamVsPathVariable {

	// PathVariable
	@GetMapping("/add1/{a}/{b}")
	public int addition(@PathVariable int a, @PathVariable int b) {
		return a+b;
	}
	
	@GetMapping("/add2/{a}/{b}")
	public int addition2(@PathVariable("a") int a, @PathVariable("b") int b) {
		return a+b;
	}
	
	// PathParam
	@GetMapping("/add3")
	public int addition3(@PathParam("a") int a, @PathParam("b") int b) {
		return a+b;
	}

}
