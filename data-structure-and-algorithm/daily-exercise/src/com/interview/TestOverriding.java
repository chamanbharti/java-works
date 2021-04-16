package com.interview;

//method overriding
class A{
	//static block
	static{
		System.out.println("A static block");
	}
	
	//instance block
	{
		System.out.println("A instance block");
	}
	//constructor
	//A(String s){
	A(){
		System.out.println("A constructor");
	}
	//method
	void message(){
		System.out.println("A message");
	}
	
}
class B extends A{
	//static block
	static{
			System.out.println("B static block");
	}
	//instance block
	{
			System.out.println("B instance block");
	}
	//constructor
	B(){
		System.out.println("B constructor");
	}
	//method
	void message(){
		System.out.println("B message");
	}
}
public class TestOverriding {
	public static void main(String[] args) {
		//1
		//A a = new A("Hello");
		A a = new A();
		a.message();
		/*
		A static block
		A instance block
		A constructor
		A message
		*/
		//without inheritance
		//A a = new B();//type mismatch:cannot convert from B to A
		//a.message();
		/*
		A static block
		B static block
		A instance block
		A constructor
		B instance block
		B constructor
		B message
		*/
		
		//2
		//A a = new B();
		//a.message();
		/*Hello A
		Hello B
		Hello I am B*/
		
		//3
		//B b = new B();
		//b.message();
		/*
		A static block
		B static block
		A instance block
		A constructor
		B instance block
		B constructor
		B message
		*/
		//4
		//with and without inheritance 
		//B c = new A();//type mismatch:cannot convert from A to B
		
		
	}
	
}
