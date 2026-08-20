package com.arrays.task_20_08_2026;
import java.util.Scanner;

public class SmallestNumberMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int min = min(arr);
		System.out.println("The Smallest number in the array is : " + min);

	}

	private static int min(int[] arr) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
		return min;
	}
}
