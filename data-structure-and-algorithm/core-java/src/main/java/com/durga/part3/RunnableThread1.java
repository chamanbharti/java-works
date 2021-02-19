package thread.durga.part3;

public class RunnableThread1 {

	public static void main(String[] args) {
		
		//case I
//		MyRunnable obj = new MyRunnable();
//		Thread t = new Thread(obj);//target runnable
//		t.start();
//		//executed by main thread.
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Main Thread");
//		}
		
		// Case II
		MyRunnable obj = new MyRunnable();
		//obj.start();//CE:because MyRunnable has no start()
		Thread t = new Thread();
		t.run();
		Thread t2 = new Thread(obj);//target runnable
		t2.start();
		//executed by main thread.
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
