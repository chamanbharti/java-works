package aop.hello_world;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBean(Operation.class);
		Operation op = new Operation();
		op.sum(45, 5);
		context.close();
	}
}
