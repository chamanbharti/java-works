package com.set.treeset;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet0 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		/*ts.add("A");
		ts.add("a");
		ts.add("B");
		ts.add("Z");
		ts.add("L");
		//ts.add(new Integer(10));//ClassCastException
		ts.add(null);//NullPointerException
		ts.add("A");
		System.out.println(ts);//[A, B, L, Z, a]*/
		
		//try to insert homogenious data type
		/*ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("Z"));
		ts.add(new StringBuffer("U"));
		ts.add(new StringBuffer("D"));
		System.out.println(ts);//RT:ClassCastException
		 */	
		
		/*ts.add(new StringBuilder("A"));
		ts.add(new StringBuilder("Z"));
		ts.add(new StringBuilder("U"));
		ts.add(new StringBuilder("D"));
		System.out.println(ts);//RT:ClassCastException
		 */	
		
		/*ts.add(new String("A"));
		ts.add(new String("Z"));
		ts.add(new String("U"));
		ts.add(new String("D"));
		System.out.println(ts);//[A, D, U, Z]
		 */
		/*ts.add(new Integer(8));
		ts.add(new Integer("5"));
		ts.add(new Integer("3"));
		ts.add(new Integer("99"));
		System.out.println(ts);//[3, 5, 8, 99]
		 */
		 ArrayList<String> al=new ArrayList<>();
		 al.add("Z");
		 al.add("Y");
		 al.add("A");
		 al.add("O");
		 
		 TreeSet tt = new TreeSet<>(al);
		 System.out.println(tt);//[A, O, Y, Z]
		
		/*ArrayList al=new ArrayList();
		 al.add("Z");
		 al.add("Y");
		 al.add("A");
		 al.add("O");
		 al.add(1);
		 
		 TreeSet tt = new TreeSet(al);
		 System.out.println(tt);//RT:ClassCastException
		 */
		
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
		
		}

}
class MyComparator implements Comparator{
	public int compare(Object o1,Object o2){
		Integer i = (Integer)o1;
		Integer ii = (Integer)o2;
		
		// step 1
		// descending order [20, 15, 10, 5, 0]
		if(i<ii)
			return 1;
		else if(i>ii)
			return -1;
		else
		return 0;
		
		// step 2 
		//ascending order [0, 5, 10, 15, 20]
		/*if(i>ii)
			return 1;
			else if(i<ii)
				return -1;
			else 
				return 0;*/
		
		//step 3
		
		/*//return i.compareTo(ii);//default natural sorting order
								//ascending order [0, 5, 10, 15, 20]
		//return -i.compareTo(ii); //descending order [20, 15, 10, 5, 0]
		
		//return ii.compareTo(i); //descending order [20, 15, 10, 5, 0]
		//return -ii.compareTo(i); //ascending order [0, 5, 10, 15, 20]
		
		//return +1; //insertion order [10, 0, 15, 5, 20, 20]
		//return -1; //reverse of insertion order [20, 20,5,15,0,10]
		//return 0; //[10] only first element will be inserted an all remaining are duplicate
		*/
		
				
	}
}
