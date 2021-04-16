package com.service.serviceImpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.service.Greeting;

@Component
@Profile("spanish")
public class HelloWorldSpanishImpl  implements Greeting{

	@Override
	public String getGreeting() {
		return "Hola mundo in spanish!!!";
	}


}
