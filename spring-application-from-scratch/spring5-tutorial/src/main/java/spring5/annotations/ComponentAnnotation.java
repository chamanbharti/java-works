package spring5.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Company{
	
	@Autowired
	//@Qualifier("hardwareEngineer")
	Engineer engineer;
//	final String s="MPS Limited";
//	@Value(s)
	@Value("${company.name}")
	String companyName;
	
	public void show() {
		System.out.println("Hello Company:"+companyName);
	}
}

interface Engineer{
	void development();
}
@Component
@Primary
class SoftwareEngineer implements Engineer{
	public void development() {
		System.out.println("software development");
	}
}

@Component

class HardwareEngineer implements Engineer{
	public void development() {
		System.out.println("Hardware development");
	}
}

public class ComponentAnnotation {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);//ClassPathXmlApplicationContext("component.xml");
		Company company = context.getBean("company",Company.class);
		company.show();
		company.engineer.development();
		
	}
}

@Configuration
@ComponentScan(basePackages = "spring5.annotations.part1")
@PropertySource("classpath:company-info")
class Config{
	
//	@Bean
//	public SoftwareEngineer engineer() {
//		return new SoftwareEngineer();
//	}
//	
//	@Bean
//	public Company company() {
//		Company company = new Company();
//		company.setEngineer(engineer());
//		return company;
//	}
}
//it is used instead of xml beans file