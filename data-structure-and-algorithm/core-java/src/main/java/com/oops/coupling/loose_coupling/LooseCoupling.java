package com.oops.coupling.loose_coupling;


interface Vehicle {
    public void move();
}
class Car implements Vehicle{
	@Override 
    public void move() {
         System.out.println("Car is moving");
    }
}
class Bike implements Vehicle {
    @Override
    public void move() {
         System.out.println("Bike is moving");
    }
}
class Scooty implements Vehicle {
    @Override
    public void move() {
         System.out.println("Scooty is moving");
    }
}
class Traveller {
	private Vehicle vehicle;

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void startJourney() {
		vehicle.move();
	}
	
}
public class LooseCoupling {

	public static void main(String[] args) {
		
		Traveller traveller = new Traveller();
		
		traveller.setVehicle(new Car());//Inject Car Dependency
		traveller.startJourney();//start journey by car
		
		traveller.setVehicle(new Bike()); // Inject Bike dependency
	    traveller.startJourney(); // Start journey by Bike
	    
	    traveller.setVehicle(new Scooty()); // Inject Scooty dependency
	    traveller.startJourney(); // Start journey by Scooty
	}
}
