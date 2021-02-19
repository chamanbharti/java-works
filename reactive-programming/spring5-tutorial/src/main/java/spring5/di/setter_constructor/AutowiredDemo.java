package spring5.di.setter_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AutowiredDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
		Company company = context.getBean("company",Company.class);
		company.companyWork();
		
	}
	
	
}
