package com.ex.task_21_09_2026;

import java.util.Scanner;

public class ContinuesException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Enter the name");
				String name = sc.nextLine();
				break;
			} catch (Exception e) {
				System.out.println("RE-TRY enter the name");
			}
		}

		while (true) {
			try {
				System.out.println("Enter the age");
				int age = sc.nextInt();
				break;

			} catch (Exception e) {
				System.out.println("RE-TRY enter the age");
				sc.nextLine();

			}
		}

		while (true) {
			try {
				System.out.println("Enter the total marks");
				int tot_marks = sc.nextInt();
				System.out.println("Enter the number of subjects");
				int n = sc.nextInt();
				System.out.println("The average marks : " + (tot_marks / n));
				break;

			} catch (ArithmeticException e) {
				System.out.println("RE-TRY enter the number of subjects again");
				sc.nextLine();

			}
		}

		while (true) {
			try {

				int[] arr = new int[] { 1, 2, 3, 4, 5 };
				System.out.println("Enter the index to access from 0 to 4");
				int ind = sc.nextInt();
				System.out.println("Element at index = " + arr[ind]);
				break;

			} catch (Exception e) {
				System.out.println("RE-TRY enter the index");
				sc.nextLine();

			}
		}

	}

}
