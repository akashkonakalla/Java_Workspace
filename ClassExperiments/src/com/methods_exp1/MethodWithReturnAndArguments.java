package com.methods_exp1;

import java.util.Scanner;
import java.lang.reflect.Method;

public class MethodWithReturnAndArguments {
	
	static Scanner sc = new Scanner(System.in);
	
	int add(int a, int b) {
		return a+b;
	}
	
	int sub(int a, int b) {
		
		return a-b;
		
	}
	
	int mul(int a , int b) {
		
		return a*b;
	}
	
	int div(int a , int b) {
		return a/b;
	}
	
	int sq(int a ) {
		return a*a ;
	}
	
	int cube (int a) {
		return a*a*a;
	}
	
	int max(int a, int b) {
		return Math.max(a, b);
	}
	
	int min(int a ,int b) {
		return Math.min(a, b);
	}
	
	int factorial(int a) {
		if (a==0 || a==1)
			return 1;
		else 
			return factorial(a-1)*a;
		
	}
	
	int fibonacci(int a ) {
		
		if (a<=1)
			return a;
		return fibonacci(a-1)+fibonacci (a-2);
		
	}
	
	int count(int a) {
		  if (a == 0)
		        return 1;

		    int c = 0;
		    a = Math.abs(a);

		    while (a > 0) {
		        a /= 10;
		        c++;
		    }

		    return c;
	}
	
	
	int rev(int a) {
		int rev=0;
		while(a>0) {
			int rem = a%10;
			rev= rev*10  + rem;
			rem/=10;
		}
		return rev;
	}
	
	int remainder(int a, int b) {
	    return a % b;
	}

	int square(int n) {
	    return n * n;
	}

	int cube1(int n) {
	    return n * n * n;
	}

	int max1(int a, int b) {
	    return a > b ? a : b;
	}

	int min1(int a, int b) {
	    return a < b ? a : b;
	}

	int increment(int n) {
	    return ++n;
	}

	int decrement(int n) {
	    return --n;
	}

	int doubleValue(int n) {
	    return n * 2;
	}

	int tripleValue(int n) {
	    return n * 3;
	}

	int half(int n) {
	    return n / 2;
	}

	int sumThree(int a, int b, int c) {
	    return a + b + c;
	}

	// Double Methods
	double areaCircle(double r) {
	    return 3.14 * r * r;
	}

	double areaRectangle(double l, double b) {
	    return l * b;
	}

	double areaTriangle(double b, double h) {
	    return 0.5 * b * h;
	}

	double simpleInterest(double p, double r, double t) {
	    return (p * r * t) / 100;
	}

	double average(int a, int b) {
	    return (a + b) / 2.0;
	}

	double celsiusToFahrenheit(double c) {
	    return (c * 9 / 5) + 32;
	}

	double fahrenheitToCelsius(double f) {
	    return (f - 32) * 5 / 9;
	}

	double percentage(int total, int marks) {
	    return (marks * 100.0) / total;
	}

	double bmi(double weight, double height) {
	    return weight / (height * height);
	}

	double discount(double price, double percent) {
	    return price - (price * percent / 100);
	}

	// Boolean Methods
	boolean isEven(int n) {
	    return n % 2 == 0;
	}

	boolean isOdd(int n) {
	    return n % 2 != 0;
	}

	boolean isPositive(int n) {
	    return n > 0;
	}

	boolean isNegative(int n) {
	    return n < 0;
	}

	boolean isZero(int n) {
	    return n == 0;
	}

	boolean isGreater(int a, int b) {
	    return a > b;
	}

	boolean isEqual(int a, int b) {
	    return a == b;
	}

	boolean canVote(int age) {
	    return age >= 18;
	}

	boolean isUpperCase(char ch) {
	    return Character.isUpperCase(ch);
	}

	boolean isLowerCase(char ch) {
	    return Character.isLowerCase(ch);
	}

	// Character Methods
	char toUpper(char ch) {
	    return Character.toUpperCase(ch);
	}

	char toLower(char ch) {
	    return Character.toLowerCase(ch);
	}

	char nextChar(char ch) {
	    return (char)(ch + 1);
	}

	char previousChar(char ch) {
	    return (char)(ch - 1);
	}

	char firstChar(String s) {
	    return s.charAt(0);
	}

	// String Methods
	String fullName(String first, String last) {
	    return first + " " + last;
	}

	String greet(String name) {
	    return "Hello " + name;
	}

	String college(String name) {
	    return "College: " + name;
	}

	String branch(String branch) {
	    return "Branch: " + branch;
	}

	String city(String city) {
	    return "City: " + city;
	}

	String state(String state) {
	    return "State: " + state;
	}

	String country(String country) {
	    return "Country: " + country;
	}

	String email(String email) {
	    return email;
	}

	String mobile(String mobile) {
	    return mobile;
	}

	String reverse(String s) {
	    return new StringBuilder(s).reverse().toString();
	}

	String upper(String s) {
	    return s.toUpperCase();
	}

	String lower(String s) {
	    return s.toLowerCase();
	}

	String concat(String a, String b) {
	    return a + b;
	}

	String repeat(String s) {
	    return s + s;
	}

	String message(String msg) {
	    return "Message: " + msg;
	}

	// Long Methods
	long addLong(long a, long b) {
	    return a + b;
	}

	long multiplyLong(long a, long b) {
	    return a * b;
	}

	long secondsToMinutes(long sec) {
	    return sec / 60;
	}

	// Float Methods
	float averageMarks(float a, float b) {
	    return (a + b) / 2;
	}

	float multiplyFloat(float a, float b) {
	    return a * b;
	}

	// Byte Methods
	byte addByte(byte a, byte b) {
	    return (byte)(a + b);
	}

	// Short Methods
	short addShort(short a, short b) {
	    return (short)(a + b);
	}

	// Mixed Methods
	String result(String name, int marks) {
	    return name + " scored " + marks;
	}

	boolean login(String username, String password) {
	    return username.equals("admin") && password.equals("1234");
	}

	int stringLength(String s) {
	    return s.length();
	}

	char lastChar(String s) {
	    return s.charAt(s.length() - 1);
	}

	double power(double a) {
	    return a * a;
	}
	
	 void main() {
		
		 System.out.println("main method started");
		 
		 System.out.println("Enter a and b");
		 int a=sc.nextInt();
		 int b =sc.nextInt();
		
		 System.out.println("addition "+add(a,b)); 
		 
		 System.out.println("sub "+sub(a,b)); 
		 
		 System.out.println("div "+div(a,b)); 
		 
		 System.out.println("mul "+mul(a,b)); 
		 
		 System.out.println("area of the square : "+sq(a)); 
		 
		 System.out.println("area of the cube : "+cube (a)); 
		 
		 System.out.println(" max : "+ max(a,b)); 
		 
		 System.out.println(" min : "+ min(a,b)); 
		 
		 System.out.println("facto is : "+ factorial(a));
		 
		 System.out.println("fibo is : "+ fibonacci(a));
		 
		 System.out.println("Count is  : "+ count(a));    
		 
		 MethodWithReturnAndArguments m= new MethodWithReturnAndArguments();
		 
		 System.out.println("Remainder: " + m.remainder(10, 3));
		    
		 System.out.println("Square: " + m.square(5));
		    
		 System.out.println("Cube: " + m.cube1(4));
		   
		 System.out.println("Maximum: " + m.max1(20, 15));
		    
		 System.out.println("Minimum: " + m.min1(20, 15));
		 
		 System.out.println("Increment: " + m.increment(10));
		 
		 System.out.println("Decrement: " + m.decrement(10));
		 
		 System.out.println("Double Value: " + m.doubleValue(8));
		 
		 System.out.println("Triple Value: " + m.tripleValue(8));
		 
		 System.out.println("Half: " + m.half(20));
		 
		 System.out.println("Sum of Three: " + m.sumThree(10, 20, 30));

		 
		 
		 // double Methods
		 
		 System.out.println("Area of Circle: " + m.areaCircle(5));
		 
		 System.out.println("Area of Rectangle: " + m.areaRectangle(10, 20));
		 
		 System.out.println("Area of Triangle: " + m.areaTriangle(10, 5));
		    
		 System.out.println("Simple Interest: " + m.simpleInterest(10000, 5, 2));
		 
		 
		 
		 System.out.println("Average: " + m.average(10, 20));
		 
		 System.out.println("Celsius to Fahrenheit: " + m.celsiusToFahrenheit(25));
		 
		 System.out.println("Fahrenheit to Celsius: " + m.fahrenheitToCelsius(98.6));
		 
		 System.out.println("Percentage: " + m.percentage(600, 540));
		 
		 System.out.println("BMI: " + m.bmi(70, 1.75));
		 
		 System.out.println("Discount Price: " + m.discount(1000, 10));

		 
		 
		 // boolean Methods
		 
		 System.out.println("Is Even: " + m.isEven(10));
		 
		 System.out.println("Is Odd: " + m.isOdd(11));
		 
		 System.out.println("Is Positive: " + m.isPositive(5));
		 
		 System.out.println("Is Negative: " + m.isNegative(-5));
		 
		 System.out.println("Is Zero: " + m.isZero(0));
		 
		 System.out.println("Is Greater: " + m.isGreater(10, 5));
		 
		 System.out.println("Is Equal: " + m.isEqual(10, 10));
		 
		 System.out.println("Can Vote: " + m.canVote(21));
		 
		 System.out.println("Is Upper Case: " + m.isUpperCase('A'));
		 
		 System.out.println("Is Lower Case: " + m.isLowerCase('z'));

		 
		 
		 // char Methods
		 
		 System.out.println("Upper Case: " + m.toUpper('a'));
		 
		 System.out.println("Lower Case: " + m.toLower('A'));
		 
		 System.out.println("Next Character: " + m.nextChar('A'));
		    
		 System.out.println("Previous Character: " + m.previousChar('B'));
		 
		 
		 System.out.println("First Character: " + m.firstChar("Akash"));

		 
		 
		 // String Methods
		 
		 System.out.println("Full Name: " + m.fullName("Akash", "Konakalla"));
		 
		 System.out.println(m.greet("Akash"));
		 
		 System.out.println(m.college("KL University"));
		 
		 System.out.println(m.branch("CSE"));
		 
		 System.out.println(m.city("Visakhapatnam"));
		 
		 System.out.println(m.state("Andhra Pradesh"));
		 
		 System.out.println(m.country("India"));
		 
		 System.out.println("Email: " + m.email("akash@gmail.com"));
		 
		 System.out.println("Mobile: " + m.mobile("9876543210"));
		 
		 System.out.println("Reverse: " + m.reverse("Java"));
		 
		 System.out.println("Upper: " + m.upper("java"));
		 
		 System.out.println("Lower: " + m.lower("JAVA"));
		 
		 System.out.println("Concat: " + m.concat("Hello ", "World"));
		 
		 System.out.println("Repeat: " + m.repeat("Hi "));
		 
		 System.out.println(m.message("Welcome to Java"));

		 
		 
		 // long Methods
		 
		 System.out.println("Long Addition: " + m.addLong(100000L, 200000L));
		 
		 System.out.println("Long Multiplication: " + m.multiplyLong(1000L, 2000L));
		 
		 System.out.println("Seconds to Minutes: " + m.secondsToMinutes(180));

		 
		 
		 // float Methods
		 
		 System.out.println("Average Marks: " + m.averageMarks(85.5f, 90.5f));
		 
		 System.out.println("Float Multiplication: " + m.multiplyFloat(5.5f, 2.0f));

		 
		 
		 // byte Method
		 
		 System.out.println("Byte Addition: " + m.addByte((byte)10, (byte)20));

		 
		 
		 // short Method
		 
		 System.out.println("Short Addition: " + m.addShort((short)100, (short)200));

		 
		 
		 // Mixed Methods
		 
		 System.out.println(m.result("Akash", 95));
		 
		 System.out.println("Login Successful: " + m.login("admin", "1234"));
		 
		 System.out.println("String Length: " + m.stringLength("Programming"));
		 
		 System.out.println("Last Character: " + m.lastChar("Java"));
		 
		 System.out.println("Power: " + m.power(5));
		 
		 
//		System.out.println((int)'A'+ ""+'b');
		 Method[] methods = MethodWithReturnAndArguments.class.getDeclaredMethods();
	        System.out.println("Number of methods: " + methods.length);
		 System.out.println("main method ended");
		
	}

}
