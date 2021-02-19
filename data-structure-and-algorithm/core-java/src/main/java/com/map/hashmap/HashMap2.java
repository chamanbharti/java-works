package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.set.treeset.Book;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap<Integer,Book> hm = new HashMap<Integer,Book>();
		
		//creating book
		Book b1 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
		
		//adding book in HashMap
		hm.put(1, b1);
		
		hm.put(3, b3);
		hm.put(2, b2);
		
		for(Map.Entry<Integer,Book> entry:hm.entrySet()){
			int key = entry.getKey();
			Book b = entry.getValue();
			System.out.println(key+" Details:");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
		}
		
	}

}
