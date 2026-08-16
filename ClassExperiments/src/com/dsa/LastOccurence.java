package com.dsa;

public class LastOccurence {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 2, 4, 6, 8, 8, 10 };
		int target = 2;

		System.out.println("Array:");
		for (int x : arr) {
			System.out.print(x + " ");
		}

		System.out.println("\n\nTarget = " + target);

		System.out.println("First occurrence       : " + firstOccurrence(arr, target));
	}

	static int lastOccurrence(int[] arr, int target) {
		int low = 0, high = arr.length - 1;
		int ans = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == target) {
				ans = mid;
				low = mid + 1; // search right
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return ans;
	}
}
