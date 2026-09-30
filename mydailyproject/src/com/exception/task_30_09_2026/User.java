package com.exception.task_30_09_2026;

import java.util.Scanner;

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

public class User {
	public static void main(String[] args) throws DuplicateUsernameException {
		String[] username = { "akash", "user123", "akash24" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		String un = sc.nextLine();
		boolean flag=true;
		for (int i = 0; i < username.length; i++) {
			try {
				if (un.equals(username[i])) {
					flag=false;
					throw new DuplicateUsernameException("Hello");
				}
			} catch (DuplicateUsernameException de) {
				de.printStackTrace();
			}
		}
		
		if(flag)
		System.out.println("Account created successfully");
	}
}
