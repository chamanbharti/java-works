package com.oops.nestedclass.staticinner;
/*
class A{
	static int i=11;
	static class B{
		void msg() {
			System.out.println("data is "+i);
		}
	}
}*/

/*
class A{
	static int i=11;
	static class B{
		static void msg() {
			System.out.println("data is "+i);
		}
	}
}
public class NestedStaticClass {

	public static void main(String[] args) {
		
//		A.B b = new A.B();
//		b.msg();
		
		A.B.msg();//no need to create the instance of static nested class  
	}
}
*/

class Example {

	static int a = 10;
	int x = 20;

	static class A {
		static int b = 30;
		int y = 40;

		static void m1() {
			System.out.println(a);
			System.out.println(b);
			// System.out.println(x);
			// System.out.println(y);
			Example e1 = new Example();
			A a1 = new A();
			System.out.println(e1.x);
			System.out.println(a1.y);
		}

		void m2() {
			System.out.println(a);
			System.out.println(b);
			// System.out.println(x);
			Example e1 = new Example();
			System.out.println(e1.x);
			System.out.println(y);
		}
	}

	class B {
		void m1() {
			System.out.println(a);
			System.out.println(x);
		}
	}
}

class NestedStaticClass {
	public static void main(String[] args) {
		Example.A.m1();
		System.out.println();
		Example.A a1 = new Example.A();
		a1.m2();
		System.out.println();
		Example.B b1 = new Example().new B();
		b1.m1();
	}
}