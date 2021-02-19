package com.singleton.journaldev;

public class Thread1 extends Thread{
	@Override
	public void run() {
		
		//LazySingleton ls1=LazySingleton.getInstance();
		BillPushSingleton bps=BillPushSingleton.getInstance();
		System.out.println("Thread1 called lazy singleton:"+bps.hashCode());
	}

}
