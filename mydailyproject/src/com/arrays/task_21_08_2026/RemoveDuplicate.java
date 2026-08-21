package com.arrays.task_21_08_2026;

import java.util.Scanner;

/*
 * 2.Remove Duplicate Elements from an Array
Write a Java program to remove duplicate elements from an array and print only the unique elements.
Input: 1 2 3 2 4 1 5
Output: Unique Elements: 1 2 3 4 5
 */
public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[0];
//		System.out.println("Array loc : "+arr);
		System.out.println("Enter the elemenets of array from 1 to n");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		RemoveDuplicate m = new RemoveDuplicate();
		m.removeDuplicate(arr);

	}

	private void removeDuplicate(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] != -1)
				System.out.println(arr[i]);
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = -1;
				}

			}

		}
	}
}
