package com.without_mockito.test_doubles.dummy;


import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;


public class DummyTest {

	@Test
	public void demoDummy() {
		BookRepository bookRepository = new FakeBookRepository();
		EmailService emailService = new DummyEmailService();
		BookService bookService = new BookService(bookRepository,emailService);
		
		bookService.addBook(new Book("1234","Mockito In Action",250, LocalDate.now()));
		bookService.addBook(new Book("1235","JUnit 5 In Action",200, LocalDate.now()));
		
		assertEquals(2, bookService.findNumberOfBooks());
	}
}
