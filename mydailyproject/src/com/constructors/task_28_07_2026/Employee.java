package com.constructors.task_28_07_2026;
/*
 * Java
1.Create a class Employee with the following requirements:
Instance variables:
int empId
String empName
double salary
Create:
1.A parameterized constructor to initialize the object.
A copy constructor that copies the data from another Employee object.
2.Create the following methods:
display() – Displays employee details.
incrementSalary(double amount) – Increases the salary by the given amount.
In the main() method:
3.Create emp1 using the parameterized constructor.
.Create emp2 using the copy constructor by copying emp1.
Increase the salary of emp2 by 10000.
.Change the name of emp2 to "Ravi".
.Display both objects.
4.Verify that changes made to emp2 do not affect emp1.

Expected Output
Employee 1
ID     : 101
Name   : Krishna
Salary : 50000.0

Employee 2
ID     : 101
Name   : Ravi
Salary : 60000.0
 */

public class Employee {
	int empId;
	String empName;
	double salary;
	static int count=0;
	{
		count++;
	}
	
	
	public Employee() {
		
	}

	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public Employee(Employee e)
	{
		this.empId=e.empId;
		this.empName=e.empName;
		this .salary=e.salary;
		
	}
	
	

	void incrementSalary(double amount)
	{
		
		this.salary+=amount;
	}
	
	
	
	public Employee(Employee e, String empName) {
		this.empId=e.empId;
		this .salary=e.salary;
		this.empName = empName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 =new Employee(101,"Krishna",50000);
		e1.display();
		System.out.println("copying the details of the employee 1");
		Employee e2 =new Employee(e1);
		e2.display();
		System.out.println("Increasing the salary");
		e2.incrementSalary(10000);
		e2.display();
		System.out.println("updating the name of the employee to ravi");
		e2=new Employee (e2,"Ravi updated");
		e2.display();

	}
	
	void display() {
		System.out.println("Employee "+ count);
		System.out.println("ID        : "+empId);
		System.out.println("Name      : "+empName);
		System.out.println("Salary    : "+ salary);
		
	}

}
