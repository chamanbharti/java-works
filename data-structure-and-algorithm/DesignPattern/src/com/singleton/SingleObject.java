package com.singleton;

public class SingleObject {

	/*//create an object of SingleObject
	private static final SingleObject intance = new SingleObject();//eager loading
	
	//make the constructor private so that this class can not be instantiated
	private SingleObject(){}
	
	//get the only object available
	public static SingleObject getInstance(){
		return intance;
	}
	*/
	private static SingleObject instance;//lazy loading
	
	private SingleObject(){};
	
	public static SingleObject getInstance(){
		
		if(instance == null){
			instance = new SingleObject();
		}
		
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Hello World!");
	}
}
