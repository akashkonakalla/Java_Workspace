package logical_statements;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);	
		System.out.println("enter marks");
		int m = sc.nextInt();
		if (m >100 && m<0 )
			System.out.println("wrong marks");
		else if (m >=91 && m<=100)
			System.out.println("A grade");
		else if (m >=81 && m<=90)
			System.out.println("B grade");
		else if (m >=71 && m<=80)
			System.out.println("C grade");
		else if (m >=61 && m<=70)
			System.out.println("D grade");
		else if (m >=51 && m<=60)
			System.out.println("E grade");
		else if (m >=35 && m<=50)
			System.out.println("E2 grade");
		else
			System.out.println("Fail");	
	}

}
