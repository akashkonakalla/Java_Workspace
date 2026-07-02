package com.garbage.collector.task25_06_2026;


/*Today Task
Java

Question: Garbage Collection Using Nullification

1.Problem Statement:
Write a Java program to demonstrate garbage collection using nullification.

Requirements:
1.Create a class named Employee.
2.Create an object of the Employee class.
3.Assign null to the object reference.
4.Invoke the garbage collector using System.gc().
5.Override the finalize() method to display a message when the object is garbage collected.

Expected Output:
Object is eligible for Garbage Collection
Garbage Collector Called

*/

public class Employee {

	@Override
	protected void finalize() {
		System.out.println("Object is destroyed ");
	}
	
	public static void main(String[] args) {
		
		System.out.println("WELCOME TO EMPLOYEE CLASS\n");
		Employee e1=new Employee();
		System.out.println("Address of the object 1 : "+ e1);
		System.out.println("Hashcode of the object e1 : " + e1.hashCode());
//		int a= e1.hashCode();
//		System.out.println("Value of a  : "+a);
		Employee e2 = new Employee();
		System.out.println("Address of the object 2 : "+e2);
		System.out.println("Hashcode of the object e2 : " + e2.hashCode());
		
		Employee e3 = new Employee();
		System.out.println("Address of the object 3 : "+e3);
		System.out.println("Hashcode of the object e3 : " + e3.hashCode());
		
		System.out.println("Nullfying the objects e1 and e2");
		e1=null;
		e2=null;
		System.out.println("Values of the e1 and e2 after nullfying");
		System.out.println("e1 : "+e1);
		System.out.println("e2 : "+e2);
		System.out.println("Calling the garbage collector System.gc() and checking finalize is calling or not");
		System.gc();
		
		
		
	}

}
