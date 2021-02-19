package design_pattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String args[]){  
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		  
//		   for(String obj:list){
//			  System.out.println(obj);
//			  System.out.println(list.remove(1));//ConcurrentModificationException
//	      }
		  
		  //Traversing list through Iterator 
//		  Iterator<String>itr = list.iterator();
//		  while(itr.hasNext()){
//			  System.out.println(itr.next());
//		  }
		  
		  
		  
		 
	}
}
