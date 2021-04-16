package spring5.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

interface HelloWorld {

	void sayHello(String name);
}

@Component
class HelloWorldImpl implements HelloWorld{

	@Override
	public void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	
}

@Configuration
@ComponentScan(basePackages = "spring5.annotations.part1")
class HelloWorldConfig {

//	@Bean(name="helloWorldBean")
//    @Description("This is a sample HelloWorld Bean")
//	public HelloWorld helloWorld() {
//		return new HelloWorldImpl();
//	}
}
/*
 Above configuration is same as below Spring XML representation(let’s name it helloworld-config.xml):

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
        
  <!-- collaborators and configuration for this bean go here -->
    <bean id="helloWorldBean" class="spring5.annotations.part1.HelloWorldImpl">
  
</beans>
 */

public class HelloWorldTest {

	public static void main(String[] args) {
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//        HelloWorld bean = (HelloWorld) context.getBean("helloWorld");
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//        HelloWorld bean = context.getBean("helloWorld",HelloWorld.class);
//        bean.sayHello("Spring 5");
		
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld bean = (HelloWorld) context.getBean("helloWorldImpl",HelloWorldImpl.class);
        bean.sayHello("Spring 5");
        context.close();
		
        
	}
}
/*
That’s it. For XML based configuration, above main class can be written as follows:

spring5.annotations.part1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring5.annotations.part1.HelloWorld;

public class AppMain {

   public static void main(String args[]) {
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("helloworld-config.xml");
       HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
       bean.sayHello("Spring 4");
       context.close();

   }

}
helloworld-config.xml is the file 
we discussed in step 3 created somewhere in project classpath (/src/main/resources e.g).
        
*/
