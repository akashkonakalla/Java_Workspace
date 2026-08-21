package com.arrays.task_21_08_2026;

import java.util.Scanner;

public class MissingElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elemenets of array from 1 to n");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		MissingElements m = new MissingElements();
		m.findMissing(arr);

	}

	private void findMissing(int[] arr) {
		int i = 0;
		int left = arr[0];
		int right = arr[1];
		while (i < arr.length - 1) {
			if (left != right - 1) {
				for (int j = left + 1; j < right; j++) {
					System.out.println("Missing numbers : " + j);
				}
			}
			i++;
			left = arr[i];
			right = arr[i + 1];

		}
	}
}
