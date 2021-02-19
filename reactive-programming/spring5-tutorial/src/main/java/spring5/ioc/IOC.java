package spring5.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

interface Engine{
	void start();
}

class Car implements Engine{

	@Override
	public void start() {
		System.out.println("Car has been started");
		
	}
	
}

class Bike implements Engine{
	@Override
	public void start() {
		System.out.println("Bike has been started");
		
	}
}

class Airoplane implements Engine{
	@Override
	public void start() {
		System.out.println("Airoplane has been started");
		
	}
}
/*
class Keys{
	public void run(Bike key) {
		//new Car().start();// run has control of start
		key.start();
	}
	
	//for achieve loosely coupling, we have to override method
	public void run(Car key) {
		key.start();
	}
}
//we have achieved loosely coupling but code has increased but not  complete loosely couple
*/

class Keys{
	public void run(Engine key) {
		key.start();
	}
	//for achieve loosely coupling using interface
}

public class IOC {

	public static void main(String[] args) {
		/*
		//new Keys().run(new Bike());//Car has been started
		
		//above line is tightly coupling
		new Keys().run(new Bike());//Bike has been started
		
		
		//loosely couple
		new Keys().run(new Car());
		//above line of code is still in tightly coupled
		*/
		
		/*
		Engine key = new Car();
		new Keys().run(key);
		
		key = new Bike();
		new Keys().run(key);
		
		// still tightly coupled
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
		Car car = (Car)context.getBean("car");
		new Keys().run(car);
		
		Engine key = (Engine)context.getBean("car");
		new Keys().run(key);
		
		key = (Engine)context.getBean("bike");
		new Keys().run(key);
		
		key = (Engine)context.getBean("airoplane");
		new Keys().run(key);
		
		//now code has been loosely coupled
		
	}
}
