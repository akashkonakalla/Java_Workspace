package com.oops.BankAccountManagementSystem;

public interface AccountOperations {

    public abstract boolean deposit(double amount);

    public abstract boolean withdraw(double amount);

    public abstract double calculateInterest();

    public abstract boolean isAccountNumberValid();

    public abstract boolean isPhoneValid();
}