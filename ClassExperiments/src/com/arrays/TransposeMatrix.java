package com.arrays;

import java.util.Arrays;

public class TransposeMatrix {
	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Matrix before Transpose");
		for (int i[] : m) {
			for (int n : i) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = i; j < m[i].length; j++) {
				int temp = m[i][j];
				m[i][j] = m[j][i];
				m[j][i] = temp;
			}
		}
		System.out.println("===============================================");
		System.out.println("Matrix After Transpose");
		for (int i[] : m) {
			for (int n : i) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
