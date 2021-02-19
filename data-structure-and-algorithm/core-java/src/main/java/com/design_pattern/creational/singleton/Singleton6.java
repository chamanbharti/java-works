package design_pattern.creational.singleton;


class BillPushSingleton {
	
	private BillPushSingleton(){}
	
	private static class SingletonHelper{
		private static final BillPushSingleton obj=new BillPushSingleton();
	}
	
	public static BillPushSingleton getInstance(){
		return SingletonHelper.obj;
	}

}
public class Singleton6 {

	public static void main(String[] args) {
		
		for(int i=0;i<100;i++) {
			BillPushSingleton obj1 = BillPushSingleton.getInstance();
			System.out.println(obj1.hashCode());
		}
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<100;i++) {
					BillPushSingleton obj2 = BillPushSingleton.getInstance();
					System.out.println(obj2.hashCode());
				}
			}
		}; 
		Thread t = new Thread(r);
		t.start();
	}
}
