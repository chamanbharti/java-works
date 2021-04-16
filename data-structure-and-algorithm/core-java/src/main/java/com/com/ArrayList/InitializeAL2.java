package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class InitializeAL2 {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<String>(){{
			
			   add("Delhi");
			   add("Agra");
			   add("Chennai");
		}
	 };
	 System.out.println("content of ArrayList cities: "+cities);
	}
}
