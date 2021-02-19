package com.Array_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class FactoryMethod {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();  
		/*list.add("Java");  
		list.add("JavaFX");  
		list.add("Spring");  
		list.add("Hibernate");  
		list.add("JSP");  
		for(String l : list){  
		    System.out.println(l);  
		} */ 
		
		list = List.of("Chaman","Bharti","Java","JavaFX","Spring","Hibernate","JSP","Chaman","Bharti","Vandita","Godheja");
		int count=0;
		for(String l : list){  
			count++;
		    System.out.println(l);  
		}
		System.out.println("Total Element:"+count);
		list.add("Chama");
	}
}
