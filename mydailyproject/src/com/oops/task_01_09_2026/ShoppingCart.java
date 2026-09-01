package com.oops.task_01_09_2026;

/*
 * *Today's Assignment*
Java-
1.Create a Java class named ShoppingCart using Encapsulation.
Declare private variables cartItems and totalAmount.
Implement addItem(), removeItem(), and getTotal() methods.
Add and remove items by updating the cart details appropriately.
In the main() method, display the total amount after performing the operations.

Sql- 
1.Write a Stored procedure that expect empno as input and returns employee job , salary.
 */
public class ShoppingCart {

	private int cartItems;
	private double totalAmount;

	public int getCartItems() {
		return cartItems;
	}

	public void setCartItems(int cartItems) {
		this.cartItems = cartItems;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int addItem() {

		System.out.println("\nItem added Successfully!\n");
		return cartItems = cartItems + 1;
	}

	public int removeItem() {

		if (getCartItems() == 0) {
			System.out.println("\nCannot remove Item, Cart is empty\n");
			return 0;
		}

		System.out.println("\nItem removed Successfully!\n");
		return cartItems = getCartItems() - 1;

	}

	public double getTotal() {

		return getCartItems() * 2000;
	}
}
