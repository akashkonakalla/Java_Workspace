package com.abstractMethods;





class Student {
	

    int id;
    String name;

    
}

public class Constructor_ex {
    public static void main(String[] args) {

        Student s2= student();

        System.out.println(s2.id);
    }
    
    
    
    static Student student() {
    	Student s1 = new Student();
    	      
        s1.id = 101;
        s1.name = "Akash";
        
        return s1;
    }
    
}