package thread.durga.part3;

public class MyRunnable implements Runnable{
	//executed by child thread.
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		}
}
/* Thread Constructor list
 * 
1. public Thread() {
    init(null, null, "Thread-" + nextThreadNum(), 0);
}

2. public Thread(Runnable target) {
    init(null, target, "Thread-" + nextThreadNum(), 0);
}

3. public Thread(String name) {
    init(null, null, name, 0);
}

4. public Thread(Runnable target, String name) {
    init(null, target, name, 0);
}

5. public Thread(ThreadGroup group, String name) {
    init(group, null, name, 0);
}

6. public Thread(ThreadGroup group, Runnable target) {
    init(group, target, "Thread-" + nextThreadNum(), 0);
}


7. public Thread(ThreadGroup group, Runnable target, String name) {
    init(group, target, name, 0);
}


8. public Thread(ThreadGroup group, Runnable target, String name,long stackSize) {
init(group, target, name, stackSize);
}

9. Thread(Runnable target, AccessControlContext acc) {
    init(null, target, "Thread-" + nextThreadNum(), 0, acc, false);
}
*/
