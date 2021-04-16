package com.oops.thread;

public class CallRunTest extends Thread{

	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
		//System.out.println("Run");
	}
	
	public static void main(String[] args) {
		CallRunTest t = new CallRunTest();
		//t.run();//fine, but does not start a separate call stack
		CallRunTest t2 = new CallRunTest();
		t.run();
		t2.run();
		
	}
}
