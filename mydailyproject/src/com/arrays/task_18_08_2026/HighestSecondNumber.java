package com.arrays.task_18_08_2026;

import java.util.Arrays;
import java.util.Scanner;

public class HighestSecondNumber {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int temp=n;
	int max=Integer.MIN_VALUE;
	int count=0;
	while(n>0) {
		n=n/10;
		count++;
	}
	int i=0;
	int arr[] =new int [count];
	while(temp>0) {
		int r=temp%10;
		arr[i++]=r;
		temp=temp/10;
	}
	Arrays.sort(arr);
	System.out.println("The second largest number is : "+arr[arr.length-2]);
}
}
