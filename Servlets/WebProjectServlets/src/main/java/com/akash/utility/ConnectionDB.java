package com.akash.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

	static Connection con = null;

	public static Connection getConnection() throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

}
