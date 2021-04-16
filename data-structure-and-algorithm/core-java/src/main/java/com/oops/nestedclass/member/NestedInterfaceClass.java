package com.oops.nestedclass.member;

class OuterClass{
	
	interface Inner{
		void msg();
	}
}
class Demo implements OuterClass.Inner{

	@Override
	public void msg() {
		System.out.println("Hello nested interface");
	}
	
}
public class NestedInterfaceClass {

	public static void main(String[] args) {
		OuterClass.Inner obj = new Demo();//upcasting here  
		obj.msg();
	}
}
