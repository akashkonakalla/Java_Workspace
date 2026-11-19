package com.strings.task_19_11_2026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
 * *Today's Assignment*

*Java*
1.Check if Given Array of Strings are Palindromes
     Example: Input: ["madam", "hello", "civic"] → Output: {"madam": True, "hello": False, "civic": True}
2.Print First Non-Repeating Characters in a String
    Example: Input: "swiss" → Output: "w"

*Servlets*
1.Develop a web application using Java Servlets and JDBC to implement CRUD (Create, Read, Update, Delete) operations
 */
public class PalindromeList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the list of strings or exit to break");
		List<String> l = new ArrayList<>();
		while (true) {

			String st = sc.nextLine();
			if (st.equals("break")) {
				break;
			}

			l.add(st);

		}

		HashMap<String, Boolean> map = new HashMap<>();

		for (String s : l) {

			map.put(s, isPalindrome(s));
		}

		System.out.println(map);

	}

	private static boolean isPalindrome(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			str = s.charAt(i) + str;
		}

		if (s.equals(str))
			return true;

		return false;

	}

}
