package com.Array_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayArrayList2 {
	public static void main(String[] args) {
		
		//ArrayList Example
		ArrayList<String> obj=new ArrayList<String>();
		  obj.add("Ajeet");
		  obj.add("Harry");
		  obj.add("Chaitanya");
		  obj.add("Steve");
		  obj.add("Anuj");
		  System.out.println("Currently the array list has following elements:"+obj);
		  //add element at given index
		  obj.add(0, "Chaman");
		  obj.add(1, "Bharti");
		  System.out.println(obj);
		  //remove element from array list like this
		  obj.remove("Chaitanya");
		  obj.remove("Harry");
		  System.out.println("Current array list is:"+obj);
		  /*Remove element from the given index*/
		  obj.remove(1);
		  
		  //update element
		  obj.set(2, "Rahi");
		  //int pos = obj.indexOf("Tom");
		  int pos2 = obj.indexOf("Chaman");
		  System.out.println(pos2);//-1 means element not available
		  System.out.println("Current array list is:"+obj);
		
		
	}

}
