package com.singleton;

import java.io.Serializable;


public class SerializableClass implements Serializable{

private static final long serialVersionUID = -5462;
	
	private SerializableClass() {
		
	}
	private static class SingletonHelper{
		private static final SerializableClass instance=new SerializableClass();
	}
	
	public static SerializableClass getInstance() {
		return SingletonHelper.instance;
	}
	
	protected Object readResolve() {
		return getInstance();
	}
}
