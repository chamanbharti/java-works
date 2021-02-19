package spring5.di.setter_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDI {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
		Bike bike = (Bike)context.getBean("bike2");
		bike.showColor();
	}
}
