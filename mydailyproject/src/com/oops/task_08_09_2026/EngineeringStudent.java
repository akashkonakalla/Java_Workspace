package com.oops.task_08_09_2026;

public class EngineeringStudent extends Student {
	@Override
	void calculateGrade(int marks) {
		System.out.println("Engineering Student Grade");
		if (marks >= 90)
			System.out.println("Grade A1");
		else if (marks >= 80 && marks <= 89)
			System.out.println("Grade A2");
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
