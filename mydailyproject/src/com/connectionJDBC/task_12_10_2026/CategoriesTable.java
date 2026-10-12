package com.connectionJDBC.task_12_10_2026;

import java.sql.*;

public class CategoriesTable {

	public static void main(String[] args) {

		try {

			// 1. Loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "root");

			// 3. Statement
			Statement st = con.createStatement();

			// 4. execute Update
			int n = st.executeUpdate(
					"insert into categories values(1,'All electronics comes under this category','electronics')");

			if (n > 0) {
				System.out.println(n + "Rows affected");
			} else {
				System.out.println("Something went wrong");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
