package com.interview;
class MyThread implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			throw new RuntimeException("Exception");
		}
	}
}
public class ThreadException {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			
		}
		MyThread obj= new MyThread();
		Thread t = new Thread(obj);
		t.start();
		
	}
}
