package com.arrays.task_28_09_2026;

import java.util.Scanner;

/*
 * *Today Assignment*
*JAVA*                
                                  
1.Write a Java program to print all elements of a 2D array in spiral order.
Input:
1  2  3
4  5  6
7  8  9
Output:
1 2 3 6 9 8 7 4 5
2. 4 × 4 Spiral Matrix
Write a Java program to print the elements of the following matrix in clockwise spiral order.
1   2   3   4
5   6   7   8
9  10  11  12
13 14  15  16
Expected Output:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */

public class SpiralArrayPrinting {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 2D array or matrix (n x n)");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int top = 0;
		int bottom = n - 1;
		int left = 0;
		int right = n - 1;

		while (top <= bottom && left <= right) {

//			1.left - right elements
			for (int i = left; i <= right; i++) {
				System.out.print(arr[top][i] + " ");
			}
			top++;

//			2.top - bottom elements
			for (int i = top; i <= bottom; i++) {
				System.out.print(arr[i][right] + " ");
			}
			right--;

//			3.right - left elements
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					System.out.print(arr[bottom][i] + " ");
				}
				bottom--;
			}

//			4.bottom - top elements
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(arr[i][left] + " ");
				}
				left++;
			}

		}

	}
}
