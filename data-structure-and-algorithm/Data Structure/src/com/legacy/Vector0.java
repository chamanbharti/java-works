package com.legacy;

import java.util.Vector;

public class Vector0 {
	public static void main(String[] args) {
		Vector v=new Vector();//default capacity is 10
		System.out.println(v.capacity());//10
		
		for(int i=0;i<10;i++){
			v.add(i);
		}
		System.out.println(v.capacity());//10
		v.add("A");
		System.out.println(v.capacity());//new capacity=2*old capacity=20
		System.out.println(v);
	}

}
