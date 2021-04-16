package thread.durga.part2;

class MyThread2 extends Thread{
	//overloaded run method
	public void run() {
			System.out.println("no arg run()");
	}
	public void run(int i) {
		System.out.println("int arg run(int i)");
}
}

public class Thread4 {

	public static void main(String[] args) {
		MyThread2 t = new MyThread2();//Thread instantiation
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
