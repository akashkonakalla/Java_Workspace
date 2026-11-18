package com.strings.task_18_11_2026;

import java.util.Scanner;

/*
 * *Today's Assignment* 

*Java*

1.Write a Java program to reverse a given string without using the built-in reverse() method.
Input: Hello
Output: olleH

Input: Java Programming
Output: gnimmargorP avaJ

2.Write a Java program to check whether a given string is a palindrome or not.
A palindrome is a string that reads the same from left to right and right to left.
Input: madam

Output: madam is a Palindrome
 */
public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Program to reverse the given string");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string to reverse");
		String str = sc.nextLine();

		System.out.println("The reversed string is : " + reverseString(str));

	}

	public static String reverseString(String str) {

		String st = "";
		for (int i = 0; i < str.length(); i++) {
			st = str.charAt(i) + st;
		}

		return st;
	}

}
