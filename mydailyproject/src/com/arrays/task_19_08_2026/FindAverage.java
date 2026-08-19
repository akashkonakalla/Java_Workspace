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
public class FindAverage {
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		System.out.println("Enter the elements in array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		double avg = (double) sum / n;
		System.out.println("The average of array elements is " + avg);

	}
}
