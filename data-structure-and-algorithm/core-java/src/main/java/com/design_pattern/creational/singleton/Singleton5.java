package design_pattern.creational.singleton;

class Water {
	
	private static Water instance;
	
	private Water() {}
	
	public static Water getInstance() {
		
		if(instance == null) {
			synchronized (Water.class) {
				if(instance == null) {
					instance = new Water();
				}
			}
		}
		return instance;
	}
	
}
public class Singleton5 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		for(int i=0;i<100;i++) {
			Water obj1 = Water.getInstance();
			System.out.println(obj1.hashCode());
		}
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<100;i++) {
					Water obj2 = Water.getInstance();
					System.out.println(obj2.hashCode());
				}
			}
		}; 
		Thread t = new Thread(r);
		t.start();
		System.out.println("Time taken : " +(System.currentTimeMillis() - startTime)+"ms");
	}
}
