package com.oops.task_11_09_2026;

public abstract class Account {

	static void bankName() {
		System.out.println("Bank from static method");
	}
	
	void accountType() {
		System.out.println("General Account");
	}
	
	abstract void calculateInterest();
	
}
