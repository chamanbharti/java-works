package com.oops.nestedclass.member;

/*
class A{
	
	private int data=10;
	
	class B{
		void m() {
			System.out.println("data:"+data);
		}
	}
}
public class NormalOrRegularInnerClass {
	public static void main(String[] args) {
		
//		A a = new A();
//		B b = a.new B();
//		b.m();
		
//		A.B b = new A().new B();
//		b.m();
		
		new A().new B().m();
		
	}
}
*/

/*

class A{
	
	private int data=10;
	class B{
		void m1() {
			System.out.println("data:"+data);
		}
	}
	
	void m2() {
		B b = new B();
		b.m1();
	}
}
public class NormalOrRegularInnerClass {
	public static void main(String[] args) {
		
		A a = new A();
		a.m2();
		
		
	}
}
*/

/*
class A{
	
	private int data=10;
	private static int y=10;
	class B{
		void m1() {
			System.out.println("data:"+data);
			System.out.println("y:"+y);
		}
	}
	
}
public class NormalOrRegularInnerClass {
	public static void main(String[] args) {
		
		new A().new B().m1();
		
		
	}
}
*/

/*
class A{
	
	private int data=10;
	class B{
		int data = 11;
		void m1() {
			int data = 12;
			System.out.println("data:"+data);//12
			System.out.println("data:"+this.data);//11
			System.out.println("data:"+B.this.data);//11
			System.out.println("data:"+A.this.data);//10
		}
	}
	
}
public class NormalOrRegularInnerClass {
	public static void main(String[] args) {
		
		new A().new B().m1();
		
		
	}
	
	//outer class modifier:public, default,final,abstract,strictfp
	//inner class modifier:private,protected,static,public, default,final,abstract,strictfp
	//method local of inner class:final,abstract,strictfp
}
*/

/*
class A{
	
	 class B{
		  
		 class C{
			 
			 public void m1() {
				 System.out.println("Inner class method");
			 }
		 }
	 }
}
public class NormalOrRegularInnerClass {
	public static void main(String[] args) {
		
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.m1();
		
		
	}
}
*/

//method repeatable way
class A {
	public void m1() {
		class Inner {
			public void sum(int x,int y) {
				System.out.println("The sum:"+(x+y));
			}
		}
		
		Inner i = new Inner();
		i.sum(10,20);
		i.sum(100, 200);
		i.sum(1000, 2000);
	}
}
public class NormalOrRegularInnerClass {
	public static void main(String[] args) {
		
		A a = new A();
		a.m1();
		
		
	}
}