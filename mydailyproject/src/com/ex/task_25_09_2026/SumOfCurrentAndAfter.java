package com.ex.task_25_09_2026;

import java.util.Arrays;
import java.util.Scanner;

/*
 * /*
 * *Today's Assignment*
Java-
1.Write a Java program to print Reverse of Element in the Given Array?
i/p: int arr[]={11,12,13,14,15,16}; 
o/p:	{11,21,31,41,51,61};

2.Write a Java Program to create  a new array where each element is the sum of the current and next element of the given array? 
i/p: int arr[]={10,20,30,40,50,60};
o/p:	{30,40,60,80,100,110};
 */

public class SumOfCurrentAndAfter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Array is : " + Arrays.toString(a));

		int copy[] = new int[n];
		for (int i = 0; i < n - 1; i++) {
			copy[i] = a[i] + a[i + 1];
		}
		copy[n-1]=a[n-1];

		System.out.println("New array is : " + Arrays.toString(copy));
	}
}
