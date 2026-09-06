package com.dsa;

import java.util.Scanner;

// Sliding Window technique
// Find the sum of all subarrays of length k

public class SlidingWindowBruteForce{
	public static void main(String[] args) {
		System.out.println("Enter the k");
		Scanner sc=new Scanner (System.in);
		int k=sc.nextInt();
		
		int[] a = {1,2,3,4,5};
        
		for(int i=0;i<=a.length-k;i++) {
		    int sum=0;
			for(int j=0;j<k;j++) {
				sum+=a[i+j];
			}
			System.out.println(sum);
		}
	}
}
