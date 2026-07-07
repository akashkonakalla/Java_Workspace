package com.task_07_07_2026;
/*
Java Assignment – Primitive Data Types
Question:

1.Write a Java program to store the following employee details in appropriate variables:

Employee ID
Employee Grade
Employee Salary
Permanent Employee Status
Employee Experience (in years)
Working Days
Phone Number
Bonus Amount

Print all the employee details in a clear and readable format.

Mysql
1.Customer and Orders
Create two tables:
Customer with Customer ID, 
Customer Name, and City.
Orders with 
Order ID, 
Order Name, 
Order Amount, and Customer ID.

Requirements:
1.Use appropriate Primary Keys.
2.Create a Foreign Key relationship between the tables.
3.Insert 5 records into each table.
Display all orders with customer id
*/





public class Employee {
	
	
	int EmployeeID;
	char EmployeeGrade;
	double EmployeeSalary;
	boolean PermanentEmployeeStatus;
	int EmployeeExperience;
	int WorkingDays;
	long PhoneNumber=9100893023L;
	double BonusAmount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
//		System.out.println("Employee Id : "+ e.EmployeeID);
		System.out.println("Employee Id : " + (e.EmployeeID = 123));
//		e.EmployeeGrade='A';
//		System.out.println("EmployeeGrade : "+ e.EmployeeGrade);
		System.out.println("Employee Grade : " + (e.EmployeeGrade = 'A'));
		System.out.println("EmployeeSalary : "+ e.EmployeeSalary);
		System.out.println("PermanentEmployeeStatus : "+ e.PermanentEmployeeStatus);
		System.out.println("EmployeeExperience : "+ e.EmployeeExperience);
		System.out.println("WorkingDays : "+ e.WorkingDays);
		System.out.println("PhoneNumber : "+ e.PhoneNumber);
		System.out.println("BonusAmount : "+ e.BonusAmount);
		

	}

}
