package thread.durga.part2;


public class Thread6 {

	public static void main(String[] args) {
		MyThread t = new MyThread();//Thread instantiation
		t.start();
		
		//executed by main thread
		System.out.println("Main Thread");
		t.start();
	}
}
/*
 * when we call t.start()
 1. Register this thread with thread sheduler.
 2. Perform all other mandatory activities.
 3. Invoke the run()
 */ 
