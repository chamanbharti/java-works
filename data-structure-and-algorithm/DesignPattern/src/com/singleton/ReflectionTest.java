package com.singleton;

import java.lang.reflect.Constructor;

public class ReflectionTest {

	public static void main(String[] args) {
		Satellite t1 = Satellite.getSatellite();
		Satellite t2 = null;
		try {
			Constructor[] constructors=Satellite.class.getDeclaredConstructors();
			for(Constructor constructor:constructors) {
				//below code will destroy the singleton pattern
				constructor.setAccessible(true);
				t2 = (Satellite)constructor.newInstance();
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}
}
