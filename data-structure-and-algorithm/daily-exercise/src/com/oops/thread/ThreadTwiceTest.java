package com.oops.thread;

public class ThreadTwiceTest extends Thread{

	public void run() {
		System.out.println("Running");
	}
	
	public static void main(String[] args) {
		ThreadTwiceTest t = new ThreadTwiceTest();
		t.start();
		t.start();
	}
}
