package thread.durga.part2;

public class MyThread extends Thread{
	//executed by child thread.
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}
