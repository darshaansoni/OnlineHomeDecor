package com.yash.onlineHomeDecor.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.onlineHomeDecor.service.AdminService;
import com.yash.onlineHomeDecor.serviceimpl.AdminServiceImpl;

@WebServlet("/adminlogin")
public class AdminController extends HttpServlet {

	private AdminService adminService;

	@Override
	public void init() {
		adminService = new AdminServiceImpl();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		try {
			if (adminService.validateAdmin(username, password)) {
				HttpSession session = req.getSession();
				session.setAttribute("username", username);
				
				
				res.sendRedirect("views/adminhome.jsp?message=Login successful!! Welcome to Admin Dashbord, " + username);
			} else {
				
				req.setAttribute("errorMessage", "Login failed! Invalid username or password.");
				
				req.getRequestDispatcher("views/admin.jsp").forward(req, res);

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
			req.setAttribute("errorMessage", "An error occurred while processing your request.");
		req.getRequestDispatcher("views/admin.jsp").forward(req, res);
		}
	}
}
