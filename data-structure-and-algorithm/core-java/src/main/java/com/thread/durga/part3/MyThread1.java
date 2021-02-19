package thread.durga.part3;

public class MyThread1 {

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		Thread t2 = new Thread(t);
		t2.start();
		System.out.println("Main Thread");
	}
}
