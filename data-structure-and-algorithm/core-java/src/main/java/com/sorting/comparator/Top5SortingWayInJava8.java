package com.sorting.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Top5SortingWayInJava8 {

	public static void main(String[] args) {
		
		List<Book> listOfBooks = new ArrayList<>(); 
		listOfBooks.add(new Book("Effective Java", "Joshua Bloch", 32)); 
		listOfBooks.add(new Book("Java Puzzlers", "Joshua Bloch", 22)); 
		listOfBooks.add(new Book("Java Concurrency in Practice", "Brian Goetz", 42)); 
		listOfBooks.add(new Book("Java SE 8 for Really Impatient", "Cay S. Horstmann", 34)); 
		listOfBooks.add(new Book("Core Java", "Cay S. Horstmann",32));
		listOfBooks.add(null);
		
		//1. Writing Comparator using Lambda Expression
		//Collections.sort(listOfBooks);
		//Comparator<Book>sortByAuthor = (a,b) -> a.getAuthor().compareTo(b.getAuthor());
		//listOfBooks.sort(sortByAuthor);
		/*
		System.out.println("until java 7");
		Comparator<Book>sortByAuthorOldWay = new Comparator<Book>() {
			public int compare(Book a,Book b) {
				return a.getAuthor().compareTo(b.getAuthor());
			}
		};
		listOfBooks.sort(sortByAuthorOldWay);
		System.out.println(listOfBooks);
		
		*/
		/*
		String[] testString = {"Z","B","O","A"};
		
		// old style
		Arrays.sort(testString, new Comparator<String>() {
			public int compare(String a,String b) {
				return a.compareTo(b);
			}
		});
		*/
		//new Style
//		Arrays.sort(testString,(a,b) -> a.compareTo(b));
		//Arrays.sort(testString,(a,b) -> a.length() - b.length());
		//System.out.println(Arrays.toString(testString));
		
		//2. Writing Comparator using Method Reference
		//Comparator<Book>byAuthor = Comparator.comparing(Book::getAuthor);
		//Comparator<Book>byTitle = Comparator.comparing(Book::getTitle);
		//Comparator<Book>byPrice = Comparator.comparing(Book::getPrice);
		//listOfBooks.sort(byPrice);
		
		
		/*
		When it comes to sorting, you can also 
		directly pass the Comparator to Collections.sort() or List.sort() method as shown in the following example:
		*/
		//Collections.sort(listOfBooks,Comparator.comparing(Book::getPrice));
		//listOfBooks.sort(Comparator.comparing(Book::getPrice));
		//System.out.println(listOfBooks);
		
		//3. Chaining Comparators to compare multiple fields
		//Comparator<Book>byAuthorThenByPrice = Comparator.comparing(Book::getAuthor).thenComparing(Book::getPrice);
		//listOfBooks.sort(byAuthorThenByPrice);
		
		//listOfBooks.sort(Comparator.comparing(Book::getAuthor).thenComparing(Book::getPrice));
		//System.out.println(listOfBooks);
		
		//4. Sorting in reverse order of Comparator
		//listOfBooks.sort(Comparator.comparing(Book::getAuthor).reversed());
		//System.out.println(listOfBooks);
		
		//5. Sorting objects by the natural order
		//listOfBooks.sort(Comparator.naturalOrder());
		//System.out.println(listOfBooks);
		
		//6. Null-safe Sorting using nullsFirst() and nullsLast() Comparator
		Comparator<Book>byAuthor = (a,b) -> a.getAuthor().compareTo(b.getAuthor());
		//listOfBooks.sort(Comparator.nullsFirst(byAuthor)); 
		listOfBooks.sort(Comparator.nullsLast(byAuthor)); 
		System.out.println(listOfBooks);
	}
}
