package com.legacy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		Vector ve = new Vector();
	       ve.add(10);
	       ve.add(20);
	       ve.add(30);
	       ve.add(40);
	       ve.add(50);
	       ve.add(60);
	       
	       /*Enumeration en = ve.elements();
	       
	       while(en.hasMoreElements())
	       {
	           System.out.println(en.nextElement());
	       }*/
	      /* for(Object o:ve){
	    	   System.out.println(o);
	       }*/
	       Iterator itr=ve.iterator();
	       while(itr.hasNext()){
	    	   System.out.println(itr.next());
	       }
	}

}
