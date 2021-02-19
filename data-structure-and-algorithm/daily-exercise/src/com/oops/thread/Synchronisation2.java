package com.oops.thread;
class Table2{
	//synchronized void printTable(int n) {//synchronized method
	void printTable(int n) {
		synchronized (this) {
			for(int i=1;i<=5;i++) {
				try {
					Thread.sleep(400);
				}catch(Exception e) {
					System.out.println(e);
				}
				System.out.println(n*i);
			}
		}
	}
}

public class Synchronisation2 {

	public static void main(String[] args) {
		Table2 t = new Table2();
		Thread t1=new Thread() {//using anonymous class
			public void run() {
				t.printTable(5);
			}
		};
		Thread t2=new Thread() {
			public void run() {
				t.printTable(100);
			}
		};
		
		t1.start();
		t2.start();
	}
}
