package com.set.treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class HashSet1 {
	public static void main(String[] args) {
		LinkedHashSet<Book> ts=new LinkedHashSet<Book>();  
		//create books
		Book b1=new Book(102,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(103,"Operating System","Galvin","Wiley",6);  
	    Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		
	    //adding books to TreeSet
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		
		//traversing TreeSet
		for(Book b:ts){
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}
