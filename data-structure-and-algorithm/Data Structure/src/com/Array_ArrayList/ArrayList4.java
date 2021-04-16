package com.Array_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList4 {
	public static void main(String args[]) {
		   ArrayList<String> cities = new ArrayList<String>(){{
			   add("Delhi");
			   add("Agra");
			   add("Chennai");
			   }};
		  System.out.println("Content of Array list cities:"+cities);
	   }
}
