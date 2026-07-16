package com.Methods_returnType_16_07_2026;

import java.util.Scanner;

/*
 Today Task
Java
1.Loan Interest
Scenario: A bank wants to calculate the simple interest for a customer.
2.Create a method calculateInterest(double principal, double rate, int time) that returns the simple interest.
3.Read the principal amount, rate of interest, and time using Scanner.
4.Call the method and display the simple interest.
5.Formula Used:
Simple Interest = (Principal × Rate × Time) / 100
 */


public class Bank {
	
	static Scanner sc=new Scanner(System.in);
	
	double calculateInterest(double principal, double rate, int time) {
		
		double SimpleInterest = (principal * rate  * time) / 100.0;
		
		return SimpleInterest;
	}
	
	 void main(String[] args) {
	 System.out.println("enter principle, rate, and time");
	 double p=sc.nextDouble();
	 double r=sc.nextDouble();
	 int t=(int)sc.nextDouble();
	 
	 System.out.println("Simple Interest : "+calculateInterest(p, r, t)); 
		
		

	}

}
