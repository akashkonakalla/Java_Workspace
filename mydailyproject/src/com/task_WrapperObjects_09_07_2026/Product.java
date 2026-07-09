package com.task_WrapperObjects_09_07_2026;

/*
Today Task
Java Assignment 
Question:
1.Write a Java program to store the following product details using appropriate wrapper object types:
Product ID
Product Name
Product Price
Product Rating
Product Available Status
Stock Quantity
Discount Percentage
Product Code
Requirements:
1.Print all the product details in a clear and readable format.
2.Use wrapper object types for all applicable variables.
3.Assign suitable values to each variable.
4.Display the details using System.out.println().

Mysql
Company and Projects
Create two tables:
1.Company
Company ID
Company Name
Location
2.Project
Project ID
Project Name
Budget
Company ID

Requirements:
1.Use appropriate Primary Keys.
2.Create a Foreign Key with ON DELETE CASCADE.
3.Insert 5 records into each table.
4.Delete one company.
Display both tables to observe the cascading delete.

*/

public class Product {
	static Integer ProductID;
	String ProductName;
	Double ProductPrice;
	Double ProductRating;
	Boolean ProductAvailableStatus;
	Integer StockQuantity;
	Float DiscountPercentage;
	Integer ProductCode;
	public static void main(String[] args) {
		Product p=new Product();
		ProductID=12;
		
		p.ProductName="Akash";
		p.ProductPrice=240.7;
		p.ProductRating= (double)4.8;
		p.ProductAvailableStatus=true;
		p.StockQuantity=10;
		p.DiscountPercentage=14.5f;
		p.ProductCode=123;
		
		
		//accessing using class name and static variable.
		System.out.println("ProductID : "+ Product.ProductID);
		System.out.println("ProductName : "+p.ProductName);
		System.out.println("ProductPrice : "+p.ProductPrice);
		System.out.println("ProductRating : "+p.ProductRating);
		System.out.println("ProductAvailableStatus : "+p.ProductAvailableStatus);
		System.out.println("StockQuantity : "+p.StockQuantity);
		System.out.println("DiscountPercentage : "+p.DiscountPercentage);
		System.out.println("ProductCode : "+p.ProductCode);
	}

}
