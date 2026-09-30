package com.exception.task_30_09_2026;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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

public class SerializationAndDeserialization{
	public static void main(String[] args) {

		// Serialization
		Book book = new Book(101, "Java Programming", "James Gosling", 599.50);

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\akhil\\Music\\new\\book.txt"))) {

			out.writeObject(book);
			System.out.println("Book object serialized successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialization
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\akhil\\Music\\new\\book.txt"))) {

			Book b = (Book) in.readObject();

			System.out.println("\nBook Details:");
			System.out.println("Book ID : " + b.bookId);
			System.out.println("Title   : " + b.title);
			System.out.println("Author  : " + b.author);
			System.out.println("Price   : " + b.price);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}