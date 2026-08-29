package com.casestudy5;

import java.util.Scanner;

public class Library extends Book {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id : ");
		int id = sc.nextInt();
		System.out.println("Enter the title : ");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.println("Enter the author name : ");
		String author = sc.nextLine();
		System.out.println("Enter the price : ");
		double price = sc.nextDouble();

		Library l = new Library();
		l.setBookId(id);
		l.setAuthor(author);
		l.setPrice(price);
		l.setTitle(title);

		l.display();

	}

	private void display() {
		System.out.println("Book Id : " + getBookId());
		System.out.println("Title of the Book : " + getTitle());
		System.out.println("Author of the Book : " + getAuthor());
		System.out.println("Price of the Book : " + getPrice());
	}

}
