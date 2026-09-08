package com.oops.task_08_09_2026;

public class ManagementStudent extends Student {

	@Override
	void calculateGrade(int marks) {

		System.out.println("Management Student Grade");
		if (marks >= 70)
			System.out.println("Grade A");
		else if (marks >= 60 && marks <= 69)
			System.out.println("Grade B");
		else if (marks >= 50 && marks <= 59)
			System.out.println("Grade C");
		else if (marks >= 40 && marks <= 49)
			System.out.println("Grade D");
		else
			System.out.println("Grade F");
	}
}
