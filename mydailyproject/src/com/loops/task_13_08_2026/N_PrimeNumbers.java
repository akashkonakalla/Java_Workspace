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

public class N_PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many prime numbers do you want");
		int n = sc.nextInt();
		nPrime(n);

	}

	private static void nPrime(int n) {
		// TODO Auto-generated method stub
		int number = 2;
		while (n > 0) {
			boolean prime = true;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					prime = false;
					break;
				}
			}

			if (prime == true) {
				System.out.println(number + " ");
				n--;
			}
			number++;

		}
	}
}
