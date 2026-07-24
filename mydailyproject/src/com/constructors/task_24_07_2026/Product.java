package com.constructors.task_24_07_2026;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

/*
 * Java
1.Product Billing
Create a class Product with overloaded 
2.constructors:
Product()
Product( productName)
Product( productName,  price)
Product( productName,  price,  quantity)
Requirement:
3.Use constructor chaining.
In the final constructor, calculate and display the Total Cost.

Sample Input
Enter Product Name: Laptop
Enter Price: 55000
Enter Quantity: 2

Expected Output
Product Name : Laptop
Price        : 55000.0
Quantity     : 2
Total Cost   : 110000.0

Mysql
1.Display the top 3 employees with the highest commission.
2.Display the 4th and 5th highest-paid employees.
 */

public class Product {

	String productName;
	double price;
	int quantity;
	double cost;
	
	public Product() {
		
		productName="unknown";
		price=0;
		quantity=0;
		
	}
	
	public Product(String productName, double price, int quantity) {
		this(productName,price);
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	    this.cost= quantity*price;
		
		
	}

	public Product(String productName, double price) {
		this(productName);
		this.productName = productName;
		this.price = price;
	}

	public Product(String productName) {
		this();
		this.productName = productName;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String productName;
		double price;
		int quantity;
		
		System.out.println("enter name of product");
		productName=sc.nextLine();
		System.out.println("enter the price");
		price=sc.nextDouble();
		System.out.println("enter the quantity");
		quantity=sc.nextInt();
		
		Product p=new Product(productName,price,quantity);
		p.display();
		
	}
	
	void display() {
		System.out.println("Product name : "+productName);
		System.out.println("Product price : "+price);
		System.out.println("Product quantity : "+quantity);
		System.out.println("Product cost : "+ cost);
		
	}
}
