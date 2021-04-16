package com.jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassLoaderDemo1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			//@SuppressWarnings("unchecked")
			Class<Student> c = (Class<Student>) Class.forName("com.jvm.Student");
			Method[] methods = c.getDeclaredMethods();
			for(Method m:methods) {
				System.out.println(m);
			}
			Field[] fields = c.getDeclaredFields();
			for(Field f:fields) {
				System.out.println(f);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
