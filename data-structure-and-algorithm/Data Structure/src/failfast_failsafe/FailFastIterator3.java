package failfast_failsafe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
//http://www.javamadesoeasy.com/2015/04/concurrentmodificationexception-fail.html
public class FailFastIterator3 {
	public static void main(String[] args) {
		
		//Creating an ArrayList of integers
        //List<Integer> list = new CopyOnWriteArrayList<Integer>();
		Set<Integer> list = new CopyOnWriteArraySet<Integer>();
        //Adding elements to list
        list.add(1452);
        list.add(6854);
        list.add(8741);
        list.add(6542);
        list.add(3845);
         
        //Getting an Iterator from list
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
        	//itr.remove();//will throw UnsupportedOperationException
        	Integer integer = (Integer)itr.next();
        	//itr.remove();//will throw UnsupportedOperationException
        	System.out.println(integer);
        	if(integer.equals(3845))
        	list.add(8457);//will not throw ConcurrentModificationException
        }
        System.out.println("\nAfter iteration list is : "+list);
	}

}
