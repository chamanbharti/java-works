package spring5.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		//before IOC
		
//		Airtel airtel = new Airtel();
//		airtel.calling();
//		airtel.data();
		
//		Vodafone vodafone = new Vodafone();
//		vodafone.calling();
//		vodafone.data();
		
//		Sim airtel = new Airtel();
//		airtel.calling();
//		airtel.data();
		
//		Sim vodafone = new Vodafone();
//		vodafone.calling();
//		vodafone.data();
		
		//after ioc
		//there are two types ioc:: 1. BeanFactory 1. ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
		System.out.println("config loaded..");
		Airtel air = (Airtel) context.getBean("airtel");
		air.calling();
		air.data();
		
		Vodafone voda = (Vodafone) context.getBean("vodafone");
		voda.calling();
		voda.data();
		
	}
}
