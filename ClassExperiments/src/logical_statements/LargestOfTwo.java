package logical_statements;

import java.util.Scanner;

public class LargestOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("enter b number");
		int b = sc.nextInt();
		if (a == b)
			System.out.println("equal");
		else if (a < b)
			System.out.println("b is large");
		else
			System.out.println("a is large");
	}
}
