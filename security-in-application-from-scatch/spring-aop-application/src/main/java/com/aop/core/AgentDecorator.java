package com.aop.core;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AgentDecorator implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("James");
		Object returnValue = invocation.proceed();
		System.out.println("!");
		return returnValue;
	}

}
