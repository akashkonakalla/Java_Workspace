package com.loops.task_05_08_2026;

import java.util.Scanner;

/*
 * 
 2.Find the sum of digits of a number.

Input
Enter a number: 1234
Output
Sum of Digits: 10
 */
public class SumOfDigits {

	int sumofDigits(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}

		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find digits");
		int a = sc.nextInt();
		System.out.println("The number of sum of digits in a given number is : " + sumofDigits(a));
	}

}
