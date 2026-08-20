package com.arrays.task_20_08_2026;

import java.util.Scanner;

public class LargestNumberMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = max(arr);
		System.out.println("The largest number in the array is : " + max);

	}

	private static int max(int[] arr) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}
}
