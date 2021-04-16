package com.section1.lld.solid.d.tight;

interface Vehicle {
    public void move();
}

class Car implements Vehicle{

	public void move() {
		 System.out.println("Car is moving");
		
	}
}

class Bike implements Vehicle {

	public void move() {
		 System.out.println("Bike is moving");
	}
}
class Traveller{
	/*
//	Car car = new Car();
//	public void startJourney() {
//		car.move();
//	}
 * 
	Bike b = new Bike();
	public void startJourney() {
		b.move();
	}
	*/
	
	
	//using constructor
	Car car;
	public Traveller() {
		car = new Car();
	}
	public void startJourney() {
		car.move();
	}
	
	
}
public class TightCoupling {

	public static void main(String[] args) {
		Traveller t = new Traveller();
		t.startJourney();
	}
}
