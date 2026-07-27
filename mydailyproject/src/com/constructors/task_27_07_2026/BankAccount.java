package com.constructors.task_27_07_2026;
/*
 * Java
Bank Account Management using Constructor Chaining
Create a class BankAccount with the following overloaded constructors:
BankAccount()
BankAccount( accountHolder)
BankAccount( accountHolder,  accountNumber)
BankAccount( accountHolder,  accountNumber,  balance)
Requirements
1.Use constructor chaining with this().
2.The final constructor should initialize all instance variables.
3.Create a display() method to print all account details.
In the main() method:
4.Create one object using the default constructor.
5.Create another object using the constructor with only the account holder's name.
6.Create another object using the constructor with name and account number.
7.Create the final object using all three values.
Display the details of all objects.

Sample Output
Account Holder : Unknown
Account Number : 0
Balance        : 0.0

Account Holder : Krishna
Account Number : 0
Balance        : 0.0

Account Holder : Krishna
Account Number : 1234567890
Balance        : 0.0

Account Holder : Krishna
Account Number : 1234567890
Balance        : 50000.0
 */

public class BankAccount {

	String accountHolder;
	long accountNumber;
	double balance;
	
	public BankAccount(String accountHolder, long accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	public BankAccount() {
		// TODO Auto-generated constructor stub
		this("Unknown",0,0);
		
		
	}
	
	
	

	public BankAccount(String accountHolder, long accountNumber) {
		this(accountHolder, accountNumber, 0);
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}


	public BankAccount(String accountHolder) {
		this(accountHolder, 0);
		this.accountHolder = accountHolder;
	}


	 static public void main(String[] args) {
		 
		 
		 BankAccount b=new BankAccount();
		 BankAccount b1=new BankAccount("Krishna");
		 BankAccount b2=new BankAccount("Krishna",1234567890);
		 BankAccount b3=new BankAccount("Krishna",1234567890,50000);
		 b.display();
		 b1.display();
		 b2.display();
		 b3.display();
	}


	 void display() {
		// TODO Auto-generated method stub\
		 System.out.println("Account Holder : "+accountHolder);
		 System.out.println("Account Number : "+ accountNumber);
		 System.out.println("Balance        : "+ balance +"\n");
		
	}

}
