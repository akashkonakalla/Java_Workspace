package com.Methods.task_13_07_2026;
/*
  Today Task
Java
1.Problem Statement:
Write a Java program to create a method that displays the details of a bank account.
Requirements:
1.Create a class named BankAccount.
2.Create a method displayAccount() with no arguments and no return type.
3.Inside the method, display Account Number, Account Holder Name, Account 
4.Type, and Balance.
Call the method from the main() method.
 */



public class BankAccount {

	void displayAccount(){
		
		int accNum=1;
		String accName="Akash";
		String acc="savings";
		double balance=2000.4;
		System.out.println("Account Number : "+ accNum+ "Account Holder Name : "+accName+ "Account Type : " +acc+  "Balance : "+ balance);
		
		
	}
	
	
	public static void main(String[] args) {
//
//		byte a=10;
//		byte b=20;
//		byte c=(byte)(a+b);
//		System.out.println(c);
		
		BankAccount b=new BankAccount();
		b.displayAccount();
		
	}

}
