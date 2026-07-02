package com.memory;

public class Pets {

	int petId=1;
	String petName="example";
	
	
	static int storeId= 444;
	static String storeName = "Ash store 444";
	
	public static void main(String[] args) {
		System.out.	println(" 		Welcome to Pet Store");
		
		Pets pt=new Pets();
		
		System.out.println(Pets.storeId);
		System.out.println(Pets.storeName);
		
		System.out.println(pt.petId);
		
		System.out.println(pt.petName);
		
	}

}
