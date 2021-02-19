package com.interview.overriding;
//class A
//{
//	void m1()
//	{
//		System.out.println("In m1 A");
//	}
//}
//class B extends A
//{
//	void m1()
//	{
//		System.out.println("In m1 B");
//	}
//	void m2()
//	{
//		System.out.println("In m2 B");
//	}
//}

class A
{
	void m1() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("In m1 A");
	}
}
class B extends A
{
	void m1() throws IndexOutOfBoundsException
	{
		System.out.println("In m1 B");
	}
	void m2()
	{
		System.out.println("In m2 B");
	}
}
public class Overriding1 {

	public static void main(String[] args) {
//		A a = new A();
//		a.m1();
		
//		B b = new B();
//		b.m1();
//		b.m2();
		
//		A aa=new B();
//		aa.m1();
//		aa.m2();
//		
//		//B bb = new A(); // ilegal
//		B bb = (B) new A();// like B b = new B();
//		bb.m1();
//		bb.m2();
		
		A a = new B();
		a.m1();
		
	}

}
