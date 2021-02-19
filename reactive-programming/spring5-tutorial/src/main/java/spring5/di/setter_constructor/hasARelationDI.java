package spring5.di.setter_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class hasARelationDI {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
		Car car = context.getBean("car",Car.class);
		car.startEngine();
		car.showColor();
		
	}
	
	
}
