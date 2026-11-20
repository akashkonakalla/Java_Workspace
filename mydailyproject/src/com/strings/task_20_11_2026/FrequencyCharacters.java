package com.strings.task_20_11_2026;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Today's Assignment 

Java
1. Occurrence of Each Character in a String
Example: Input: "banana" → Output: {"b":1, "a":3, "n":2}
2.find Longest and Second Longest Word with Length in a string sentence.
Example: Input: "I love programming and debugging" → Longest:
"programming" (11), Second: "debugging" (9)
 */
public class FrequencyCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.nextLine();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		System.out.println("The frequency is : " + map);
	}

}
