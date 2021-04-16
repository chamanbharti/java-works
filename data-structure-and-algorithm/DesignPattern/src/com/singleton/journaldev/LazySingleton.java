package com.singleton.journaldev;

public class LazySingleton {
	
	private static LazySingleton ls;
	private LazySingleton(){
		
	}
	//public static synchronized LazySingleton getInstance(){
		public static LazySingleton getInstance(){
		if(ls==null){
			synchronized (LazySingleton.class) {
				if(ls==null){
					ls=new LazySingleton();
				}
			}
		}
		return ls;
	}

}
