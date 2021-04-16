package com.singleton;

public class SingleObjectDemo {
	
	public static void main(String[] args) {
		//Illegal construct
		//compile time error:The constructor SingleObject() is not visible
		//SingleObject obj = new SingleObject();
		
		//Get the only object available
		SingleObject obj = SingleObject.getInstance();
		SingleObject obj2 = SingleObject.getInstance();
		
		//show the message
		obj.showMessage();
		
		//check object
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
	}

}
