package logical_statements;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("enter b number");
		int b = sc.nextInt();
		System.out.println("enter c number");
		int c = sc.nextInt();
		if (a == b && a == c)
			System.out.println("equal");

		else if (a < b && c < b)
			System.out.println("b is large");
		else if (a > b && a > c)
			System.out.println("a is large");
		else
			System.out.println("c is large");
	}

}
