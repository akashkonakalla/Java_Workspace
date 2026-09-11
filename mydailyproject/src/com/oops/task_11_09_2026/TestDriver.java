package com.oops.task_11_09_2026;

public class TestDriver {

	public static void main(String[] args) {

		// Static method - accessed using class name
        Account.bankName();

        // Concrete method - accessed using object
        SavingsAccount s = new SavingsAccount();
        s.accountType();

        // Abstract method - accessed using object
        s.calculateInterest();

        // Another subclass
        CurrentAccount c = new CurrentAccount();
        c.accountType();
        c.calculateInterest();
	}

}
