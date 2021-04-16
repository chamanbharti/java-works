package com.sorting.comparator;

public class Book implements Comparable<Book> 
{ 
	private String title; 
	private String author; 
	private int price;
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	public int compareTo(Book book) {
		int i = this.title.compareTo(book.title);
		if(i != 0) {
			return i;
		}
		i = this.author.compareTo(book.author);
		if(i != 0) {
			return i;
		}
		return Integer.compare(this.price, book.price);
	}
	
}

