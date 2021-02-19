package thread.durga.part3;

class MyThread_1 extends Thread{
	
	public void run() {
		System.out.println("This line executed by thread:"+Thread.currentThread().getName());
	}
}
public class MyThread3 {

	public static void main(String[] args) {
		
		
		MyThread_1 t = new MyThread_1();
		t.start();
		System.out.println("This line executed by thread:"+Thread.currentThread().getName());
		
	}
}
