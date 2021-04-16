package com.designpattern;

import java.io.Serializable;

public class Student implements Serializable {

	/*private static final Student s=new Student();//eager loading
	private Student() {}
	public static Student getInstance() {
		return s;
	}*/
	/*private static Student s;//static block for exception handling
	private Student() {}
	static {
		try {
			s=new Student();
		}catch(Exception e) {
			throw new RuntimeException("Exception occured:");
		}
	}
	public static Student getInstance() {
		return s;
	}*/
	
	/*private static Student s;//lazy loading
	private Student() {
		
	}
	
	public static Student getInstance() {
		if(s==null) {
			s=new Student();
		}
		return s;
	}*/
	
	/*private static Student s;
	private Student() {}
	//thread safe singleton
	public static synchronized Student getInstance() {
		if(s==null) {
			s=new Student();
		}
		return s;
	}*/
	//double checked locking
	/*public static Student getInstance() {
		if(s==null) {
			synchronized (Student.class) {
				if(s==null) {
					s=new Student();
				}
			}
		}
		return s;
	}*/
	//Bill Pugh implementation
	private Student() {}
	private static class Helper{
		private static final Student s=new Student();
	}
	public static Student getInstance() {
		return Helper.s;
	}
	
	 Object readResolve() {
		return getInstance();

	}
}
