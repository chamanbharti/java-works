package com.static_method;

interface A{
	public static void m1() {
		System.out.println("Static method");
	}
}

public class StaticMethodTest implements A{
	public static void m2() {
		System.out.println("Static method");
	}
	public static void main(String[] args) {
		StaticMethodTest obj = new StaticMethodTest();
	//	obj.m1();//CE
	//	StaticMethodTest.m1();//CE
		A.m1();
		
		//obj.m2();
		//m2();
		//StaticMethodTest.m2();
		
	}
}
