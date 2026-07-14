package com.Methods.task_14_07_2026;


/*
Today Task
Java
Mobile Recharge
1.Write a Java program to demonstrate the following types of methods:
1.No Return Type + No Arguments
Create a method void showPlanDetails() to display the current recharge plan.

2.No Return Type + With Arguments
Create a method void recharge(double amount) to accept the recharge amount and display the successful recharge message.

Output for no arguments
Current Recharge Plan
Plan Name : Unlimited 299
Validity  : 28 Days
Data      : 1.5 GB/Day
Calls     : Unlimited

Output for argument
Recharge Successful!
Recharge Amount : ₹299.0

 **/

public class MobileRecharge {

	String planName="Unlimited 299";
	int validity= 28;
	String data="1.5 GB/Day";
	String calls="Unlimited";
	

	
	void showPlanDetails(){
		System.out.println("Plan Name : "+planName);
		System.out.println("Validity : "+validity);
		System.out.println("Data "+ data);
		System.out.println("Calls : "+calls);
	}
	
	void recharge(double amount) {
		System.out.println("Recharge Successful!");
		System.out.println("Recharge successful : "+amount);
		showPlanDetails();
	}
	
	void main(String[] args) {

		recharge(299);
		
	}

}
