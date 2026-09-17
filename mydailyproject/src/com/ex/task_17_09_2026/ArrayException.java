package com.ex.task_17_09_2026;

import java.util.Scanner;

public class ArrayException {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = s.nextInt();
		System.out.println("enter the elements of array");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		try {
			System.out.println("Enter the index to see the element");
			int index = s.nextInt();
			System.out.println("Element is : " + arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
