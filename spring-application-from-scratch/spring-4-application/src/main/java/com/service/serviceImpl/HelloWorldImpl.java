package com.service.serviceImpl;

import org.springframework.stereotype.Component;

import com.service.HelloWorldService;

@Component
public class HelloWorldImpl  implements HelloWorldService{

	@Override
	public void sayHello() {
		 System.out.println("Hello World from is-a relationship!!!!");
	}

}
