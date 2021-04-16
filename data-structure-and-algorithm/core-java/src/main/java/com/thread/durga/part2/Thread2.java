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
public class Thread2 {

	public static void main(String[] args) {
		MyThread t = new MyThread();//Thread instantiation
		t.run();//starting a normal method
		
		//executed by main thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
