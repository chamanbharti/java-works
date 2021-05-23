package com.collection.generic;

public class Generic<T> {
	
	T obj;
	
	Generic(T o){
		obj = o;
	}
	
	T getObj() {
		return obj;
	}
	
	void showType() {
		System.out.println("Type of T is "+obj.getClass().getName());
	}
	
}