package com.casestudy5;

/*
 A library stores information about books. Book details should not be 
 modified directly from outside the class

  Create a class Books with private variables:
 * bookId
 * title
 * author
 * price 
  
 create getters and setters for all variables and display the details.
*/
public class Book {

	private int bookId;
	private String title;
	private String author;
	private double price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
