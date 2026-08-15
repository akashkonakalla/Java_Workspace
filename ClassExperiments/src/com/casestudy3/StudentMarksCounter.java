package com.casestudy3;

import java.util.*;

public class StudentMarksCounter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] marks = new int[10];

		System.out.println("Enter the marks of 10 students:");

		int cAbove = 0, cBelow = 0;
		int high = Integer.MIN_VALUE;

		for (int i = 0; i < 10; i++) {

			System.out.print("Marks of student " + (i + 1) + ": ");
			marks[i] = sc.nextInt();

			if (marks[i] >= 40) {
				cAbove++;
			} else {
				cBelow++;
			}

			high = Math.max(high, marks[i]);
		}

		System.out.println("Students scored 40 or above: " + cAbove);
		System.out.println("Students scored below 40: " + cBelow);
		System.out.println("Highest mark: " + high);

		sc.close();
	}
}