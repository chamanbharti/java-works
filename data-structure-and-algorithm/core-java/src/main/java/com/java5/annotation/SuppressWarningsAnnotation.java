package com.java5.annotation;

import java.util.ArrayList;

public class SuppressWarningsAnnotation {

	@Deprecated
	public static void deprecatedMethod() { 
	    System.out.println("Deprecated method"); 
	  }
	
	@SuppressWarnings({ "unchecked", "rawtypes", "deprecated" })
	public static void main(String[] args) {
		ArrayList list=new ArrayList();  
		list.add("sonoo");  
		list.add("vimal");  
		list.add("ratan");  
		  
		for(Object obj:list)  
		System.out.println(obj); 
		
		SuppressWarningsAnnotation obj = new SuppressWarningsAnnotation();
		obj.deprecatedMethod();
	}
}
