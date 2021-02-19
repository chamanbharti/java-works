package thread.durga.part2;
/*
class MyThread extends Thread{
	//executed by child thread.
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}
*/
public class Thread3 {

	public static void main(String[] args) {
		MyThread t = new MyThread();//Thread instantiation
		t.start();//starting a normal method
		
		//executed by main thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
/*
 * when we call t.start()
 1. Register this thread with thread sheduler.
 2. Perform all other mandatory activities.
 3. Invoke the run()
 */ 
