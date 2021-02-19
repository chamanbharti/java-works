package design_pattern.creational.singleton;

public class Thread2 implements Runnable{
	@Override
	public void run() {
		
		Sun sun=Sun.getInstance();
		System.out.println("Thread2 called lazy singleton:"+sun.hashCode());
	}

}
