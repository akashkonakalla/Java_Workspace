package com.arrays.task_20_08_2026;

import java.util.Scanner;

/*
 * *Today's Assignment*
Java - 
1. Find the largest element in an array. 
   Input: [12, 45, 7, 89, 23]
   Output:89 
2.  Find the smallest element in an array. 
   Input: [12, 45, 7, 89, 23] 
   Output: 7  
3.Count even and odd numbers. 
Input: [2, 5, 8, 9, 12]
Output:  Even = 3 
               Odd = 2

SQL- 
1.Find the nth highest salary (without using LIMIT ).
2.Display departments having more than one manager.
 */
public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array");
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
		}

		System.out.println("The largest number in the array is : " + max);

	}
}
