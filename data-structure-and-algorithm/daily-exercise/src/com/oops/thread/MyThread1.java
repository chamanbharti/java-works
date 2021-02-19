package com.oops.thread;

public class MyThread1{

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				System.out.println("task one.");
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				System.out.println("Task two.");
			}
		};
		
		t1.start();
		t2.start();
	}
}
