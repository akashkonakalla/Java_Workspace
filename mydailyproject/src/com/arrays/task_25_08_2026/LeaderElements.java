package com.arrays.task_25_08_2026;

import java.util.Scanner;

/*
 * *Today's Assignment*
Java-
1.Write a Java program to find all the leader elements in an array of integers.
A leader element is an element that is greater than all the elements to its right. The last element of the array is always considered a leader.
Input: 16 17 4 3 5 2
Output: Leader Elements: 17 5 2

2.Write a Java program to read a 3 × 3 matrix using the Scanner class and find its transpose.
The transpose of a matrix is obtained by interchanging its rows and columns. In other words, the element at position (i, j) becomes (j, i).
Original Matrix:
1 2 3
4 5 6
7 8 9
Transpose Matrix:
1 4 7
2 5 8
3 6 9
 */
public class LeaderElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = i; j < n; j++) {
				if (arr[i] < arr[j]) {
					flag = false;
					break;
				}

			}
			if (flag)
				System.out.println("The Leader Elements is " + arr[i]);
		}
	}
}
