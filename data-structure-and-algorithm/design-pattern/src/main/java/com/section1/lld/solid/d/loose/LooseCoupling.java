package com.section1.lld.solid.d.loose;


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
class Scooty implements Vehicle {

	public void move() {
		System.out.println("Scooty is moving");
	}
}
class Traveller {
	
	private Vehicle vehicle;
	// using constructor
	public Traveller(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	/*
	 // using setter
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	*/
	public void startJourney() {
		vehicle.move();
	}
	
}
public class LooseCoupling {

	public static void main(String[] args) {
		
		// using constructor injection
		Traveller traveller = new Traveller(new Car());
		
		traveller.startJourney();//start journey by car
		
		traveller = new Traveller(new Bike()); // Inject Bike dependency
	    traveller.startJourney(); // Start journey by Bike
	    
	    traveller = new Traveller(new Scooty()); // Inject Scooty dependency
	    traveller.startJourney(); // Start journey by Scooty
	    
		// using setter injection
		/*
		Traveller traveller = new Traveller();
		
		traveller.setVehicle(new Car());//Inject Car Dependency
		traveller.startJourney();//start journey by car
		
		traveller.setVehicle(new Bike()); // Inject Bike dependency
	    traveller.startJourney(); // Start journey by Bike
	    
	    traveller.setVehicle(new Scooty()); // Inject Scooty dependency
	    traveller.startJourney(); // Start journey by Scooty
	    */
		
		
	}
}
