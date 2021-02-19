package com.singleton;

public class Exerice {
	static int counter;
	
	public static void main(String[] args) {
		Satellite s=null;
		//Approach 0 only 3 object will be created
	/*	
	  for (int i = 0; i < 5; i++) {
			counter++;
			if(counter<=3){
				s=Satellite.getSatellite();
				System.out.println(s.hashCode());
			}
			
		}
	*/
		//Approach 2
	/*
		for (int i = 0; i < 3; i++) {
			s=Satellite.getSatellite();
			System.out.println(s.hashCode());
			
		}
	*/
		//Approach 3
	
		for (int i = 0; i < 5; i++) {
			s=Satellite.getSatellite();
			System.out.println(s.hashCode());
			
		}
	
	}

}
