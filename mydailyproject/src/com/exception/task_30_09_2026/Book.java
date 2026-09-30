package com.exception.task_30_09_2026;

import java.io.Serializable;

/*
 * *Today's Assignment*

*Java*-

1.Create a custom exception DuplicateUsernameException. 
Throw the exception if the entered username already exists;
otherwise, create the account.

2.Create a Book class with bookId, title, author, and price,
 where bookId is declared as transient. Serialize the Book object
  into a file, deserialize it, and display all the details.
 */

public class Book implements Serializable {
	transient int bookId;
	String title;
	String author;
	double price;

	Book(int bookId, String title, String author, double price) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
}
