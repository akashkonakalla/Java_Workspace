package com.loops.task_12_08_2026;

import java.util.Scanner;

/*
 * *Today's Assignment* 

 *Java* 

1.write a java program to print the perfect number between the range 1 to 100.

 */

public class PerfectOrNot {

	static boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum += i;
		}
		if (sum == n)
			return true;

		return false;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print all perfect numbers from 1 to that number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (isPerfect(i))
				System.out.print(i + " ");
		}
	}
}
