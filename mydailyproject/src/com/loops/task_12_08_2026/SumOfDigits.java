package com.loops.task_12_08_2026;

import java.util.Scanner;

/*
 * *Today's Assignment* 

 *Java* 

2.Find the sum of digits of a given number.
Input: 168=>1+6+8
Output: 15

 */

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check sum of digits");
		int n = sc.nextInt();
		sumOfDigits(n);
	}

	private static void sumOfDigits(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		System.out.println("Sum of the digits is " + sum);
	}
}
