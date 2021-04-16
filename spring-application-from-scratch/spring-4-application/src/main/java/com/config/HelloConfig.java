package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.service.Greeting;
import com.service.serviceImpl.HelloWorldEnglishImpl;
import com.service.serviceImpl.HelloWorldSpanishImpl;

@Configuration
public class HelloConfig {
	
	
	@Bean
	@Profile("spanish")
	public Greeting HelloWorldSpanishImpl() {
		return new HelloWorldSpanishImpl();
	}
	
	@Bean
	@Profile("english")
	public Greeting HelloWorldEnglishImpl() {
		return new HelloWorldEnglishImpl();
	}

}
