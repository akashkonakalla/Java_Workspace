package com.oops.encapsulation.task_28_08_2026;

import java.util.Scanner;

public class TestDriver extends Employee{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of Employee");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of the Employee");
		String name=sc.nextLine();
		System.out.println("Enter the Salary of the Employee");
		double salary=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the password of the Employee");
		String password=sc.nextLine();
	
		
		TestDriver t1=new TestDriver();
		t1.setId(id);
		t1.setName(name);
		t1.setPassword(password);
		t1.setSalary(salary);
		
		System.out.println("Enter the id of Employee is : "+t1.getId());
		System.out.println("Enter the name of Employee is : "+t1.getName());
		System.out.println("Enter the salary of Employee is : "+t1.getSalary());
		System.out.println("Enter the password of Employee is : "+t1.getPassword());
		
	}
}
