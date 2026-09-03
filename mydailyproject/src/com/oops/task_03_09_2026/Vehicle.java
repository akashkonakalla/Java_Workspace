package com.oops.task_03_09_2026;

/*
 * *Today's Assignment*

Java-
1.Create a Java program using inheritance with a parent class Vehicle and a child class Car.
Requirements:
Vehicle should have a variable speed = 50 and a method display().
Car should have its own variable speed = 100 and override the display() method.
Create a Car object using a parent-class reference.
Access the speed variable and call the display() method.
Predict the output before running the program.
Explain why the variable and method behave differently. 

Sql-
1.Write a stored procedure that accepts empno and salary increment percentage as IN parameters. The procedure should calculate the revised salary by applying the given percentage increase the employee's existing salary and display the employee name, original salary, and revised salary.
 */

public class Vehicle {
	
	public int speed = 50;

	public void display() {
		System.out.println("Vehicle class called");
	}
}
