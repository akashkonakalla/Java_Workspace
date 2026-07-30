package logical_statements;

import java.util.Scanner;

public class ZeroCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		if (a == 0)
			System.out.println("NegativeNumber");
	}

}
