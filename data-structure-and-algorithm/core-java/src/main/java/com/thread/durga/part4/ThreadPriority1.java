package thread.durga.part4;

/*
 Every thread has some priority
 Thread.MIN_PRIORITY 1
 Thread.NORM_PRIORITY 5
 Thread.MAX_PRIORITY 10
 
     * The minimum priority that a thread can have.
    public final static int MIN_PRIORITY = 1;

      The default priority that is assigned to a thread.
    public final static int NORM_PRIORITY = 5;

      The maximum priority that a thread can have.
    public final static int MAX_PRIORITY = 10;
 
 **/

class MyPriority extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread 1");
		}
	}
}
public class ThreadPriority1 {

	public static void main(String[] args) {
		
		System.out.println("default Priority of main thread:"+Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(17);//RE:java.lang.IllegalArgumentException
		//Thread.currentThread().setPriority(10);
		MyPriority t = new MyPriority();
		t.setPriority(10);
		System.out.println("Priority of MyPriority thread:"+t.getPriority());//7
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread 1");
		}
		
	}
}
