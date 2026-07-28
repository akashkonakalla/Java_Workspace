package com.constructors.task_28_07_2026;

public class Swap {

	public Swap() {
		// TODO Auto-generated constructor stub
	}
	public Swap(int a,int b) {
		// TODO Auto-generated constructor stub
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("Swap value using xor ^");
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
	
	public static void main(String [] args) {
		Swap s=new Swap(10,5);
		int a=100;
		int b=200;
		s.swap(a,b);
		
	
		
	}
	private void swap(int a, int b) {
		System.out.println("____________________________");
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("Swap value using Arthematics");
		a=a+b;
		b=a-b;
		a=a-b;	
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		
		
		
	}
	

}
