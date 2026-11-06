package com.akash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.akash.model.Student;
import com.akash.utility.ConnectionDB;

public class StudentDAO implements StudentDAOInterface{

	
	@Override
	public String insertStudent(Student s) {
		
		Connection con = null;
		String status = "fail";
		try {
			con = ConnectionDB.getConnection();
			
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
			ps.setString(1, s.getFirstName());
			ps.setString(2, s.getLastName());
			ps.setString(3, s.getUsername());
			ps.setString(4, s.getPassword());
			
			int n = ps.executeUpdate();
			
			if(n>0) {
				status = "success";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return status;
		
	}

}
