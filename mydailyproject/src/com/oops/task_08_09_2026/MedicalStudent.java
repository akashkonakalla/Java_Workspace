package com.oops.task_08_09_2026;

public class MedicalStudent extends Student {

	@Override
	void calculateGrade(int marks) {

		System.out.println("Medical Student Grade");
		if (marks >= 80)
			System.out.println("Grade A");
		else if (marks >= 70 && marks <= 79)
			System.out.println("Grade B");
		else if (marks >= 60 && marks <= 69)
			System.out.println("Grade C");
		else if (marks >= 50 && marks <= 59)
			System.out.println("Grade D");
		else if (marks >= 40 && marks <= 49)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}
}
