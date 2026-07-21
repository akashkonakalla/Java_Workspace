package com.Methods.task_21_07_2026;

import java.util.Scanner;

/*
 * Java Assignment – Methods with Scanner
Task: Salary Slip Generator
Create a Java program that reads the employee name and basic salary using the Scanner class.
Create a method:
void salarySlip(String employeeName, double basicSalary)
Inside the method, calculate and display the following:
HRA = 20% of the Basic Salary
DA = 10% of the Basic Salary
Gross Salary = Basic Salary + HRA + DA

Sample Input:
Enter Employee Name: Krishna
Enter Basic Salary: 30000

Expected Output:
Employee Name : Krishna
Basic Salary  : 30000.0
HRA (20%)     : 6000.0
DA (10%)      : 3000.0
Gross Salary  : 39000.0

Formula
HRA = Basic Salary × 20 / 100
DA = Basic Salary × 10 / 100
Gross Salary = Basic Salary + HRA + DA
 */

public class SalarySlip {
	
	 static void salarySlip(String employeeName, double basicSalary) {
		
		double hra = 0.2*basicSalary;
		double da=0.1*basicSalary;
		double gross=hra+da+basicSalary;
		System.out.println("Employee name : "+ employeeName);
		System.out.println("Basic Salary : "+basicSalary);
		System.out.println("Hra : "+ hra);
		System.out.println("DA : "+ (da));
		System.out.println("Gross : "+gross);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter basic salary : ");
		double basic = sc .nextDouble();
		sc.nextLine();
		
		System.out.println("enter employee name : ");
		String name =sc.nextLine();
		
		salarySlip(name , basic);
		
		sc.close();
	}

}
