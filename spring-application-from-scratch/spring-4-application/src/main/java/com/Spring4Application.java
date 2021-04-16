package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.controller.GreetingController;
import com.di.constructor.InjectedByConstructorService;
import com.di.setter.InjectedBySetterService;
import com.service.Greeting;
import com.service.WeatherService;
@SpringBootApplication
public class Spring4Application implements CommandLineRunner{

	@Autowired
    private WeatherService weatherService;
	
	public static void main(String[] args) {
		//SpringApplication.run(Spring4Application.class, args);
		
		ApplicationContext context = SpringApplication.run(Spring4Application.class, args);
		
//		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//		helloWorld.sayHello();
		
//		HelloWorldImpl helloWorld = (HelloWorldImpl) context.getBean("helloWorldImpl");
//		helloWorld.sayHello();
		
//		InjectedByConstructorService injectedByConstructorService = (InjectedByConstructorService) context.getBean("injectedByConstructorService");
//		injectedByConstructorService.getMessage();
//		
//		InjectedBySetterService injectedBySetterService = (InjectedBySetterService) context.getBean("injectedBySetterService");
//		injectedBySetterService.getMessage();
		
		GreetingController controller = (GreetingController) context.getBean("greetingController");
		controller.sayHello();
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(weatherService.forecast());
		
	}

}
