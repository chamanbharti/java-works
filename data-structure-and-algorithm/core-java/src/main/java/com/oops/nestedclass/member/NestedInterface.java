package com.oops.nestedclass.member;

interface Outer{
	void show();
	interface Inner{
		void msg();
	}
}
class Test implements Outer.Inner{

	@Override
	public void msg() {
		System.out.println("Hello nested interface");
	}
	
}
public class NestedInterface {

	public static void main(String[] args) {
		Outer.Inner obj = new Test();//upcasting here  
		obj.msg();
	}
}
