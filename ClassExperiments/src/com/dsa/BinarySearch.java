package com.dsa;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the values of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target to check");
		int target = sc.nextInt();
		binarySearch(arr, target);
	}

	private static void binarySearch(int[] arr, int target) {
		int n=arr.length;
		int left=0;
		int right=n-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				System.out.println("Target "+target+" is found at index : "+ mid);
				return;
			}
			else if( arr[mid]>target) {
				right=mid-1;
			}
			else
				left=mid+1;
		}
		System.out.println("The given value is not in the array");
		
		
	}
}
