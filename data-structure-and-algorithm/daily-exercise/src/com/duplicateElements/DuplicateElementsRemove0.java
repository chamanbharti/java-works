package com.duplicateElements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateElementsRemove0 {
	
	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<>();
		al.add("Java");
		al.add("J2EE");
		al.add("JSP");
		al.add("Servlet");
		al.add("Java");
		al.add("Struts");
		al.add("JSP");
		
		/*LinkedHashSet<String>set = new LinkedHashSet<>(al);
		System.out.println(set);*/
		/*HashSet<String>set = new HashSet<>(al);
		System.out.println(set);*/
		
		//insertion order is erased
		/*System.out.print("ArrayList With Duplicate Elements :");
		System.out.println(al);
		//constructing HashSet using al
		HashSet<String>set = new HashSet<String>(al);
		//constructing al using set
		ArrayList<String>al2 = new ArrayList<String>(set);
		//printing unique element
		System.out.print("ArrayList after removing duplicate elements :");
		System.out.println(al2);*/
		
		
		System.out.print("ArrayList With Duplicate Elements :");
		System.out.println(al);
		//constructing HashSet using al
		LinkedHashSet<String>set = new LinkedHashSet<String>(al);
		//constructing al using set
		ArrayList<String>al2 = new ArrayList<String>(set);
		//printing unique element
		System.out.print("ArrayList after removing duplicate elements :");
		System.out.println(al2);
	}

}
