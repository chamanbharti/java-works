package com.collection.api.generic;

class MyGeneric<Chaman>{
	
	Chaman obj;
	
	void add(Chaman obj) {
		this.obj = obj;
	}
	
	Chaman get() {
		return obj;
	}
}
public class GenericClass {

	public static void main(String[] args) {
		MyGeneric<Integer> m = new MyGeneric<>();
		m.add(2);
		//m.add("Chaman");//CE
		System.out.println(m.get());
	}
}
