package com.java8.method_reference;

import java.util.Arrays;
import java.util.List;
interface A{
	public void m1();
}
public class MethodReference {
	
	public static void m2() {
		System.out.println("method reference");
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Using Lambda Expression");
		A a = () -> {
			System.out.println("lambda implementation");
		};
		a.m1();
		
		System.out.println("Using method reference");
		A aa = MethodReference::m2;
		aa.m1();
		
		/*
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		*/
		
		// above line replaced with method reference
		MethodReference objForRunMethod = new MethodReference();
		Runnable r = objForRunMethod::run;
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
		/*
		List<String> list = Arrays.asList("A","B","C");
		
		System.out.println("befor java 8");
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println("using lambda expression");
		//list.forEach( (String s)->System.out.println(s));
		//list.forEach( (s)->System.out.println(s));
		//list.forEach( s -> System.out.println(s));
		System.out.println("Further reduction in code by let compiler infer types");
		//list.forEach(System.out.println(s)); //this line not working 
		System.out.println("here lambda expression is not doing anything & just calling a method,it can be replaced by method reference");
		list.forEach(System.out::println);
		*/
		
	}
}
