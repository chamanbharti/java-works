package spring5.ioc.life_cycle_method;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle2 {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleMethod.xml");
		System.out.println("-------------------------------------------------------");
		Employee2 employee = context.getBean("employee2", Employee2.class);
		System.out.println(employee);
		context.close();
	}
}
