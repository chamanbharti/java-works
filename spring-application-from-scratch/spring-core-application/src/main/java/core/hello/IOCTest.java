package core.hello;
/**
we have a Car class and a Vehicle class object.
The biggest issue with the code is tight coupling between classes. In other words,
the Car class depends on the vehicle object. So, for any reason, changes in the
Vehicle class will lead to the changes in, and compilation of, the Car class too.
*/
/*
class Car{
	
	
	private Vehicle vehicle;//problem 1: references
	
	public Car(){
		vehicle = new Vehicle();//problem 1: aware of concrete classes
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
class Vehicle{
	
}
*/


class Car{
	
	private Vehicle vehicle;
	
	public Car(Vehicle vehicle){
		this.vehicle = vehicle;//step 2 : passes the vehicle object to the Car class by IOC Container
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
class Vehicle{
	//step 1 : creates the vehicle object 
}


public class IOCTest {

	public static void main(String[] args) {
//		Car car = new Car();
//		System.out.println(car.getVehicle());
		
	}
}
