package com.ex.task_18_09_2026;

import java.util.Scanner;

/*

*Today’s Assignment*:-

*Java: -*
1.Create an ATM program with separate try-catch blocks for:
Withdraw amount → handle ArithmeticException
Convert entered amount from String to double → handle NumberFormatException
Access transaction history using an array → handle ArrayIndexOutOfBoundsException
Display account details → handle possible NullPointerException
Requirement: If one operation fails, the remaining operations should continue.

SQL-
1. Write an SQL Query to Display the Managers (mgr) and Number of Employees Working Under Them.

*/

public class ATM {

	static double balance = 2000;
	static double[] stm=new double[5];
	
	
	static void withdraw(double amt) {
		System.out.println("Withdraw method");
		if (balance >= amt) {
			balance -= amt;
			
		} else {
			System.out.println("Insufficient balance, Cannot withdraw!!");
		}

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		
		String a="akash";
		System.out.println(a.matches("[a-c]{5}"));
		a=a.concat("hello");
		System.out.println(a);
		System.out.println(a.hashCode());

		try {
			System.out.println("Enter the amount to withdraw");
			String amt = sc.next();
			double amount = Double.parseDouble(amt);
			withdraw(amount);
		} catch (NumberFormatException ne) {
			ne.printStackTrace();
		}

		System.out.println("main method ended");
	}
}
