package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SeperateNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.printf("Enter the %d values of the array\n", n);
		int p = 0, neg = 0, z = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == 0)
				z++;
			else if (arr[i] < 0)
				neg++;
			else
				p++;
		}
		int[] positive = new int[p];
		int[] negative = new int[neg];
		int[] zero = new int[z];

		int in = 0;
		int ip = 0;
		int iz = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0)
				zero[iz++] = arr[i];
			else if (arr[i] < 0)
				negative[in++] = arr[i];
			else
				positive[ip++] = arr[i];
		}

		System.out.println("\nThe Positive numbers are : " + Arrays.toString(positive));
		System.out.println("The count of positive numbers : " + p);

		System.out.println("\nThe Negative numbers are : " + Arrays.toString(negative));
		System.out.println("The count of negative numbers : " + neg);

		System.out.println("\nThe Zero's are : " + Arrays.toString(zero));
		System.out.println("The count of zero's are : " + z);
	}
}
