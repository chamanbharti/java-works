package com.oops.abstraction;
interface Printable{
	void show();//abstract method
	int i=90;
	default void msg() {
		System.out.println("default method");
	}
	static int cube(int x) {
		return x*x*x;
	}
}
interface Showable{
	void show();
	int i=9;
	
}
public class Test1 implements Printable,Showable{//multiple inheritance

	@Override
	public void show() {
		System.out.println("Show:"+Printable.i);
		
	}
	public static void main(String[] args) {
		Test1 p = new Test1();
		p.show();
		p.show();
		p.msg();
		System.out.println(Printable.cube(5));
	}

}
