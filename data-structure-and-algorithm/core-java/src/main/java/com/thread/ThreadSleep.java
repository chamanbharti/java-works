package com.thread;

public class ThreadSleep {

	public static void main(String[] args) {
		
		long start 	= System.currentTimeMillis();
		try {
				Thread.sleep(2000);
				System.out.println("Sleep time in ms = "+(System.currentTimeMillis() - start));
		    } 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		/**
		 If you will run the above program, you will notice that the thread sleep time it prints is slightly greater than 2000. 
		 This is caused by how thread sleep works and operating system specific implementation of thread scheduler.
		 https://www.journaldev.com/1020/thread-sleep-java
		 */
	}
}
