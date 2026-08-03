package Switch;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a");
        double a=sc.nextDouble();
        System.out.println("enter value of b");
        double b=sc.nextDouble();
        
       System.out.println("enter the operation: ");
       System.out.println(" 1. Addition\r\n"+ " 2. Subtraction\r\n"	+ " 3. Multiplication\r\n"+ " 4. Division\r\n"
       		+ " 5. Modulus");
       int op = sc.nextInt();
       switch(op) {
       case 1 -> System.out.println("addition is : "+ (a+b));
       case 2 -> System.out.println("subtraction is : "+ (a-b));
       case 3 -> System.out.println("multiplication is : "+ (a*b));
       case 4 -> System.out.println("division is : "+ (a/b));
       case 5 -> System.out.println("modulus is : "+ (a%b));
       default -> System.out.println("invalid choice");
       }
	}
}
