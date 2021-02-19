package spring5.ioc;

public class Airtel implements Sim{

	public Airtel() {
		System.out.println("Airtel Constructor called");
		
	}
	@Override
	public void calling() {
		System.out.println("Calling using airtel mobile");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet using airtel sim");
		
	}

}
