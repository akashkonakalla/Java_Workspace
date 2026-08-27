package com.arrays.task_27_08_2026;

import java.util.Arrays;
import java.util.Scanner;

//Make the rows or columns as zero if the element is 0
public class MatrixZeroRows {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size of the matrix");
		int r=sc.nextInt();
		System.out.println("Enter the column size of the matrix");
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		System.out.println("Enter the elemetns in the matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Original Matrix is : "+Arrays.deepToString(arr));
		for(int i[]:arr) {
			for(int n:i) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
		int[][] n1=new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				n1[i][j]=arr[i][j];
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j]==0) {
					for(int k=0;k<c;k++) {
						n1[i][k]=0;
					}
					for(int l=0;l<r;l++) {
						n1[l][j]=0;
					}
					
				}
			}
		}
		System.out.println("New Matrix is : "+Arrays.deepToString(n1));
		for(int i[]:n1) {
			for(int n:i) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
		
	}
}
