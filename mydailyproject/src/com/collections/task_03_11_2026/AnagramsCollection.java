package com.collections.task_03_11_2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * *Today's Assignment*

*Java*- 

1.Write a Java program to count the frequency of elements in an array using a Map.
Input:[1, 2, 2, 3, 1, 4, 3]
Output:Frequencies: {1=2, 2=2, 3=2, 4=1}
2.Given an array of strings, group the anagrams together.
Input: ["eat","tea","tan","ate","nat","bat"]
Output: [["eat","tea","ate"],["tan","nat"],["bat"]]

*React*-
1.Develop a React application that implements CRUD (Create, Read, Update, Delete) operations.
 */

public class AnagramsCollection {

	public static List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> li = new ArrayList<>();
		int n = strs.length;
		boolean visit[] = new boolean[n];

		for (int i = 0; i < n; i++) {

			if (visit[i])
				continue;
			else {
				List<String> newl = new ArrayList<>();
				String st = strs[i];
				visit[i] = true;
				for (int j = i; j < n; j++) {
					if (isAnagram(st, strs[j])) {
						visit[j] = true;
						newl.add(strs[j]);
					}
				}
				li.add(newl);
			}

		}
		return li;

	}

	public static boolean isAnagram(String s1, String s2) {

		char[] chars1 = s1.toCharArray();
		char[] chars2 = s2.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		String sorted = new String(chars1);
		String sorted2 = new String(chars2);

		if (sorted.equals(sorted2)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		sc.nextLine();
		String st[] = new String[n];

		System.out.println("Enter the strings");
		for (int i = 0; i < n; i++) {
			st[i] = sc.nextLine();
		}

		System.out.println(groupAnagrams(st));

	}
}
