package spring5.di.setter_constructor;

class Engine{
	void start() {
		System.out.println("Engine has been started");
	}
}
public class Car {
	
	String color;
	Engine engine;
	public Car() {
		System.out.println("Car() constructor created");
	}
	public Car(Engine engine) {
		this.engine = engine;
		System.out.println("Car(Engine engine) constructor created");
	}
	
	
	public void startEngine() {
		if(engine == null)
			System.out.println("unable to start your engine");
		else
			engine.start();
		
		
	}
	
	public void showColor() {
		System.out.println("Your bike color is "+color);
	}
}
