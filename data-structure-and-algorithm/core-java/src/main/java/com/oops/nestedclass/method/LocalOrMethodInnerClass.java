package com.oops.nestedclass.method;

class OuterClass{
	
	private int data=10;//instance variable 
	
	void display() {
		
		class Local {
			int value = 34;//local variable must be final till jdk 1.7 only
			void m() {
				System.out.println("data:"+data+" and value:"+value);
			}
		}
		
		Local l = new Local();
		l.m();
	}
	
}
public class LocalOrMethodInnerClass {

	public static void main(String[] args) {
		OuterClass a = new OuterClass();
		a.display();
	}
}
