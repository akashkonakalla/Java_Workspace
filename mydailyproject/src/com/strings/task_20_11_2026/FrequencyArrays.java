package com.strings.task_20_11_2026;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Today's Assignment 

Java
1. Occurrence of Each Character in a String
Example: Input: "banana" → Output: {"b":1, "a":3, "n":2}
2.find Longest and Second Longest Word with Length in a string sentence.
Example: Input: "I love programming and debugging" → Longest:
"programming" (11), Second: "debugging" (9)
 */
public class FrequencyArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.nextLine();

		Set<Character> ls = new HashSet<>();

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ls.add(ch)) {
				System.out.println(ch + ":" + countChars(st, ch));
			}

		}

	}

	private static int countChars(String st, char ch) {

		int count = 0;
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == ch) {
				count++;
			}
		}

		return count;

	}

}
