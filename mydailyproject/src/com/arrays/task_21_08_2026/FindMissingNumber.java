package com.arrays.task_21_08_2026;

import java.util.Scanner;

/*
 * *Today's Assignment*
Java-
1.Find the Missing Number from 1 to N
A sorted array contains numbers from 1 to N, but one number is missing. Write a Java program to find the missing number.
Input: 1 2 4 5 6
Output: Missing Number = 3
2.Remove Duplicate Elements from an Array
Write a Java program to remove duplicate elements from an array and print only the unique elements.
Input: 1 2 3 2 4 1 5
Output: Unique Elements: 1 2 3 4 5
 */
public class FindMissingNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
	    System.out.println("Enter the elemenets of array from 1 to n");
	    int missing=-1;
	    for(int i=0;i<n;i++) {
	    	arr[i]=sc.nextInt();
	    	if(arr[i]!=i+1) {
	    		missing=i+1;
	    	}
	    }
	    System.out.println("The missing number is : "+missing);
	    
	}
}
