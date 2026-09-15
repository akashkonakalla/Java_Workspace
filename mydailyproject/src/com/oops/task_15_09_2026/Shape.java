package com.oops.task_15_09_2026;
/*
 * Today's Assignment
Java-
1.Create an abstract class Shape.
Add an abstract method area().
Create Circle, Rectangle, and Triangle subclasses.
Override area() in each class.

PL/SQL-
1.Write a Trigger that able to stop the insertion of employees into 
any department if the count of users are 10 and 
display the message as "employee limit reached 
in department" use SIGNAL SQLSTATE for message
 */
public abstract class Shape {
	public abstract void area();
}
