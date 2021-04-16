package com.section1.lld.solid.s;

public class SingleResponsibility {
/*
 * A class should have one and only one reason to change, meaning that a class should have only one job.
 */
}
class Book{
	private String bookName;
	private String author;
	private String text;
	
	// duty related to book property
	public boolean findByAuthor(String name) {
		return author.contains(name);
	}
	
	public boolean findByName(String bookName) {
		return bookName.contains(bookName);
	}
	
	/*
	// it break principle
	// printing it on console
	public void printTextConsole() {
		// this is not recommended
	}
	*/
	// so we are creating utility class below
}
class BookPrinter{
	// method for outputting text
	void printTextToConsole(String text) {
		
	}
	// share text to other medium like logger,email
	void shareTextToOtherMedium(String text) {
		
	}
}
