package com.akash.controller;

import java.io.IOException;

import com.akash.dao.StudentDAO;
import com.akash.model.Login;
import com.mysql.cj.Session;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
//			RequestDispatcher rd = request.getRequestDispatcher("afterLogin.jsp");
			

			HttpSession session = request.getSession(true);
			session.setAttribute("username",username);
			
			response.sendRedirect("afterLogin.jsp");

		} else {

//			System.out.println("false");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);

		}

	}

}
