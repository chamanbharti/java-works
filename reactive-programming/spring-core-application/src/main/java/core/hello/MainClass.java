package core.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

//interface GreetingMessageService {
//	
//	public String greetUser();
//}

//@Service
//@Component
//here @Service and @Component work same
//class GreetingMessageServiceImpl implements GreetingMessageService {
//
//	@Override
//	public String greetUser() {
//		return "Welcome to Chapter-1 of book Learning Spring Application Development";
//	}
//	
//}

/*
It is replacement of beans.xml file

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.3.xsd">


	<context:component-scan base-package="chapter1.core" />
</beans> 
*/
//@Configuration
//@ComponentScan(basePackages = "chapter1.core")
//class App{
//	
//}

public class MainClass {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		GreetingMessageService greetingMessageService = context.getBean("greetingMessageServiceImpl",GreetingMessageService.class);
		System.out.println(greetingMessageService.greetUser());
	}
}
