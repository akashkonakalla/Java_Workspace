package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	System.out.println("Enter the number or elements");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr= new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Original array: "+Arrays.toString(arr));
    int left=0;
    int right=n-1;
    while(left<right) {
    	int temp=arr[left];
    	arr[left]=arr[right];
    	arr[right]=arr[temp];
    	left++;
    	right--;
    }
    System.out.println("Array after reverse : "+Arrays.toString(arr));
}
}
