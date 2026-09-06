package com.oops.Polymorphism;

class Main {
	public static void main(String[] args) {
		System.out.println("Main method started\n");

		Animal a = new Animal();
		Animal a1 = new Cat();
		Animal a2 = new Dog();

		a.sound();
		a1.sound();
		a2.sound();

		System.out.println("\nMain method ended");

	}
}