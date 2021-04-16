package com.oops.abstraction;
interface Orange{
	
	void run();
	
	class Grape{
		public void show() {
			System.out.println("Grape");
		}
	}
}
public class Test4 implements Orange.Grape{

}
