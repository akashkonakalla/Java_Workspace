package com.collections.task_03_11_2026;
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

import java.util.HashMap;
import java.util.Scanner;

public class CountFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();

		System.out.println("Enter the elements");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		System.out.println(map);

	}
}
