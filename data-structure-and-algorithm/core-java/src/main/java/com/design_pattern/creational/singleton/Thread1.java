package design_pattern.creational.singleton;

public class Thread1 extends Thread{
	@Override
	public void run() {
		
		Sun sun=Sun.getInstance();
		System.out.println("Thread1 called lazy singleton:"+sun.hashCode());
	}

}
