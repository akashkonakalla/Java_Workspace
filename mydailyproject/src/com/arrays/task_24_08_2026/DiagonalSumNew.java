package com.arrays.task_24_08_2026;

//Sum of the Diagonal numbers

import java.util.Scanner;

public class DiagonalSumNew {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows of the matrix");
		int r = sc.nextInt();
		System.out.println("Enter the columns of the matrix");
		int c = sc.nextInt();
		int sum = 0;
		int[][] matrix = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.printf("Enter the values of matrix matrix[%d][%d] :", i, j);
				matrix[i][j] = sc.nextInt();
			}
		}
		int leftSum = 0;
		int rightSum = 0;

		for (int i = 0; i < r; i++) {
			leftSum += matrix[i][i];
			rightSum += matrix[i][r - 1 - i];
		}

		System.out.println("Sum of left diagonal = " + leftSum);
		System.out.println("Sum of right diagonal = " + rightSum);
		System.out.println("Total sum of left + right diagonal = "+(leftSum+rightSum));

	}
}
