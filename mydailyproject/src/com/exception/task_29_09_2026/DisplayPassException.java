package com.exception.task_29_09_2026;

import java.util.Scanner;

/*
 * *Today's Assignment*

*Java*-

1.Create a Java program that accepts a user's age and creates a 
custom exception InvalidAgeException. Throw the exception if the age 
is less than 18; otherwise, display "Registration Successful."

2.Create a Java program that accepts a password and creates a custom 
exception InvalidPasswordException. Throw the exception if the password
 less than 8 characters; otherwise, display "Password Accepted."
 */
public class DisplayPassException {
	public static void main(String[] args) {
		System.out.println("Enter the password");
		Scanner sc = new Scanner(System.in);
		String pass = sc.nextLine();

		try {
			if (8 <= pass.length())
				System.out.println("Password Accepted");
			else {
				throw new InvalidPasswordException("Password cannot be less than 8 characters");
			}
		} catch (InvalidPasswordException e) {
			e.printStackTrace();
		}

	}
}
