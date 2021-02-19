package com.oops.thread;
class Table{
	//void printTable(int n) { //synchronized method
	void printTable(int n) {
		synchronized (this) {//synchronized block
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

class Thread1 extends Thread{
	Table t;
	Thread1(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
}
class Thread2 extends Thread{
	Table t;
	Thread2(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(100);
	}
}
public class Synchronisation1 {

	public static void main(String[] args) {
		Table t = new Table();
		Thread1 t1=new Thread1(t);
		Thread2 t2=new Thread2(t);
		
		t1.start();
		t2.start();
	}
}
