package com.collection.generic;

public class NonGeneric {
	
	Object obj;
	
	public NonGeneric(Object o) {
		obj = o;
	}
	
	Object getObj() {
		return obj;
	}
	
	void showType() {
		System.out.println("Type of obj is "+obj.getClass().getName());
	}
}