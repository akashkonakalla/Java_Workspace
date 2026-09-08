package com.oops.task_08_09_2026;
/*
 * *Today's Assignment* - 08/09/2026

*Java*-

1.Create a parent class Student with method calculateGrade().
Create child classes EngineeringStudent, MedicalStudent, ManagementStudent overriding it with their own grading criteria.
Accept marks from user.
Use a parent class reference to hold child objects.
Demonstrate runtime polymorphism by calling calculateGrade().

*PL/SQL*-
1. Create a "BEFORE INSERT" trigger on the "employee table.
When a new employee is about to insert:
>  If the salary is less than 15000, automatically change the salary to 15000.
› otherwise, keep the salary as entered.
 */

public class Student {
     	void calculateGrade(int marks) {
     		System.out.println("Calculating Grade");
     	}
}
