package logical_statements;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks");
		int a = sc.nextInt();

		if (a >= 35)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}
