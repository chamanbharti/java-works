package com.Array_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String args[]){  
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		  //Traversing list through Iterator 
		 /* Iterator<String>itr = list.iterator();
		  while(itr.hasNext()){
			  //itr.remove();//java.lang.IllegalStateException
			  System.out.println(itr.next());
			  //itr.remove();
			  //list.remove(1);
			  list.remove("Ajay");
		  }*/
		  
		 /* for(String obj:list){
			  System.out.println(obj);
			  //System.out.println(list.remove(1));//ConcurrentModificationException
		  }*/
		  
		  for(int i=0;i<list.size();i++){
			  //System.out.println(list.get(i));
			 // System.out.println(list.remove(i));
			 // System.out.println(list.get(4);
			  System.out.println(list.remove("Ajay"));
		  }
		  for(String obj:list){
			  System.out.println(obj);
			  //System.out.println(list.remove(1));//ConcurrentModificationException
		  }
	}
}
