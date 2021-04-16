package com.logicbig;

public class MyProcessor {

	private MyService myService;
	
	public MyProcessor(MyService myService) {
		this.myService = myService;
	}
	
	public String process() {
		int returnInteger = myService.doSomething();
		return String.format("My Integer is: " + returnInteger);
	}
}
