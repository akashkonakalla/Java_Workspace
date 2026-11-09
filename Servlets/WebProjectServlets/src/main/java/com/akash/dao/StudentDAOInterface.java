package com.akash.dao;

import com.akash.model.Login;
import com.akash.model.Student;

public interface StudentDAOInterface {

	public String insertStudent(Student s);

	public boolean checkUserExist(Login l);
}
