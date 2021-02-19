package com.controller;

class Parent{
	 public void hello()    //concrete method 
	    {
	        System.out.println("Hello...Good morning");
	    }
}
class Child extends Parent{
	 public void hello()    //redefining of base class concrete method in derived class
	    {
		 System.out.println("Hello...everyone");
	    }
}
/*
class Parent{
	 public static void hello()    //static method 
	    {
	        System.out.println("Hello...Good morning");
	    }
}
class Child extends Parent{
	 public static void hello()    //redefining of base class static method in derived class
	    {
		 System.out.println("Hello...everyone");
	    }
}
*/
public class MethodHiding {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.hello();
		p = new Child();    
        //base class reference is referring to derived class object and as per overriding rules it should call Child hello()
		p.hello();//but it calls Parent class hello()
		
		//creation of derived class object
		Child c = new Child();
		c.hello();
	}
}
