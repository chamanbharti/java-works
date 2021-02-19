package com.singleton.journaldev;

public class BillPushSingleton {
	
	private BillPushSingleton(){
		
	}
	private static class SingletonHelper{
		private static final BillPushSingleton obj=new BillPushSingleton();
	}
	
	public static BillPushSingleton getInstance(){
		return SingletonHelper.obj;
	}

}
