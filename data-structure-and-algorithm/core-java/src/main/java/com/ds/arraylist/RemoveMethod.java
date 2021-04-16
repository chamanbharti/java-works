package ds.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;

public class RemoveMethod {
	
	 public static void main(String[] args) {
		// create an ArrayList which contains 
	        // emails for a group of people 
	        ArrayList<String> list = new ArrayList<String>(); 
	  
	        // Add emails to list 
	        list.add("abc@geeksforgeeks.org"); 
	        list.add("user@geeksforgeeks.org"); 
	        list.add("pqr@geeksforgeeks.org"); 
	        list.add("random@geeksforgeeks.org"); 
	        list.add("randomuser@geeksforgeeks.org"); 
	  
	        // create Spliterator of ArrayList 
	        // using spliterator() method 
	        Iterator<String> emails1 = list.iterator(); 
	        Spliterator<String> emails = list.spliterator(); 
	  
	        // print result from Spliterator 
	        System.out.println("list of Emails:"); 
	  
	        // forEachRemaining method of Spliterator 
	        emails.forEachRemaining((n) -> System.out.println(n)); 
	        list.forEach(action->System.out.print(action));
  }
}
