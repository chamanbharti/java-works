package com.interview;

public class InstanceOfVsIsInstance {

	public static void main(String[] args) throws ClassNotFoundException {
		Thread t = new Thread();
		System.out.println(t instanceof Runnable);//if i know about type in beginning
		//System.out.println(Class.forName(args[0]).isInstance(t));//if i don't know about type in beginning
	}
}
