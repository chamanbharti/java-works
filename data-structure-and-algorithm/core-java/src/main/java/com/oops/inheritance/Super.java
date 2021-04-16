package com.oops.inheritance;

class A
{
	public A(String s)
	{
		System.out.print("A");
	}
}
class B extends A {
	public B(String s)
	{
		super(s); //it will show CT
		System.out.print("B");
	}
	
}
public class Super {

	public static void main(String[] args)
	{
		new B("C");
		System.out.println(" ");
	}
}
