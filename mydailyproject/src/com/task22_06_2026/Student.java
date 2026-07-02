package com.task22_06_2026;
// All the *instance* variables declared will be saved in heap memonry
public class Student {
	
	int stuId;
	String stuName;
	int age;
	String add;
	
	static String namee="Ash College";
	
	public static void main(String[]args) {
		
        System.out.println(Runtime.version());

		
		System.out.print("\t\t");
		System.out.println(namee+" Student Details\n");
		
		
		System.out.println("STUDENT 1 Details");
		Student s1=new Student();
		s1.stuId=1;
		s1.stuName="Akash";
		s1.age=21;
		s1.add="MIG-2-191, New HB Colony, Machilipatnam";
		
		System.out.println(s1.stuId);
		System.out.println(s1.stuName);
		System.out.println(s1.age);
		System.out.println(s1.add);
	    
		System.out.println("\nSTUDENT 2 Details");
		Student s2=new Student();
		s2.stuId=2;
		s2.stuName="Ash";
		s2.age=22;
		s2.add="Door no -12/450, Parasupet, Machilipatnam";
		
		System.out.println(s2.stuId);
		System.out.println(s2.stuName);
		System.out.println(s2.age);
		System.out.println(s2.add);
		}
}
