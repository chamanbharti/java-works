package com.junit5.assertions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.model.Book;
import com.service.BookService;

class AssertFalseDemo {

	@Test
	void assertFalseWithNoMessage() {
		BookService bookService = new BookService();
		
		Book book = new Book("1","head first java","wrox");
		bookService.addBook(book);
		
		List<Book> listOfBooks = bookService.books();
		assertFalse(listOfBooks.isEmpty());
	}
	
	@Test
	void assertFalseWithMessage() {
		BookService bookService = new BookService();
		Book book = new Book("1","head first java","wrox");
		bookService.addBook(book);
		List<Book> listOfBooks = bookService.books();
		assertFalse(listOfBooks.isEmpty(),"list of books is not empty");
	}
	
	@Test
	void assertFalseWithMessageSupplier() {
		BookService bookService = new BookService();
		Book book = new Book("1","head first java","wrox");
		bookService.addBook(book);
		List<Book> listOfBooks = bookService.books();
		assertFalse(listOfBooks.isEmpty(),() -> "list of books is not empty");
	}

	@Test
	void assertFalseWithBooleanSupplierAndNoMessage() {
		BookService bookService = new BookService();
		Book book = new Book("1","head first java","wrox");
		bookService.addBook(book);
		List<Book> listOfBooks = bookService.books();
		assertFalse( () -> listOfBooks.isEmpty());
	}
	
	@Test
	void assertFalseWithBooleanSupplierAndMessage() {
		BookService bookService = new BookService();
		Book book = new Book("1","head first java","wrox");
		bookService.addBook(book);
		List<Book> listOfBooks = bookService.books();
		assertFalse( () -> listOfBooks.isEmpty(), "list of books is not empty");
	}
	
	@Test
	void assertFalseWithBooleanSupplierAndMessageSupplier() {
		BookService bookService = new BookService();
		Book book = new Book("1","head first java","wrox");
		bookService.addBook(book);
		List<Book> listOfBooks = bookService.books();
		assertFalse( () -> listOfBooks.isEmpty(), () -> "list of books is not empty");
	}

}
