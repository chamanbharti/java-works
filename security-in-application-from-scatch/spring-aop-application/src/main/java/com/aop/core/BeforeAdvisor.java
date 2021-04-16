package com.aop.core;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("additional concern before actual logic"); 
		System.out.println("method info:"+method.getName()+" "+method.getModifiers());  
	    System.out.println("argument info:");  
	        for(Object arg:args)  
	            System.out.println(arg);  
	        System.out.println("target Object:"+target);  
	        System.out.println("target object class name: "+target.getClass().getName());  
	}

}
