package com.arrays.task_25_08_2026;

import java.util.Arrays;
import java.util.Scanner;

/*
 * *Today's Assignment*
Java-
1.Write a Java program to find all the leader elements in an array of integers.
A leader element is an element that is greater than all the elements to its right. The last element of the array is always considered a leader.
Input: 16 17 4 3 5 2
Output: Leader Elements: 17 5 2

2.Write a Java program to read a 3 × 3 matrix using the Scanner class and find its transpose.
The transpose of a matrix is obtained by interchanging its rows and columns. In other words, the element at position (i, j) becomes (j, i).
Original Matrix:
1 2 3
4 5 6
7 8 9
Transpose Matrix:
1 4 7
2 5 8
3 6 9
 */
public class Transpose {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size of matrix");
		int r=sc.nextInt();
		System.out.println("Enter the column size of matrix");
		int c=sc.nextInt();
		int[][] m=new int[r][c];
		System.out.println("Enter the elements in the matrix: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				m[i][j]=sc.nextInt();
			}
		}
		System.out.println("Original Matrix  : ");
		for(int[] i:m) {
			for(int n:i) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
		int[][] transpose=new int[c][r];
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				transpose[i][j]=m[j][i];
			}
		}
		System.out.println("Matrix after Transpose : ");
		for(int[] i:transpose) {
			for(int n:i) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}
}
