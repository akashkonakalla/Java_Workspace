package com.dsa;

import java.util.Arrays;

public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,7,9,10};
		int left=0;
		int right=arr.length-1;
		System.out.println("Array before reverse is "+Arrays.toString(arr));
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		System.out.println("Array after reverse is "+Arrays.toString(arr));
	}
}
