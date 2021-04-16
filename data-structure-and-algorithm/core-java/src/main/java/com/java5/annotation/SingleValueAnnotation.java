package com.java5.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MySingleValue{
	// int value();
	int value() default 0;
}

//Applying annotation  
class Single {
	@MySingleValue(value = 11)
	public void print() {
		System.out.println("hello single value annotation");
	}
}
public class SingleValueAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Single h = new Single();
		Method m = h.getClass().getMethod("print");

		MySingleValue manno = m.getAnnotation(MySingleValue.class);
		System.out.println("value is: " + manno.value());
	}
}
