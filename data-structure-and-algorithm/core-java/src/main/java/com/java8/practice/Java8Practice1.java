package com.java8.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Practice1 {

	public static void main(String[] args) {
		
		// Filtering Collection by using Stream:
		List<Book> booksList = new ArrayList<>();
        // Adding Books
       booksList.add(new Book(1, "Learning J2SE", 100));
       booksList.add(new Book(2, "Learning J2EE", 200));
       booksList.add(new Book(3, "Learning C++", 300));
       booksList.add(new Book(4, "Learning Javascript", 400));
       booksList.add(new Book(5, "Learning Python", 500));
       System.out.println("old way");
       List<String>bookNameList = new ArrayList<>();
       for(Book b:booksList) {
    	   int price = b.price;
    	   String name = b.name;
    	   if(price < 500) {
    		   bookNameList.add(name);
    	   }
       }
       System.out.println(bookNameList);
       System.out.println("stream java 8");
       List<String>bookNameList2 = booksList.stream().filter(p->p.price < 500).map(p->p.name).collect(Collectors.toList());
       System.out.println(bookNameList2);
       
       
       System.out.println("Filtering and Iterating Collection by using Stream:");
       Stream.iterate(1, element->element+1).filter(element->element % 5 == 0).limit(5).forEach( s-> System.out.println(s));
       
       System.out.println("in older version to find total price");
       Integer totalPrice = 0;
       for(int i=0;i<booksList.size();i++) {
    	   Book book = booksList.get(i);
    	   totalPrice = totalPrice + book.price;
       }
       System.out.println(totalPrice);
       
       totalPrice = 0;
       System.out.println("reduce() Method in Collection by using Stream-> Approach I total price");
       totalPrice = booksList.stream().map(predicate->predicate.price).reduce(0, (sum,price) -> sum + price);
       System.out.println(totalPrice);
       
       System.out.println("reduce() Method in Collection by using Stream-> Approach II total price");
       totalPrice = 0;
       totalPrice = booksList.stream().map(Book::getPrice).reduce(0, Integer::sum);
       System.out.println(totalPrice);
       
       System.out.println("Sum by using Collectors Methods by in Stream:");
//       int sumOfPrice = booksList.stream().collect(Collectors.summingInt(p->p.price));
       int sumOfPrice = booksList.stream().collect(Collectors.summingInt(Book::getPrice));
       System.out.println(sumOfPrice);
       
       System.out.println("Find Max and Min Product Price by using Stream:");
       Book bookMaxPrice = booksList.stream().max( (a,b) -> a.price > b.price ? 1 : -1).get();
       System.out.println("name:"+bookMaxPrice.getName()+",price:"+bookMaxPrice.price);
       
       Book bookMinPrice = booksList.stream().min( (a,b) -> a.price > b.price ? 1 : -1).get();
       System.out.println("name:"+bookMinPrice.getName()+",price:"+bookMinPrice.price);
       
       System.out.println("count() Method in Collection by using Stream:");
       long count = 0;
       for(Book b:booksList) {
    	   int price = b.price;
    	   if(price > 200) {
    		   count = count + 1;
    	   }
       }
       System.out.println(count);
       count = 0;
       count = booksList.stream().filter(p->p.price > 200).count();
       System.out.println(count);
       
       System.out.println("Convert List into Set by using Stream:");
       Set<String>set = new HashSet<>();
       for(Book b:booksList) {
    	   if(b.price > 200) {
    		   set.add(b.name);
    	   }
       }
       System.out.println(set);
       set = null;
       set = booksList.stream().filter(p->p.price > 200).map(book->book.getName()).collect(Collectors.toSet());
       //set = booksList.stream().filter(p->p.price > 200).map(Book::getName).collect(Collectors.toSet());
       System.out.println(set);
       
       System.out.println("Convert List into Map by using Stream:");
       Map<Integer,String>bookPriceMap = new HashMap<>();
       for(Book b:booksList) {
    	   int key = b.id;
    	   String value = b.name;
    	   bookPriceMap.put(key, value);
       }
       for(Entry<Integer,String>entry: bookPriceMap.entrySet()) {
    	   System.out.println("Key:"+entry.getKey()+", Value:"+entry.getValue());
       }
       System.out.println("using java 8");
       bookPriceMap = null;
       bookPriceMap = booksList.stream().collect(Collectors.toMap(p->p.id, p->p.name));
       bookPriceMap.entrySet().forEach(m->System.out.print("Key:"+m.getKey()+", Value:"+m.getValue()+"\n"));
	}
}
