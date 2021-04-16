package com.without_mockito.test_doubles.fake;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.without_mockito.test_doubles.fake.Book;
import com.without_mockito.test_doubles.fake.BookRepository;

public class FakeBookRepository implements BookRepository{

	// In memory database, HashMap or List
	Map<String, Book>bookStore = new HashMap<>();
	
	@Override
	public void save(Book book) {
		bookStore.put(book.getBookId(), book);
		
	}

	@Override
	public Collection<Book> findAll() {
		return bookStore.values();
	}

	
}
