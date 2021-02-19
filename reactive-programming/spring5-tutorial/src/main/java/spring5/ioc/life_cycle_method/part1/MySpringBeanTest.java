package spring5.ioc.life_cycle_method.part1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringBeanTest {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfiguration.class);
		MySpringBean object = context.getBean(MySpringBean.class);
		object.show();
		context.close();
	}
}
