package Switch;

import java.util.Scanner;

public class SwichCalcWithReturnType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		double a = sc.nextDouble();
		System.out.println("enter the value of b");
		double b = sc.nextDouble();
		double res;

		System.out.println("enter the operation symbol: ");
		System.out.println(" 1. +\r\n" + " 2. -\r\n" + " 3. *\r\n" + " 4. /\r\n" + " 5. %");
		char op = sc.next().charAt(0);
		res = switch (op) {
		case '+' -> {
			yield a + b;

		}
		case '-' -> {
			yield a - b;
		}
		case '*' -> {
			yield a * b;
		}
		case '/' -> {
			yield a / b;
		}
		case '%' -> {
			yield a % b;

		}
		default -> {
			System.out.println("Invalid operator");
			yield 0;
		}
		};
		
		System.out.println("Resut of " + a + " " + op + " " + b + " is : " + res);

	}
}
