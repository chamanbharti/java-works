package com.factorial;

public class A {
	private int aValue;
	private B bInstance = null;
	
	public A(){
		aValue = 0;
		bInstance = new B();
	}
	@Override
	public String toString() {
		return "";
	}

}
