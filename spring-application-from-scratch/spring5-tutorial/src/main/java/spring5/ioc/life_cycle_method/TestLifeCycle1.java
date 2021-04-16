package spring5.ioc.life_cycle_method;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle1 {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleMethod.xml");
		System.out.println("-------------------------------------------------------");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
		context.close();
	}
}
