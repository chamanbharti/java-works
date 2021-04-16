package com.singleton;

public class Satellite {
	//Approach 1 for eager loading
	/*private static final Satellite _instance=new Satellite();
	
	
	private Satellite(){
		
	}
	
	public static Satellite getSatellite(){
		
			return _instance;
		
		
	}*/
	
	//Approach 2 for exception handling
	/*private static final Satellite _instance;
	private Satellite() {}
	
	static {
		try {
			_instance = new Satellite();
		}catch(Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	public static Satellite getSatellite() {
		return _instance;
	}*/
	
	//Approach 3 for Lazy initialization
	/*private static Satellite _instance=null;
	
	private Satellite(){
		
	}
	
	//public static synchronized Satellite getSatellite(){ this is not recommended
	public static synchronized Satellite getSatellite(){	
		if(_instance==null){
			_instance=new Satellite();
		}
		return _instance;
	}*/
	
	/*//Approach 4
	private static Satellite _instance;
	private Satellite() {}
	
	public static synchronized Satellite getSatellite() {
		if(_instance==null) {
			_instance=new Satellite();
		}
		return _instance;
	}*/
	
	//Approach 5
		private static Satellite _instance;
		private Satellite() {}
		
		public static Satellite getSatellite() {
			if(_instance==null) {
				synchronized (Satellite.class) {
					if(_instance==null) {
						_instance = new Satellite();
					}
				}
			}
			return _instance;
		}
	//Approach 6 Bill Pugh approach
	/*private Satellite(){
			
		}
	//Inner class
	private static class SatelliteHelper{
		private static final Satellite _innerInstance=new Satellite();
		
	}

	protected static Satellite getSatellite(){	
		
		return SatelliteHelper._innerInstance;
	}*/
		
}
