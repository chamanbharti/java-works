package core.ioc.xml.lazy;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import core.hello.GreetingMessageService;
public class LazyLoading {

	public static void main(String[] args) {
		
		System.out.println("...Lazy Loading...");
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("lazyLoading.xml"));
		Message message = (Message)factory.getBean("helloWorld");
		message.getMessage();
	}
}
