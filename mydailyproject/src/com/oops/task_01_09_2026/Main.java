package com.oops.task_01_09_2026;

import java.util.Scanner;

public class Main extends ShoppingCart {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		boolean exit = true;
		do {
			System.out.println("Enter\n1.ADD ITEM \n2.REMOVE ITEM \n3.CURRENT CART ITEMS & VALUE \n4.EXIT\n");
			int n = sc.nextInt();
			switch (n) {
			case 1: {
				m.addItem();
				break;
			}
			case 2: {
				m.removeItem();
				break;
			}
			case 3: {
				System.out.println("\nThe current cart items is : " + m.getCartItems());
				System.out.println("The current value is : " + m.getTotal() + "\n");
				break;
			}
			case 4: {
				System.out.println("\nThank you for shopping with us!, visit again\n");
				exit = false;
				break;
			}
			default:
				System.out.println("\nInvalid choice ! enter the correct choice\n");
			}
		} while (exit);

		System.out.println("The Cart Items : " + m.getCartItems());
		System.out.println("The Total Amount : " + m.getTotal());

	}
}
