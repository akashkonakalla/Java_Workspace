package com.dsa;

import java.util.Scanner;

public class BinarySearchIndex {
	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the numbers");
		int[] arr;
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target to find range");
		int target = sc.nextInt();
		binarySearch(target, arr);
	}

	static void binarySearch(int target, int arr[]) {

		int len = arr.length;
		int left = 0;
		int right = len - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (target == arr[mid]) {
				int st = mid;
				int end = mid;
				while (st > 0 && arr[st - 1] == target) {
					st--;
				}
				while (end < len - 1 && arr[end + 1] == target) {
					end++;
				}
				System.out.println("First index: " + st);
				System.out.println("Last index: " + end);

				System.out.println("All indices:");

				for (int i = st; i <= end; i++) {
					System.out.print(i + " ");
				}

				return;

			} else if (target > arr[mid]) {
				left = mid + 1;
			} else
				right = mid - 1;
		}
	}

}
