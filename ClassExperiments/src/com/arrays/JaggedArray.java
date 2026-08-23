package com.arrays;

import java.util.Scanner;

public class JaggedArray {
public static void main(String[] args) {
	System.out.println("Enter the number of rows");
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	int[][] ar= new int[r][r];
	for(int[] i: ar) {
		for(int n: i) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
}
}
