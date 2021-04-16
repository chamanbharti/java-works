package com.oops.abstraction;
interface A{
	void show();
	
	interface B{//nested interface
		void msg();
	}
}
public class Test2 implements A.B{

	public void msg() {
		System.out.println("Hello nested interface");
	}
	public static void main(String[] args) {
		A.B message = new Test2();//upcasting here
		message.msg();
	}
}
