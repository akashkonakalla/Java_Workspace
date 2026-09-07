package com.dsa;

import java.util.Scanner;

public class SlidingWindowOptimal {
	public static void main(String[] args) {
		System.out.println("Enter the k");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		int[] a = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		for (int i = k; i < a.length; i++) {
			sum = sum + a[i] - a[i - k];
			System.out.println(sum);
		}
	}
}
