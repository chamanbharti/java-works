package com.oops.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		//create a pool of 5 threads
		for(int i=1;i<=10;i++) {
			Runnable worker = new WorkerThread(""+i);
			executor.execute(worker);//calling execute method of ExecutorService
		}
		executor.shutdown();
		while(!executor.isTerminated()) {
			
		}
		System.out.println("Finished all threads");
	}
}
