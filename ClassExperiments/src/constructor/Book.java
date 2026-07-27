package constructor;

import java.lang.Object;

public class Book {

	int bookId;
	String title;
	String author;
	String publisher;
	double price;
	
	public Book() {
		// TODO Auto-generated constructor stub
		Object obj = new Object();
		
	}

	public Book(int bookId, String title) {
		super();
		this.bookId = bookId;
		this.title = title;
	}

	public Book(int bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	public Book(int bookId, String title, String author, String publisher) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	public Book(int bookId, String title, String author, String publisher, double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
