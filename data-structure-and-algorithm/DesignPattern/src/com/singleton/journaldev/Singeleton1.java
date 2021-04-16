package com.singleton.journaldev;

class Sun{
	
	private static final Sun s=new Sun();//eager loading
	//private constructor to avoid client applications to use constructor
	private Sun(){
		
	}
	public static Sun getInstance(){
		return s;
	}
}
public class Singeleton1 {
	public static void main(String[] args) {
		Sun s1=Sun.getInstance();
		Sun s2=Sun.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
	
}
