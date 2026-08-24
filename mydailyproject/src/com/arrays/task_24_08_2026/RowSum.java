package com.arrays.task_24_08_2026;

import java.util.Scanner;

//Calculate and print the Row sum for each row

public class RowSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows of the matrix");
		int r = sc.nextInt();
		System.out.println("Enter the columns of the matrix");
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.printf("Enter the values of matrix matrix[%d][%d] :", i, j);
				matrix[i][j] = sc.nextInt();
				
			}
		}
		
		for (int i = 0; i < r; i++) {
			int rowsum = 0;
			for (int j = 0; j < c; j++) {
				rowsum+=matrix[i][j];
				
			}

			System.out.printf("The sum of the numbers in the row %d matrix : %d \n",i+1, rowsum);
			
		}
	}
}
