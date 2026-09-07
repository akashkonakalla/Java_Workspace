package com.oops.task_07_09_2026;

public class BurgerOrder extends FoodOrder {
	
	@Override
	public void display() {
		System.out.println("Order ID : "+orderId);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Price : "+price);
	}
	
	public static void main(String[] args) {
		PizzasOrder p = new PizzasOrder();
		p.customerName="Burger";
		p.orderId=1;
		p.price=123;
		p.display();
	}
}
