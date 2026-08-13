package com.loops.task_13_08_2026;
/*
 * *Today's Assignment*
Java-
1.Find the Largest Digit in a Number
Input : 983742
Output : Largest Digit = 9 
2.Print the First N Prime Numbers
Input : 10
Output : 2 3 5 7 11 13 17 19 23 29

SQL- 
1.List the empno, ename, loc, sal, dname, loc of all the employees belonging to King's department.

2.List the empno, ename, loc, dname of all the departments 10 and 20.
 */

import java.util.Scanner;

public class LargestDigit {

	static void maxDigit(long n) {
		int max = 0;
		while (n > 0) {
			int r = (int) (n % 10);
			max = Math.max(max, r);
			n = n / 10;
		}
		System.out.println("The maximum digit is : " + max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long n = sc.nextInt();
		maxDigit(n);
	}
}
