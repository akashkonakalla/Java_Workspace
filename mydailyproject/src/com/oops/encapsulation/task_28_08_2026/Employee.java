package com.oops.encapsulation.task_28_08_2026;

/*
 * *Today's Assignment*

*Java*-

1.Create an encapsulated class Employee with private fields: id, name, salary, password.
Requirements:
1. Make all fields private (Data Hiding).
2. Create public setters and getters.
3. Access and modify the data

*Sql*-
1. Display employees whose salary is lower than the salary of the next employee in their department.

2.Display the employees whose salary is greater than the previous employee's salary but less than the next employee's salary, based on hire date asc within the department.
 */
public class Employee {
	private int id;
	private String name;
	private double salary;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
