package com.java5.annotation;

//Creating annotation  
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
	int value();
	String value2() default "default value";
}

//Applying annotation  
class Hello {
	@MyAnnotation(value = 10)
	public void sayHello() {
		System.out.println("hello annotation");
	}
	@MyAnnotation(value2 = "programiz", value = 0)
	  public void method1() {
	    System.out.println("Test method 1");
	  }
}

public class CustomAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Hello h = new Hello();
		Method m = h.getClass().getMethod("sayHello");

		MyAnnotation manno = m.getAnnotation(MyAnnotation.class);
		System.out.println("value is: " + manno.value());
		
		h.method1();
		
		float first = 1.5f;
        float second = 2.0f;

        float product = first % second;

        System.out.println("The product is: " + product);
	}
}
