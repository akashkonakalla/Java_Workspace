package com.arrays.task_26_08_2026;

import java.util.Scanner;

/*
 * *Today's Assignment*

*Java*-

1.Write a Java program to perform the following operations on a 3 × 3 integer matrix:
Reverse the elements of every even-indexed row (rows 0 and 2).
Multiply every element of the odd-indexed row (row 1) by 2, except the middle element (1,1).
Square all the elements on the main (left) diagonal.
Display the modified matrix.
 Input
1 2 3
4 5 6
7 8 9
 Output
9   2   1
8  25   12
9   8  49
 */
public class MatrixProblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the square matrix size");
		int r=sc.nextInt();
		int[][] m= new int[r][r];
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
			if(i%2==0) {
				int left=0;
				int right=r-1;
				while(left<right) {
					int temp=m[i][left];
					m[i][left]=m[i][right];
					m[i][right]=temp;
					left++;
					right--;
					
				}
				
			}
			else {
				for(int j=0;j<r;j++) {
					if(i!=j)
					m[i][j]*=2;
				}
			}
			
		}
		for(int i=0;i<r;i++) {
			m[i][i]=Math.powExact(m[i][i], 2);
		}
		
		
		System.out.println("The final matrix is : ");
		for(int a[]: m) {
			for(int i:a) {
				System.out.print(i+ "\t");
			}
			System.out.println();
		}
		
	}
}
