package com.java5.annotation;

class Animal{  
	void eatSomething(){
			System.out.println("eating something");
		}  
}

class Dog extends Animal{  
	@Override  
	void eatSomething(){//should be eatSomething 
		System.out.println("eating foods");
		} 
} 

public class OverrideAnnotation {

	public static void main(String[] args) {
		Animal a=new Dog();  
		a.eatSomething(); 
	}
}
