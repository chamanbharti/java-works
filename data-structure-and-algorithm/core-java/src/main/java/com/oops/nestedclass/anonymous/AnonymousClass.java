package com.oops.nestedclass.anonymous;

/*
abstract class A{ //abstract class
	abstract void display();
}
*/

/*
class A{ //concrete class
	void display() {
		System.out.println("Hello");
	}
}
*/

interface A{
	void display();
}
public class AnonymousClass {

	public static void main(String[] args) {
		//using abstract class
		/*
		A a = new A(){
			void display() {
				System.out.println("Hello");
			}
		};
		
		a.display();
		*/
		
		//using concrete class
		/*
		A a = new A() {};
		a.display();
		//new A().display();
		*/
		
		//using interface
		A a = new A() {
			public void display() {
				System.out.println("Hello");
			}
		};
		a.display();
	}
}
