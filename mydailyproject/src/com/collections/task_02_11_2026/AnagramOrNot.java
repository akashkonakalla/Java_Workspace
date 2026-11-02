package com.collections.task_02_11_2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 **Today's Assignment*

*Java*-

1.Write a Java program to check whether two given strings are anagrams or not using ArrayList.
Input:   listen
             silent
Output:
Anagrams
2.Write a Java program to find all common elements in three sorted arrays using a Set.
Input: [1, 5, 10], [1, 4, 10], [1, 6, 10] Output: [1, 10]

*React*-
1.Develop a React application that implements CRUD (Create, Read, Update, Delete) operations. 
 */
public class AnagramOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1");
		String s1 = sc.nextLine();
		System.out.println("Enter the string 2");
		String s2 = sc.nextLine();

		boolean yesno = checkAnagram(s1, s2);
		if (yesno) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not anagram");
		}

	}

	private static boolean checkAnagram(String s1, String s2) {

		List<Character> a1 = new ArrayList();
		List<Character> a2 = new ArrayList();

		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (char i : arr1) {
			a1.add(i);
		}

		for (char i : arr2) {
			a2.add(i);
		}

		if (a1.equals(a2))
			return true;

		return false;
	}
}
