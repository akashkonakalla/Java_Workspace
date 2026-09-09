package com.oops.task_08_09_2026;

import java.util.Scanner;

public class TestDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of the student");
		int marks = sc.nextInt();
		boolean exit = false;
		Student s;

		while (!exit) {
			System.out.println("\nEnter the choice to get the grade of the respective marks\n");
			System.out.println(
					"\n1.Engineering Student Grade \n2.Medical Student Grade \n3.Management Student Grade\n4.Exit\n");
			int n = sc.nextInt();
			switch (n) {
			case 1 -> {
				s = new EngineeringStudent();
				s.calculateGrade(marks);
			}
			case 2 -> {
				s = new MedicalStudent();
				s.calculateGrade(marks);
			}
			case 3 -> {
				s = new ManagementStudent();
				s.calculateGrade(marks);
			}
			case 4 -> {
				System.out.println("Thank you !");
				exit = true;
			}
			default -> {
				System.out.println("Invalid choice");
			}
			}
		}
	}
}
