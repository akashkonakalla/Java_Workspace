package logical_statements;

import java.util.Scanner;

public class DivisibleBy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		if (a % 4 == 0)
			System.out.println("divisible by 4");

	}

}
