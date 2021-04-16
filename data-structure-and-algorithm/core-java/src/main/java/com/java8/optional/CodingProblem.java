package com.java8.optional;

import java.util.Optional;

public class CodingProblem {
	public static void main(String[] args) {
		
		//Avoid
//		Optional<Book> book1 = null;
//		//Prefer
//		Optional<Book> book2 = Optional.empty();
		
		
		//Avoid
//		Optional<Book> emptyBook = Optional.empty();
//		Book theBook1 = emptyBook.get();
//		System.out.println(theBook1);//causes java.util.NoSuchElementException: No value present
		
		//Prefer
//		Optional<Book> emptyBook2 = Optional.empty();
//		if(emptyBook2.isPresent()) {
//			Book theBook2 = emptyBook2.get();
//			System.out.println("Book: "+theBook2);
//		}else {
//			System.out.println("empty book....");
//		}
		
		 Book book = new Book();

        // Avoid
        System.out.println(book.findStatusAvoid());

        // Prefer
        System.out.println(book.findStatusPrefer());
	}
}
