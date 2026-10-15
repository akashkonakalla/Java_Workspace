package com.collections.task_15_10_2026;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Today’s Assignment 

Java-

1.Create two ArrayList<String> objects and store different fruit names in both lists.
Delete one fruit, check whether "Apple" is available, keep only the common fruits in both lists, and print the final result.

2.Create an ArrayList<Integer> with multiple integer values.
Find and print the largest and second largest elements in the list.
Input: [25, 80, 45, 90, 60, 75, 90, 50]
Output: Largest Element: 90
Second Largest Element: 80
 */

public class FruitsArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> fruit1 = new ArrayList<>();

		fruit1.add("Apple");
		fruit1.add("Banana");
		fruit1.add("Mango");
		fruit1.add("Orange");
		fruit1.add("Grapes");

		List<String> fruit2 = new ArrayList<>();

		fruit2.add("Banana");
		fruit2.add("Mango");
		fruit2.add("Pineapple");
		fruit2.add("Apple");
		fruit2.add("Watermelon");

		System.out.println("All fruits in 1 : " + fruit1);
		System.out.println("All fruits in 2 : " + fruit2);

		fruit1.remove("Orange");

		System.out.println("All fruits in 1 after removing Orange : " + fruit1);
		System.out.println("Fruit1 contains apple or not : " + fruit1.contains("Apple"));
		System.out.println("Fruit2 contains apple or not : " + fruit2.contains("Apple"));

		fruit1.retainAll(fruit2);
		fruit2.retainAll(fruit1);

		System.out.println("All fruits common in 1 : " + fruit1);
		System.out.println("All fruits common in 2 : " + fruit2);

	}
}
