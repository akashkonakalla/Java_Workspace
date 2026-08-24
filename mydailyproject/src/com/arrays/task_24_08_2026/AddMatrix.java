package com.arrays.task_24_08_2026;

import java.util.Scanner;

/*
 * *Today's Assignment*
Java-
1.Write a Java program to read a 3 × 3 matrix and find the sum of all its elements.
Input: 1 2 3
           4 5 6
           7 8 9
Output : Sum of all elements = 45
2.Write a Java program to read the elements of a 3 × 3 matrix using the Scanner class and display the matrix in the same format.

 */
public class AddMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows of the matrix");
		int r = sc.nextInt();
		System.out.println("Enter the columns of the matrix");
		int c = sc.nextInt();
		int sum=0;
		int[][] matrix = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.printf("Enter the values of matrix matrix[%d][%d] :",i,j);
				matrix[i][j]=sc.nextInt();
				sum+=matrix[i][j];
			}
		}
		System.out.println("The sum of the numbers in the matrix : "+sum);

	}
}
