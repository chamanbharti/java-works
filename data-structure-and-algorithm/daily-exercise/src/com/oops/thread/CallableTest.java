package com.oops.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest implements Callable<String>{

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		//return the thread name executing this callable task
		return Thread.currentThread().getName();
	}
	public static void main(String[] args) {
		//get executorService from executors utility class, thread pool size is 10
		ExecutorService executor = Executors.newFixedThreadPool(10);
		//create a list to hold the Future object associated
		//with callable
		List<Future<String>>list = new ArrayList<>();
		//create MyCallable instance
		Callable<String>callable = new CallableTest();
		for(int i=0;i<100;i++) {
			//submit callable tasks to be executed by thread pool
			Future<String>future=executor.submit(callable);
			  //add Future to the list, we can get return value using Future
			list.add(future);
		}
		for(Future<String> fut : list){
            try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System.out.println(new Date()+ "::"+fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        executor.shutdown();
	}

	
}
