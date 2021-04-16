package core.ioc.xml.eager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EargerLoading {

	public static void main(String[] args) {
		
		System.out.println("..Eager Loading...");
		ApplicationContext context = new ClassPathXmlApplicationContext("eagerLoading.xml");
		Message message = (Message)context.getBean("helloWorld");
		message.getMessage();
	}
}
