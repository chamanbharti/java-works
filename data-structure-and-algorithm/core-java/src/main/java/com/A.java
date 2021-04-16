package com;
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
		super(s);
		System.out.print("B");
	}
	
}
	public class SuperTest2{
		
		public static void main(String[] args)
		{
			new B("C");
			System.out.println(" ");
		}
	}