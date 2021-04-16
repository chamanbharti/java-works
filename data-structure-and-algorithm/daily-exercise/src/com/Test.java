package com;

import java.util.HashSet;

class Temp{
	
	int i;
	Temp(int i){
		this.i=i;
	}
	
	public int hashCode() {
		return i;
	}
	
	public String toString() {
		return i+"";
	}
}

public class Test{
	 
	public static void main(String[] args){
		
     HashSet<Integer>hs = new HashSet<>();
     hs.add(new Temp(1));
     hs.add(2);
     hs.add(2);
     hs.add(20);
     
     
		
 
	}
 
	
}