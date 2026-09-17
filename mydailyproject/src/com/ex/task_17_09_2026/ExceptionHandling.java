package com.ex.task_17_09_2026;

import java.util.Scanner;

/*
 * *Today’s Assignment*:- 17/09/2026

*Java: -*
1.Create a Java program that performs the following operations:
Ask the user to enter two numbers as Strings.
Convert the Strings into integers using Integer.parseInt().
Divide the first number by the second number.
Handle ArithmeticException if the second number is 0.

Create an integer array containing 5 elements.
Ask the user to enter an array index and display the element at that index.
Handle ArrayIndexOutOfBoundsException if the index is invalid.
If the user enters an invalid number while converting the String to an integer,
 handle NumberFormatException.
Use separate catch blocks for all three exceptions.

Html-
1. Create a Web Page using HTML extension and take types of header tags and write your details like name, email, mobile number
 */
public class ExceptionHandling {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number 1 in string format");
		String s1 = s.next();
		System.out.println("Enter the number 2 in string format");
		String s2 = s.next();

		try {
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			System.out.println(a / b);

		} catch (NumberFormatException ne) {
			ne.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
