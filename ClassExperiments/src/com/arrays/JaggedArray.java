package com.arrays;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int[][] ar = new int[3][];

		ar[0] = new int[4];
		ar[1] = new int[3];
		ar[2] = new int[5];

		for (int[] i : ar) {
			for (int n : i) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}
}
