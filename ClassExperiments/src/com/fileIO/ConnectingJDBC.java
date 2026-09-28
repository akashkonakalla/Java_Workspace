package com.fileIO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.ResultSet;

public class ConnectingJDBC {
	public static void main(String[] args) {

//		1. Driver Initialization
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		Statement stm = null;

//		2. Connection
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dailytasks", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}

//		3.Statement
		try {
			stm = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}

//		4.ResultSet
		ResultSet rs = null;
		try {
			rs = stm.executeQuery("select*from emp");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			while (rs.next()) {
				System.out.println("id : " + rs.getInt(1) + "  name: " + rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
