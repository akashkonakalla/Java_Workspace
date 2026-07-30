package logical_statements;

import java.util.Scanner;

public class DivisibleBy3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		
		if (a%3 ==0 && a%5==0)
			System.out.println("divisible by 3 and 5");
		else System.out.println("not divisible by 3 and 5");


	}

}
