package com.Methods.task_15_07_2026;
import java.util.Scanner;
/*
  Today Task
Java
1.Student Result Calculator
Create a Java program to calculate and display a student's result using methods that accept arguments but do not return any value.
Requirements:
1.Create a class named StudentResult.
2.Create the following methods:
displayStudent(String name)
calculateTotal(int m1, int m2, int m3)
calculateAverage(int m1, int m2, int m3)
3.Take input from scanner class And display details
 */

public class StudentResult {

	void displayStudent(String name) { 
		System.out.println("Student name : "+name);
	}
	void calculateTotal(int m1, int m2, int m3) {
		System.out.println("Total : "+ (m1+m2+m3));
	}
	void calculateAverage(int m1, int m2, int m3) {
		System.out.println("Average : "+(m1+m2+m3)/3.0);
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter student name");
		String name=sc.nextLine();
		System.out.println("Enter 3 marks");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		StudentResult s=new StudentResult();
		s.displayStudent(name);
		s.calculateTotal(m1, m2, m3);
		s.calculateAverage(m1, m2, m3);
				
		
	}

}
