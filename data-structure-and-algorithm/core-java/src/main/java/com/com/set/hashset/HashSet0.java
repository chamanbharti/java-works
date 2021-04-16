package com.set.hashset;
/*							    Collection(I)1.2 v
							       |
							     Set(I)1.2 v
							     /     \
					     HashSet 1.2 v  SortedSet 1.2 v
					         |				 |
					       LinkedHashSet   NavigableSet(I) 1.6 v
					         	1.4 v					|
					         						TreeSet  1.2 v
							 
							
*/



import java.util.HashSet;
import java.util.Iterator;

public class HashSet0 {
	public static void main(String[] args) {
		HashSet<String> al=new HashSet<String>();  
		  al.add("B");  
		  al.add("C");  
		  al.add("D");  
		  al.add("Z");
		  al.add(null);
		  al.add("10");
		 // al.add("");
		  System.out.println(al.add("Z"));//false
		  System.out.println(al);//[null, D, 10, B, C, Z]
		//al.add(new Integer(10));//ClassCastException
		//ts.add(null);//NullPointerException
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){ 
		   System.out.println(itr.next());  
		  }  
	}

}
