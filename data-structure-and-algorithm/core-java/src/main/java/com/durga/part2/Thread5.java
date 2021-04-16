package thread.durga.part2;

class MyThread3 extends Thread{
	//overloaded start method
	public void start() {
		    super.start();
			System.out.println("no arg start()");
	}
	public void run() {
		System.out.println("no arg run()");
}
}

public class Thread5 {

	public static void main(String[] args) {
		MyThread3 t = new MyThread3();//Thread instantiation
		t.start();//starting a normal method
		
		//executed by main thread
			System.out.println("Main Thread");
	}
}
/*
 * when we call t.start()
 1. Register this thread with thread sheduler.
 2. Perform all other mandatory activities.
 3. Invoke the run()
 */ 
