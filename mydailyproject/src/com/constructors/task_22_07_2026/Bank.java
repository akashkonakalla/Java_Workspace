package com.constructors.task_22_07_2026;

import java.util.Scanner;

public class Bank {

	String BankName;
	String Ifsc;
	String HolderName;
	long AccNumber;
	double balance;
	
	public Bank(String BankName,
	long AccNumber,String Ifsc,
	String HolderName,
	double balance)
	{
		this.AccNumber=AccNumber;
		this.balance=balance;
		this.BankName=BankName;
		this.HolderName=HolderName;
		this.Ifsc=Ifsc;
	}
	
	void display() {
		System.out.println("Bank Name : "+this.BankName);
		System.out.println("Account Number :"+ AccNumber);
		System.out.println("Ifsc Code : "+Ifsc);
		System.out.println("Holder Name : "+HolderName);
		System.out.println("Balance : "+balance);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter bank name");
		String BankName= sc.nextLine();
		System.out.println("enter account number");
		long AccNumber=sc.nextLong();
		sc.nextLine();
		System.out.println("enter ifsc code");
		String Ifsc=sc.nextLine();
		System.out.println("enter holder name");
		String HolderName=sc.nextLine();
		System.out.println("enter balance");
		double balance=sc.nextDouble();
		Bank b= new Bank(BankName,AccNumber,Ifsc,HolderName,balance);
		b.display();
		
		
		
	}

}
