package com.di.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.HelloWorldService;


@Component
public class InjectedByConstructorService {


	private HelloWorldService helloWorldService;
	
	@Autowired
	public InjectedByConstructorService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	public void getMessage() {
		helloWorldService.sayHello();
	}
}
