package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddArrays {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] a1= {1,2,3};
	int[] a2= {4,5,6,7,8};
	int max=Math.max(a1.length, a2.length);
	int[] a3= new int[max];
	for(int i=0;i<max;i++) {
		if(i>=a1.length) {
			a3[i]=a2[i];
		}
		else if(i>=a2.length) {
			a3[i]=a1[i];
		}
		else
			a3[i]=a2[i]+a1[i];
	}
	System.out.println("The Sum of Arrays is : "+ Arrays.toString(a3));
}
}
