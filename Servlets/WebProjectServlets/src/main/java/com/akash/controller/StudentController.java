package com.akash.controller;

import java.io.IOException;

import com.akash.dao.StudentDAO;
import com.akash.model.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentController() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		response.getWriter().print("STUDENT CONTROLLER CALLED");

		String first = request.getParameter("first");
		String last = request.getParameter("last");
		String username = request.getParameter("username");
		String pass = request.getParameter("password");

		Student s = new Student();
		s.setFirstName(first);
		s.setLastName(last);
		s.setUsername(username);
		s.setPassword(pass);

		StudentDAO st = new StudentDAO();

		if (st.insertStudent(s).equals("success")) {
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}

	}

}
