package com.collection.generic;

public class TwoTypeGenericParameters<T, V> {

	T obj1;
	V obj2;
	
	public TwoTypeGenericParameters(T t, V v) {
		obj1 = t;
		obj2 = v;
	}
	
	T getObj1() {
		return obj1;
	}
	
	V getObj2() {
		return obj2;
	}
	
	void showTypes() {
		System.out.println("Type of T is "+obj1.getClass().getName());
		System.out.println("Type of V is "+obj2.getClass().getName());
	}
}
