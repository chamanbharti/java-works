package com.oops.abstraction;
interface Chaman{
	void bharti();
}
abstract class Bike implements Chaman{
	public void bharti() {
		System.out.println("hello bharti");
	}
	 int i=90; //data member
	protected abstract void run();//no method body and abstract
	void print() {
		System.out.println("method body");
	}
	final void show() {
		System.out.println("final method");
	}
	static void show1() {
		System.out.println("final method");
	}
	Bike(){
		System.out.println("Constructor");
	}
}
public class Test extends Bike{

	public void run() {
		System.out.println("Running Safely:"+i);
	}
	
	Test(){
		System.out.println("Test:"+i);
	}
	public static void main(String[] args) {//main method
		Bike b = new Test();
		b.run();
		b.print();
		b.show1();
		b.bharti();
	}

	
}
