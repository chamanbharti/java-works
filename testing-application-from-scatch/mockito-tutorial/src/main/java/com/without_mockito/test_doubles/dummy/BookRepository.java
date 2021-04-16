package com.without_mockito.test_doubles.dummy;

import java.util.Collection;

public interface BookRepository {

	void save(Book book);
	Collection<Book>findAll();
}
