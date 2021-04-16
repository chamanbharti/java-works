package com.di.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.HelloWorldService;

@Component
public class InjectedBySetterService {

	private HelloWorldService helloWorldService;
	
	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	public void getMessage() {
		helloWorldService.sayHello();
	}
}
