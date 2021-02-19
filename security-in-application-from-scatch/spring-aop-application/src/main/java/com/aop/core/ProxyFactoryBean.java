package com.aop.core;

import java.util.List;

public class ProxyFactoryBean {

	private Object target;  
	private List interceptorNames;
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	public List getInterceptorNames() {
		return interceptorNames;
	}
	public void setInterceptorNames(List interceptorNames) {
		this.interceptorNames = interceptorNames;
	}  
	
}
