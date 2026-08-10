package com.loops;

import java.util.Scanner;

public class FibonacciEven {
	public static void main(String[] args) {
		System.out.println("enter how many even placed fibonacci you want");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for (int i = 1; i < n * 2; i++) {
			int sum = a + b;
			a = b;
			b = sum;
			if (i % 2 == 1) {
				System.out.print(sum + " ");
			}

		}
	}
}
