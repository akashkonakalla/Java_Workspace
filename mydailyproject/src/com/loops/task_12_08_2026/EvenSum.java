package com.loops.task_12_08_2026;

import java.util.Scanner;

/*
 * *Today's Assignment* 

 *Java* 

3.Find the sum of all even numbers from 1 to 100.

 */

public class EvenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print the sum of all even numbers");
		int n = sc.nextInt();
		sumOfEven(n);
	}

	private static void sumOfEven(int n) {
		// TODO Auto-generated method stub
		int sum=0;
//		for(int i=2;i<=n;i=i+2)
//		{
//			sum+=i;
//		}
		int i=2;
		while(i<=n) {
			
			sum+=i;
			i+=2;
			
		}
		System.out.println("The sum of even numbers from 1 to "+n +" is "+sum);
	}
}
