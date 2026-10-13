package com.connectionJDBC.task_13_10_2026;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert_5_Students {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "root");

				PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");

				System.out.println("Enter the number of students you want to insert");
				int n = sc.nextInt();

				for (int i = 1; i <= n; i++) {
				
					System.out.println("Enter the id : ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the name : ");
					String name = sc.nextLine();

					ps.setInt(1, id);
					ps.setString(2, name);
					
					int val = ps.executeUpdate();

					if (val > 0) {
						System.out.println(val + " rows affected");
					} else {
						System.out.println("Something went wrong");
					}
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
