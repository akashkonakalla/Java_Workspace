package com.arrays.task_24_08_2026;

//Sum of the Diagonal numbers


import java.util.Scanner;


public class DiagonalSum {
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
				if(i==j)
				sum += matrix[i][j];
			}
		}
		System.out.println("The sum of the Diagonal numbers in the matrix : " + sum);

	}
}
