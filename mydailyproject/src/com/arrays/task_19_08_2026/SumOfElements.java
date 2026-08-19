package com.arrays.task_19_08_2026;

import java.util.Scanner;

/*
 * *Today's Assignment*

Java-
1. Read and print all elements of an array.
Input: 10 20 30 40 50
Output: 10 20 30 40 50
2.Find the sum of all elements in an array.
Input: [1, 2, 3, 4, 5]
Output: 15
3.Find the average of array elements.
Input: [10, 20, 30, 40]
Output: 25.0

SQL- 
1.List employees whose salary grade is 4 or 5.
2.Display employees whose manager belongs to department 10.

 */
public class SumOfElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i : arr)
			sum += i;

		System.out.println("The sum of all elements : " + sum);

	}
}
