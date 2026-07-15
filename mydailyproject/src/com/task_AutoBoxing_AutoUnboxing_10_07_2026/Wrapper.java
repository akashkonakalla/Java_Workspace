package com.task_AutoBoxing_AutoUnboxing_10_07_2026;

/*Java - Wrapper Objects
1.Create a program to convert a primitive int into an Integer object (Autoboxing) and print both values.
2.Create a program to convert an Integer object into a primitive int (Unboxing) and display the result.
3.Write a program to accept a numeric String and convert it into:
int
double
float using wrapper class methods. 

*MySQL*:-
1.Create Franchise table using columns ( franchise_id , franchise_name , city , active ) if doesnot exists then complete below requirements

1. insert 5 records, create a SAVEPOINT named sp1,
2. update the city of a franchise, create another SAVEPOINT named sp2,
3. insert a new franchise record, create SAVEPOINT sp3, 
4. delete a franchise record, roll back to sp3, 
5. update the franchise name, roll back to sp2, 

insert another franchise record, COMMIT the transaction, then attempt to ROLLBACK and finally display all the records from the franchise table
*/

public class Wrapper {

	Integer a1=1;
	Integer a2=2;
	int i1=4;
	String s="1234";
	public static void main(String[] args) {
		
		Wrapper w=new Wrapper();
		//Auto Unboxing converts Wrapper data types to primitive
		
		int a= w.a1;
		System.out.println(a);
		int a2=2;
		System.out.println(a2);
		
		// Auto Boxing converts primitive to wrapper object
		w.a1=a2;
		System.out.println(w.a1);
		
		//String to int
		int s=Integer.parseInt(w.s);
		System.out.println(Integer.parseInt(w.s)+1);
		System.out.println(s+10);
		//String to double
		
		
		System.out.println(Double.parseDouble(w.s));
		
		// String to float
		System.out.println(Float.parseFloat(w.s));
		
	}

}
