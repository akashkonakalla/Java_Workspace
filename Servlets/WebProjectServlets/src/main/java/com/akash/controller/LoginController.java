package com.akash.controller;

import java.io.IOException;

import com.akash.dao.StudentDAO;
import com.akash.model.Login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		Login l = new Login();
		l.setUsername(username);
		l.setPassword(password);

		StudentDAO st = new StudentDAO();
		if (st.checkUserExist(l)) {

//			System.out.println("entered true ");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);

		} else {

//			System.out.println("false");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.forward(request, response);

		}

	}

}
