package spring5.di.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHuman {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
		Human human = context.getBean("human", Human.class);
		human.startPumping();
	}
}
