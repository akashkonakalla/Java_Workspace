package com.oops.task_07_09_2026;
/*
 * *Today's Assignment*

*Java*-

1.Create an interface FoodOrder with prepareFood(). Create a base class OrderDetails with orderId, customerName, price, and displayDetails(). Create PizzaOrder and BurgerOrder classes that extend OrderDetails and implement FoodOrder. Override prepareFood() in both classes and demonstrate runtime polymorphism in main().

*PL/SQL-*

1. Write a Stored procedure that accept empno as input 

 > fetch the Sal of emp with that empno  
 > if the salary is 0-2000 show the message as Low salary 
 > if the salary is 2001-9999
 Show the message as Good salary
 */
public class FoodOrder {
	int orderId;
	String customerName;
	double price;
	
	public void display() {
		System.out.println("Order ID : "+orderId);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Price : "+price);
	}
}
