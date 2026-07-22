package com.constructors.task_21_07_2026;

/*
 * Today Task
1.Product Details
Create a class Product with:
productId
productName
price
2.Use a parameterized constructor to initialize the fields.
3.Create at least 3 Product objects and display their details.
 */

public class Product{
	int productId;
	String productName;
	
	Product (){
		
	}
	
	Product (int id, String n ){
//
//		Product p=new Product();
//		System.out.println(p);
//		System.out.println(p.productId=id);
//		System.out.println(p.productName=n);
//
//		p.productId=id;
//		p.productName=n;
//		
		this.productId=id;
		this.productName=n;
		
		
	}
	
	
    public static void main(String[] args) {
		Product p1= new Product(1, "product 1");
		Product p2= new Product(2, "product 2");
		Product p3= new Product(3, "product 3");
		p1.show();
		p2.show();
		p3.show();
		
		
	}
    
    void show() {
    	System.out.println("Product id : "+ productId);
    	System.out.println("Product Name : "+ productName);
    	
    }
}

