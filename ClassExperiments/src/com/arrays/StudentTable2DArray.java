package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentTable2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of columns in a student table ");
		int c = sc.nextInt();
		System.out.println("Enter the number of students");
		int r = sc.nextInt() + 1;
		sc.nextLine();
		String[][] students = new String[r][c];
		for (int i = 0; i < c; i++) {
			System.out.printf("Enter the column name %d of student table : ", i + 1);
			students[0][i] = sc.nextLine();

		}
//		System.out.println(Arrays.deepToString(students));
//		System.out.printf("Enter the values of student %d:"+Arrays.toString(students[0]));
		for (int i = 1; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.printf("\nEnter the %s of student %d: %n", students[0][j], i);
				students[i][j] = sc.nextLine();

			}
		}

		do {

			System.out.println("Enter the student number to know the details and enter 0 to exit");
			int n = sc.nextInt();
			if (n == 0) {
				System.out.println("Thank you, exiting");
				break;
			}
			if (n < r) {
				System.out.println(Arrays.toString(students[0]));
				System.out.println(Arrays.toString(students[n]));
			} else {
				System.out.println("Wrong Student number");
			}

		} while (true);

		System.out.println("\nTotal Students table\n");
		for (String[] i : students) {
			for (String s : i) {
				System.out.print(s + "\t");
			}
			System.out.println();
		}
	}

}
