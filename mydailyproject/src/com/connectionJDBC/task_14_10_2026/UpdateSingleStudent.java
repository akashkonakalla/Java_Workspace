package com.connectionJDBC.task_14_10_2026;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateSingleStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "root");

				PreparedStatement ps = con.prepareStatement("update student set name = ?, marks =? where id =?");

				System.out.println("Enter the id to update : ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the new name : ");
				String name = sc.nextLine();
				System.out.println("Enter the new marks : ");
				int marks = sc.nextInt();

				ps.setInt(3, id);
				ps.setString(1, name);
				ps.setInt(2, marks);

				int val = ps.executeUpdate();

				if (val > 0) {
					System.out.println(val + " row updated");
				} else {
					System.out.println("Something went wrong");
				}

				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}