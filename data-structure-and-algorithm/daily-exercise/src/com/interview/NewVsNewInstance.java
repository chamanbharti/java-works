package com.interview;

public class NewVsNewInstance {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//if i know class name in beginning
		/*Test t = new Test();
		Student s = new Student();
		Customer c = new Customer();*/
		
		//if i don't know class name in beginning
		Object o = Class.forName(args[0]).newInstance();
		System.out.println("object created for "+o.getClass().getName());
	}
}
