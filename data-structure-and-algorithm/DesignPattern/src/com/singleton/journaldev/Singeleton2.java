package com.singleton.journaldev;

class TajMahal{
	
	private static TajMahal t;
	//private constructor to avoid client applications to use constructor
	private TajMahal(){
		
	}
	//static block initialization for exception handling
	static{
		try{
			t=new TajMahal();
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException("Exception occured in creating"+
					"singleton instance");
		}
	}
	
	public static TajMahal getInstance(){
		return t;
	}
}
public class Singeleton2 {
	public static void main(String[] args) {
		TajMahal t1=TajMahal.getInstance();
		TajMahal t2=TajMahal.getInstance();
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}
	
}
