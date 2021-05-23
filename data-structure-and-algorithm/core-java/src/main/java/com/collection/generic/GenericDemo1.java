package com.collection.generic;

public class GenericDemo1 {

	public static void main(String[] args) {
		
		// for integer
		Generic<Integer> iObj;
		iObj = new Generic<>(88);
		iObj.showType();
		
		int v = iObj.getObj();// no cast is needed
		System.out.println("value:"+v);
		
		// for string
		Generic<String>strObj = new Generic("Generics Test");
		strObj.showType();
		String str = strObj.getObj();// no cast is needed
		System.out.println("value:"+str);
		
		// Generics Work Only with Reference Types
		// Generic<int> intOb = new Generic<int>(53); // Error, can't use primitive type
		
		// Generic Types Differ Based on Their Type Arguments
		// iObj = strObj;
		
	}
}
