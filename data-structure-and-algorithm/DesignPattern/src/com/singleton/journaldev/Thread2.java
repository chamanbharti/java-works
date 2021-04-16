package com.singleton.journaldev;

public class Thread2 implements Runnable{
	@Override
	public void run() {
		
		//LazySingleton ls2=LazySingleton.getInstance();
		BillPushSingleton bps=BillPushSingleton.getInstance();
		System.out.println("Thread2 called lazy singleton:"+bps.hashCode());
	}

}
