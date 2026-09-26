package com.ex.task_24_09_2026;

/*
 * Java-
1.Create classes Book and Magazine. Store a Magazine object in an 
Object reference. Cast it to Book and handle the ClassCastException.
 */
class Book {

}

public class Magazine extends Book {
	public static void main(String[] args) {
		try {
			Book b = (Magazine) new Book();
		} catch (ClassCastException e) {
			System.out.println("Exception");
			e.getStackTrace();
		}

	}
}
