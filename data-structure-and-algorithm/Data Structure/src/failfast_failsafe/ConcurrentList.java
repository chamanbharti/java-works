package failfast_failsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentList {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        //get iterator
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
        	//System.out.println("List is :"+list);
        	String str = itr.next();
        	System.out.println(str);//List is :[1, 2, 3, 4, 5]
        	//RE
        	/*if(str.equals("2")){
    		//list.remove("5");
    	}*/
        	/*
To Avoid ConcurrentModificationException in single-threaded environment
You can use the iterator remove() function to remove the object from underlying 
collection object. But in this case you can remove the same object and not any other 
object from the list.
        	 */
        	//No RE
        	/*if(str.equals("2")){
        		itr.remove();
        	}*/
        	
        	//System.out.println("List is :"+list);//List is :[1, 3, 4, 5]
        	//RE
        	/*if(str.equals("3")){
        		list.add("3 found");
        	}*/
        	//below code don't throw ConcurrentModificationException
            //because it doesn't change modCount variable of list
        	if(str.equals("4")) 
        		list.set(1, "4");
        	System.out.println("List is :"+list);//List is :[1, 4, 3, 4, 5]
        }
	}

}
