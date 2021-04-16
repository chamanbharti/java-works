package com.oops.thread;
class Customer{
	int amount=1000;
	
	synchronized void withdraw(int amount) {
		System.out.println("goin to withdraw..");
		
		if(this.amount<amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		this.amount=amount;
		System.out.println("withdraw completed...");
	}
	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount+=amount;
		System.out.println("deposit completed...");
		notify();
	}
}
public class InterCommunication {

	public static void main(String[] args) {
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}
}
