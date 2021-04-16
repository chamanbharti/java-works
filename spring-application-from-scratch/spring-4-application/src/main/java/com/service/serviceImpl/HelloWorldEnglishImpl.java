package com.service.serviceImpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.service.Greeting;

@Component
@Profile("english")
//@Profile("default")
//@Profile({"default","english"})
public class HelloWorldEnglishImpl  implements Greeting{

	@Override
	public String getGreeting() {
		return "Hello World in english!!!";
	}


}
