package com.operators.task_29_07_2026;

import java.util.Scanner;

/*
 * 2.Assign a grade based on marks using nested ternary operators.
Marks >= 90 → A
Marks >= 75 → B
Marks >= 60 → C
Marks >= 40 → D
Otherwise → Fail
 */
public class Grading {

	void TernaryGrading(int m)
	{
		String s=(m>=90)?"A":(m>=75 ? "B":(m>=60 ? "C":(m>=40 ? "D": "Fail")));
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the marks");
		int marks=sc.nextInt();
		Grading g=new Grading();
		g.TernaryGrading(marks);
		

	}

}
