package com.dsa;
//Print the array using the 2 pointers
public class TwoPointers1 {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,6};
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
					System.out.println(arr[i]+" "+arr[j]);	
		}
	}

}
