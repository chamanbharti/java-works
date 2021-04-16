package spring5.ioc;

public class Vodafone implements Sim{

	public Vodafone() {
		System.out.println("Vodafone Constructor called");
		
	}
	@Override
	public void calling() {
		System.out.println("Calling using vodafone mobile");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet using vodafone sim");
		
	}

}
