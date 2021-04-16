package com.oops.abstraction;
interface Sayable{
	default void say() {
		saySomething();
	}
	private void saySomething() {
		System.out.println("Hello..I am private method");
	}
	 // Private static method inside interface  
    static void sayPolitely() {  
        System.out.println("I'm private static method");  
    }  
}
public class Test5 implements Sayable{

	public static void main(String[] args) {
		Sayable s = new Test5();
		s.say();
	}

}
