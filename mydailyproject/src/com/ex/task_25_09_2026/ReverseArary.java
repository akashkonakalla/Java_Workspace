package com.ex.task_25_09_2026;

import java.util.Arrays;
import java.util.Scanner;

/*
 * *Today's Assignment*
Java-
1.Write a Java program to print Reverse of Element in the Given Array?
i/p: int arr[]={11,12,13,14,15,16}; 
o/p:	{11,21,31,41,51,61};

2.Write a Java Program to create  a new array where each element is the sum of the current and next element of the given array? 
i/p: int arr[]={10,20,30,40,50,60};
o/p:	{30,40,60,80,100,110};
 */
public class ReverseArary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements in the array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array before reversing the elements : " + Arrays.toString(a));
		int left = 0;
		int right = n - 1;
		while (left < right) {
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
		System.out.println("Array after reversing the elements : " + Arrays.toString(a));
	}
}
