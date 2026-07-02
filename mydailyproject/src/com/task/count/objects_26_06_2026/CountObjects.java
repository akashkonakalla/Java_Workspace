package com.task.count.objects_26_06_2026;

//COUNT OBJECTS

public class CountObjects {
	
	//Static Block count
	static int count=0;
	{
		count++;
	}
	
	
	
	
//	int c=0;
//	//Instance block count
//	{
//		c++;
//		System.out.println("Value of c: "+c);
//		System.out.println("Instance block");
//		
//	}
	
	static {
		System.out.println("HELLO STATIC");
		CountObjects c1=new CountObjects();
	}
	
	public static void main(String[] args) {
		
		CountObjects c1=new CountObjects();
		CountObjects c2=new CountObjects();
		System.out.println("Number of objects : "+count);
//		System.out.println("Number of objects : "+c2.c);
		c1=null;
		c2=null;
	    System.gc();
}

}
