package design_pattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class TestAllCursor {

	public static void main(String[] args) {
		
//		Vector v = new Vector(); 
//		  
//        // Create three iterators 
//        Enumeration e = v.elements(); 
//        Iterator  itr = v.iterator(); 
//        ListIterator ltr = v.listIterator(); 
//  
//        // Print class names of iterators 
//        System.out.println(e.getClass().getName()); 
//        System.out.println(itr.getClass().getName()); 
//        System.out.println(ltr.getClass().getName()); 
        /**
         java.util.Vector$1
		 java.util.Vector$Itr
		 java.util.Vector$ListItr
         */
		
//		ArrayList list = new ArrayList(); 
//		  
//        // Create three iterators 
//		Enumeration e = Collections.enumeration(list);
//        Iterator  itr = list.iterator(); 
//        ListIterator ltr = list.listIterator(); 
//  
//        // Print class names of iterators 
//        System.out.println(e.getClass().getName()); 
//        System.out.println(itr.getClass().getName()); 
//        System.out.println(ltr.getClass().getName()); 
        /**
         java.util.Collections$3
		 java.util.ArrayList$Itr
		 java.util.ArrayList$ListItr
        */
		
		LinkedList linkedList = new LinkedList(); 
		  
        // Create three iterators 
		Enumeration e = Collections.enumeration(linkedList);
        Iterator  itr = linkedList.iterator(); 
        ListIterator ltr = linkedList.listIterator(); 
  
        // Print class names of iterators 
        System.out.println(e.getClass().getName()); 
        System.out.println(itr.getClass().getName()); 
        System.out.println(ltr.getClass().getName()); 
        /**
         java.util.Collections$3
		 java.util.LinkedList$ListItr
		 java.util.LinkedList$ListItr
        */
	}
}
