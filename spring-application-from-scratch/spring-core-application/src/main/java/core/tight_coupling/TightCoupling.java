package core.tight_coupling;


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
class Traveller{
//	Car car = new Car();
//	public void startJourney() {
//		car.move();
//	}
	Bike b = new Bike();
	public void startJourney() {
		b.move();
	}
}
public class TightCoupling {

	public static void main(String[] args) {
		Traveller t = new Traveller();
		t.startJourney();
	}
}
