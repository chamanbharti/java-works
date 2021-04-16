package ds.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Ravi");//Adding object in arraylist    
	      list.add("Vijay");    
	      list.add("Ravi");    
	      list.add("Ajay");    
	      //Invoking arraylist object   
	     // System.out.println(list);
	      /*
	        Ways to iterate the elements of the collection in java
			There are various ways to traverse the collection elements:
			
			By Iterator interface.
			By for-each loop.
			By ListIterator interface.
			By for loop.
			By forEach() method.
			By forEachRemaining() method.
	       */
	      //By Iterator interface.
//	      System.out.println("Traversing list through List Iterator:");  
//	      while(itr.hasNext()) {
//	    	  if(itr.equals("Ajay")){
//	      }	  itr.remove();
//	      }
//	      System.out.print(itr.next()+" ");
	      
	      //By for-each loop.
//	      for(String obj:list) {
//	      System.out.print(obj+" ");
//	      }
	  
	      
//	      System.out.println("By ListIterator interface:");  
//	      ListIterator<String>itr1 = list.listIterator(list.size());
//	      while(itr1.hasPrevious()) {
//	    	  
//	    	  String str= itr1.previous();
//	    	  System.out.println(str);
//	    	  
//	      }
	      
//	      System.out.println("Traversing list through for loop:");  
//          for(int i=0;i<list.size();i++)  
//          {  
//           System.out.println(list.get(i));     
//          }  

//	      System.out.println("Traversing list through forEach() method:"); 
//	      list.forEach(action->{
//	    	  if(action.equals("Ajay")) {
//	    		  list.remove(action);
//	    	  }
//	    	  System.out.println(action);
//	      });
	      
//	      System.out.println("Traversing list through forEachRemaining() method:"); 
//	      Iterator<String> itr = list.iterator();
//	      itr.forEachRemaining(action->{
//	    	  System.out.println(action);
//	      });
	      
//	      System.out.println("After invoking add(E e) method: "+list);  
//          //Adding an element at the specific position  
//	      list.add(1, "Gaurav");  
//          System.out.println("After invoking add(int index, E element) method: "+list); 
//          ArrayList<String> list2=new ArrayList<String>();  
//          list2.add("Sonoo");  
//          list2.add("Hanumat");  
//          //Adding second list elements to the first list  
//          list.addAll(list2);
//          System.out.println("After invoking addAll(Collection<? extends E> c) method: "+list);  
//
//          ArrayList<String> list3=new ArrayList<String>();  
//          list3.add("John");  
//          list3.add("Rahul");  
//          //Adding second list elements to the first list at specific position  
//          list.addAll(1, list3);  
//          System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+list);  
	      
//	      System.out.println("An initial list of elements: "+list);   
//          //Removing specific element from arraylist  
//	      list.remove("Vijay");  
//          System.out.println("After invoking remove(object) method: "+list);   
//          //Removing element on the basis of specific position  
//          list.remove(0);  
//          System.out.println("After invoking remove(index) method: "+list); 
          
        //Creating another arraylist  
//          ArrayList<String> list2=new ArrayList<String>();    
//          list2.add("Ravi");    
//          list2.add("Hanumat");    
//          //Adding new elements to arraylist  
//          list.addAll(list2);  
//          System.out.println("Updated list : "+list);   
//          //Removing all the new elements from arraylist  
//          list.removeAll(list2);  
//          System.out.println("After invoking removeAll() method: "+list);   
	      
//	      System.out.println("An initial list of elements: "+list); 
//          list.removeIf(filter->filter.contains("Ajay"));
//          System.out.println("After invoking removeIf() method: "+list);  
           
          //Removing specific element from arraylist  
	      list.remove("Vijay");  
          System.out.println("After invoking remove(object) method: "+list);   
	}
}
