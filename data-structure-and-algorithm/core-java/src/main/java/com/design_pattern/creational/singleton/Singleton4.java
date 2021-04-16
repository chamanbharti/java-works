package design_pattern.creational.singleton;

class Earth {
	
	private static Earth instance;
	
	private Earth() {}
	
	public static synchronized Earth getInstance() {
		if(instance == null) {
			instance = new Earth();
		}
		return instance;
	}
	
}
public class Singleton4 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<100;i++) {
			Earth obj1 = Earth.getInstance();
			System.out.println(obj1.hashCode());
		}
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<100;i++) {
					Earth obj2 = Earth.getInstance();
					System.out.println(obj2.hashCode());
				}
			}
		}; 
		Thread t = new Thread(r);
		t.start();
		System.out.println("Time taken : " +(System.currentTimeMillis() - startTime)+"ms");
		
	}
}
