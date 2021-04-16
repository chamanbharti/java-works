package spring5.ioc.life_cycle_method;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle3 {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleMethod.xml");
		System.out.println("-------------------------------------------------------");
		Employee3 employee = context.getBean("employee3", Employee3.class);
		System.out.println(employee);
		context.close();
	}
}
