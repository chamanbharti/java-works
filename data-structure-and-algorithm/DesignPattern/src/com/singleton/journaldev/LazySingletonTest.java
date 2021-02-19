package com.singleton.journaldev;

public class LazySingletonTest {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Entering Main method");
			//Thread one
			Thread1 t1=new Thread1();
			Thread tt1=new Thread(t1);
			
			tt1.start();
			//Thread.sleep(5000)
		
			//Thread two
			Thread2 t2=new Thread2();
			Thread tt2=new Thread(t2);
			tt2.start();
		System.out.println("Exiting Main method");
		}
		
		
}
