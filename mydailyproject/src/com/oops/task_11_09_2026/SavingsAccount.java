package com.oops.task_11_09_2026;
/*
*Today's Assignment*

Java-
1.Create an abstract class Account with a static method, concrete method, and abstract method.
  Create two subclasses and determine which methods can be accessed using the class name and 
  which require an object.

PL/SQL-
1.Write a stored procedure that can calculate the sum of N natural numbers.
*/

public class SavingsAccount extends Account {

	@Override
	void calculateInterest() {
		// TODO Auto-generated method stub

		System.out.println("Savings Account Interest: 5%");
	}

}
