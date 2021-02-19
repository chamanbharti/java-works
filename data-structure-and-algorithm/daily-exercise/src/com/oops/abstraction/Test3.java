package com.oops.abstraction;
class Apple{
	
	interface Message{
		void m();
	}
}
public class Test3 implements Apple.Message {

	public void m() {
		System.out.println("Hello nested interface");
	}
	public static void main(String[] args) {
		Apple.Message obj = new Test3();
		obj.m();
	}
}
