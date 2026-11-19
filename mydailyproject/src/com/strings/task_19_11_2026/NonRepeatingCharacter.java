package com.strings.task_19_11_2026;

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
public class NonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.nextLine();
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (st.indexOf(ch) == st.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}
	}

}
