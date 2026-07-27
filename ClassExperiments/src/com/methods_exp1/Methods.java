package com.methods_exp1;

public class Methods {

	{
		System.out.println("OBJECT CREATED");
	}
	static {
		System.out.println("static Block");
	}
	
	void main(String[] args) {
		System.out.println("main method started");
		Methods m= new Methods();
		
		m.firstname();
		m.lastname();
		age();
		city();
		dist();
		state();
		country();
		dob();
		indoorgame();
		out();
		profession();
		school();
		inter();
		btech();
		
		
	}
	
	void firstname() {
		System.out.println("Akash");
	}
	void lastname() {
		System.out.println("Konakalla");
	}
	
	void age() {
		System.out.println(22);
	}
	
	void city() {
		System.out.println("Machilipatnam");
		
	}
	
	void dist() {
		System.out.println("Krishna");
	}
	
	void state() {
		System.out.println("Andhra Pradesh");
	}
	
	void country() {
		System.out.println("India");
	}
	
	void dob() {
		System.out.println("24-08-2004");
	}
	
	void indoorgame() {
		System.out.println("chess");
	}
	
	void out() {
		System.out.println("running");
	}
	
	void profession() {
		System.out.println("Student");
	}
	
	void school() {
		System.out.println("stf");
		
	}
	
	void inter() {
		System.out.println("Star college");
	}
	
	void btech() {
		System.out.println("KLU");
	}
	 

}
