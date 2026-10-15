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

public class FindLargest {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int high1 = Integer.MIN_VALUE, high2 = Integer.MIN_VALUE;

		try {
			System.out.println("Enter the elements that you want to insert or enter any character to stop inserting");
			while (true) {
				list.add(sc.nextInt());
			}

		} catch (Exception e) {
			for (int i : list) {
				if (i > high1) {
					high2 = high1;
					high1 = i;
				} else if (i > high2 && i != high1) {
					high2 = i;
				}
			}

		}

		System.out.println("First high is : " + high1);

		System.out.println("Second high is : " + high2);
	}
}
