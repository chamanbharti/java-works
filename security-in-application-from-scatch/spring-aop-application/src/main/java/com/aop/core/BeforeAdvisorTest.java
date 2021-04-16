package com.aop.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeforeAdvisorTest {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("beforeMethod.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		A a = factory.getBean("proxy", A.class);
		System.out.println("proxy class name: "+a.getClass().getName());  
		a.m();
	}
}
