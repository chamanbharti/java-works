package thread;

class MyThread extends Thread{
	public void run() {
		System.out.println("Thread1 is running....");
	}
}

class MyThread2 implements Runnable{
	public void run() {
		System.out.println("Thread2 is running....");
	}
}

class MySleepthread extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}
class MyJointhread extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
//		MyThread t = new MyThread();
//		t.start();
//		
//		MyThread2 tt = new MyThread2();
//		Thread t2 = new Thread(tt);
//		t2.start();
		
//		MySleepthread mySleepthread = new MySleepthread();
//		MySleepthread mySleepthread2 = new MySleepthread();
		//mySleepthread.start();
		//mySleepthread2.start();
		//mySleepthread2.start();//RE
		
		//mySleepthread2.run();//fine, but does not start a separate call stack 
//		mySleepthread.run(); 
//		mySleepthread2.run();
		//As you can see in the above program that there is no context-switching because here t1 and t2 will be treated as normal object not thread object.
		//
		MyJointhread myJointhread = new MyJointhread();
		MyJointhread myJointhread2 = new MyJointhread();
		MyJointhread myJointhread3 = new MyJointhread();
		myJointhread.start();
		try {
			 myJointhread.join(1500);
		} catch (Exception e) {
			System.out.println(e);
		}
		myJointhread2.start();
		myJointhread3.start();
	}
}
