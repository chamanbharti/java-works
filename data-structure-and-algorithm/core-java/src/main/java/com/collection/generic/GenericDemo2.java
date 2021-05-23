package com.collection.generic;

public class GenericDemo2 {

	public static void main(String[] args) {
		
		// for integer
		NonGeneric iObj;
		iObj = new NonGeneric(88);
		iObj.showType();
		// This time, a cast is necessary.
		//int v = (Integer) iObj.getObj();
		int v = (int)iObj.getObj();
		System.out.println("value: " + v);
		
		// for string
		NonGeneric strObj = new NonGeneric("Generics Test");
		strObj.showType();
		String str = (String) strObj.getObj();// cast is needed
		System.out.println("value:"+str);
		
		// This compiles, but is conceptually wrong!
		iObj = strObj;
		v = (Integer) iObj.getObj();// run-time error!
		System.out.println(v);
	}
}
