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

public class PalindromeStringOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check palindrome or not");
		String str = sc.nextLine();

		boolean flag = isPalindrome(str);

		if (flag) {
			System.out.println(str + " is palindrome");
		} else {
			System.out.println(str + " is not palindrome");
		}

	}

	private static boolean isPalindrome(String str) {

		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
