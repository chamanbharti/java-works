package com.java8.lambda;
/*
 	lambda is anonymous function
 	 
 	 1. not having name
 	 2. not having modifier
 	 3. not having any return type
 */

interface A{
	public void m1();
}
class AImpl implements A{

	@Override
	public void m1() {
		System.out.println("Without lambda m1() of A");
		System.out.println("hello World");
		System.out.println("***************");
	}
	
}
interface B{
	public void add(int a,int b);
}


class BImpl implements B{

	@Override
	public void add(int a, int b) {
		System.out.println("Without lambda add() of B");
		System.out.println("addition:"+(a+b));//30
		System.out.println("***************");
	}
	
}
interface C{
	public int getLength(String s);
}
class CImpl implements C{

	@Override
	public int getLength(String s) {
		System.out.println("Without lambda getLength() of C");
		return s.length();
	}
	
}
interface I{
	void hello(String str);
}
public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("*******Lambda Expression Demo*******");
		
//		 I refHello = (String str) -> System.out.println("Hello " + str);
//	        refHello.hello("World");
		
		// without lambda expression
		//AImpl obj0 = new AImpl();
//		A obj0 = new AImpl();
//		obj0.m1();
		
		// with lambda expression
		A a = ()-> {
			System.out.println("With lambda");
			System.out.println("hello World");
		};
		a.m1();
		
		// with zero parameter
//		A obj = ()-> 
//			System.out.println("With lambda");
//			System.out.println("hello World");
//		obj.m1();
		
		
		//without lambda
//		BImpl obj2 = new BImpl();
//		obj2.add(10, 20);
		
		//with lambda
//		B obj2 = (int a,int b) -> {
//			System.out.println("addition:"+a+b);//addition:1020
//			System.out.println("addition:"+(a+b));//30
//		};
//		obj2.add(10, 20);
		
//		//with type inference
//		B obj2 = (a,b) -> {
//			System.out.println("addition:"+a+b);//addition:1020
//			System.out.println("addition:"+(a+b));//30
//		};
//		obj2.add(10, 20);
		
//		//with type inference
//		B obj2 = (a,b) -> 
//			System.out.println("addition:"+(a+b));//30
//		
//		obj2.add(10, 20);
		
		//without lambda
		//getLength()
//		C obj1 = new CImpl();
//		System.out.println("Chaman's length:"+obj1.getLength("Chaman"));
		
		//with lambda
//		System.out.println("getLength() of C using anonymous class");
//		C obj1 = new C() {
//			public int getLength(String s) {
//				return s.length();
//			}
//		};
//		System.out.println("Chaman's length:"+obj1.getLength("Chaman"));
		
		
//		//with lambda
//		C obj1 = (String s) ->{
//			return s.length();
//		};
//		System.out.println("Chaman's length:"+obj1.getLength("Chaman"));
		
//		C obj1 = (String s) -> {return s.length();};
//		System.out.println("Chaman's length:"+obj1.getLength("Chaman"));
		
//		C obj1 = (s) -> return s.length();
//		System.out.println("Chaman's length:"+obj1.getLength("Chaman"));
		
//		C obj1 = (s) -> s.length();
//		System.out.println("Chaman's length:"+obj1.getLength("Chaman"));
		
//		C obj1 = s->s.length();
//		System.out.println("Chaman's length:"+obj1.getLength("Chaman"));


		
		
	}
	
}
