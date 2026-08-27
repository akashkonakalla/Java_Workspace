package com.arrays.task_27_08_2026;

import java.util.Scanner;

/*
 * *Today's Assignment*
Java-
1.Write a Java program to read an N × N integer matrix from the user. Replace every even number in the matrix with 0 and every odd number with -1. Display the modified matrix.
Input
1 2 3
4 5 6
7 8 9
Output
-1  0  -1
0  -1   0
-1  0  -1
 */
public class ReplaceMatrixOddEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows size of matrix");
		int r=sc.nextInt();
		System.out.println("Enter the columns size of matrix");
		int c=sc.nextInt();
		int[][] m= new int[r][c];
		System.out.println("Enter the matrix elements");
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++) {
				m[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Original matrix is : ");
		for(int a[]: m) {
			for(int i:a) {
				System.out.print(i+ "\t");
			}
			System.out.println();
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(m[i][j]%2==0) {
					m[i][j]=0;
				}
				else
				{
					m[i][j]=-1;
				}
			}
		}
		System.out.println("The matrix after replacing odd and even numbers");
		for(int a[]: m) {
			for(int i:a) {
				System.out.print(i+ "\t");
			}
			System.out.println();
		}
	}
}
