package com.designpattern;

import java.lang.reflect.Constructor;

public class Reflection {

	public static void main(String[] args) {
		Student s1 = Student.getInstance();
		Student s2 = null;
		try {
			Constructor[] constructors = Student.class.getDeclaredConstructors();
			for(Constructor constructor:constructors) {
				constructor.setAccessible(true);
				s2 = (Student)constructor.newInstance();
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
