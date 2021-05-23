package com.collection.generic;

public class GenericDemo3 {

	public static void main(String[] args) {
		
		// for integer and String
		TwoTypeGenericParameters<Integer, String> twoGObj;
		twoGObj = new TwoTypeGenericParameters<Integer, String>(88, "Generics");
		
		twoGObj.showTypes();
		
		// Obtain and show values.
		int v = twoGObj.getObj1();
		System.out.println("value: " + v);
		String str = twoGObj.getObj2();
		System.out.println("value: " + str);
		
		// for String and integer
		TwoTypeGenericParameters<String, Integer> twoGObj2;
		twoGObj2 = new TwoTypeGenericParameters<>("Generics",88);
		
		twoGObj.showTypes();
		
		// Obtain and show values.
		v = twoGObj2.getObj2();
		System.out.println("value: " + v);
		str = twoGObj2.getObj1();
		System.out.println("value: " + str);
		
		TwoTypeGenericParameters<String, String> twoGObj3;
		twoGObj3 = new TwoTypeGenericParameters<String, String>("G", "Generics");
		
		twoGObj3.showTypes();
		
		String key = twoGObj3.getObj1();
		System.out.println("key: " + key);
		String value = twoGObj3.getObj2();
		System.out.println("value: " + value);
		
		
	}
}
