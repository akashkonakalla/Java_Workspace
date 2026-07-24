package com.constructors.task_23_07_2026;

import java.util.Scanner;

/*
 * Java Assignment – Parameterized Constructor
1.Hospital Patient Bill
Create a class Patient with the following data members:
Patient Name
Age
Room Charge Per Day
Number of Days Admitted
2.Initialize all the values using a parameterized constructor.
3.Create a method to calculate and display the 
4.Total Hospital Bill using the following formula:
Total Hospital Bill = Room Charge Per Day × Number of Days Admitted
5.Read the values using the Scanner class, create an object by passing the values to the parameterized constructor, and display all the patient details along with the total hospital bill.

Sample Input:
Enter Patient Name: Rahul
Enter Age: 35
Enter Room Charge Per Day: 2500
Enter Number of Days Admitted: 4

Expected Output:
Patient Name          : Rahul
Age                   : 35
Room Charge Per Day   : 2500.0
Days Admitted         : 4
Total Hospital Bill   : 10000.0
 */

public class Patient {

	String PatientName;
	int Age;
	double RoomChargePerDay;
	int NumberofDaysAdmitted;
	
	 Patient(String PatientName,
		int Age,
		double RoomChargePerDay,
		int NumberofDaysAdmitted) 
	 {
		this.Age=Age;
		this.NumberofDaysAdmitted=NumberofDaysAdmitted;
		this.PatientName=PatientName;
		this.RoomChargePerDay=RoomChargePerDay;
	}
	 
	 public Patient() {

	 }
	
	public static void main(String []args) {
	

		String PatientName;
		int Age;
		double RoomChargePerDay;
		int NumberofDaysAdmitted;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter patient name");
		PatientName=sc.nextLine();
		
		System.out.println("enter age");
		Age=sc.nextInt();
		System.out.println("enter room charge per day");
		RoomChargePerDay=sc.nextDouble();
		System.out.println("enter number of days");
		NumberofDaysAdmitted=sc.nextInt();
		Patient p1=new Patient(PatientName,Age,RoomChargePerDay,NumberofDaysAdmitted);
		p1.display();
				
	}
	
	void display() {
		System.out.println("Patient Name          : "+PatientName);
		System.out.println("Age                   : "+Age);
		System.out.println("Room Charge Per Day   : "+RoomChargePerDay);
		System.out.println("Days Admitted         : "+NumberofDaysAdmitted);
		System.out.println("Total Hospital Bill   : "+(RoomChargePerDay*NumberofDaysAdmitted));
		
	}
	

}
