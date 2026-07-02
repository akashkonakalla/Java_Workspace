package com.task24_06_2026;


/*Java Task:

Instance Block and Static Block

Problem Statement:
1.Create a class named Employee that demonstrates the use of 2 Static Variables, 2 Instance Variables, a Static Block, and an Instance Block.

Requirements:

1.Create a class Employee.
2.Declare 2 static variables:
companyName
location
3.Declare 2 instance variables:
employeeName
salary
4.Use a static block to initialize the static variables.
5.Create two objects of the Employee class.
6.Assign different values to the instance variables using object references.
7.Display the details of both employees.
**/



public class Employee {
	//2.Declare 2 static variables:
	static String companyName;
	static String location;
	
	//3.Declare 2 instance variables:
		String employeeName;
		int salary;
//		4.Use a static block to initialize the static variables.
		
	static {
		System.out.println("*****Static block*****");
		companyName="Vcube consultancy";
		location="KPHB";
	}
	
	{
		System.out.println("*****Instance block*****");
	}
	
	public static void main(String[] args) {

		System.out.println("Welcome to employee class\n");
		Employee ee=new Employee();
//		7.Display the details of both employees.
		ee.display();
		
	}
	
	void display() {
		
//		5.Create two objects of the Employee class.
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		
//		6.Assign different values to the instance variables using object references.
		e1.employeeName="Employee 1";
		e1.salary=700000;
		
		e2.employeeName="Employee 2";
		e2.salary=1000000;
		
//		String companyName="Hello";

		System.out.println("\nDetails of employee 1");
		System.out.println("Company name : "+companyName);
		System.out.println("Location : "+location);
		System.out.println("Name : "+e1.employeeName);
		System.out.println("Salary : "+e1.salary);
		
		System.out.println("\nDetails of employee 2");
		System.out.println("Company name : "+ Employee.companyName);
		System.out.println("Location : "+location);
		System.out.println("Name : "+e2.employeeName);
		System.out.println("Salary : "+e2.salary);
	}

}
