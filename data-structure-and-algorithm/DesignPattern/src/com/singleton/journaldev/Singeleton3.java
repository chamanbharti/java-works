package com.singleton.journaldev;

class Moon{
	
	private static Moon m;//lazy loading
	//private constructor to avoid client applications to use constructor
	private Moon(){
		
	}
	
	public static Moon getInstance(){
		if(m==null){
			m=new Moon();
		}
		return m;
	}
}
public class Singeleton3 {
	public static void main(String[] args) {
		Moon m1=Moon.getInstance();
		Moon m2=Moon.getInstance();
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
	}
	
}
