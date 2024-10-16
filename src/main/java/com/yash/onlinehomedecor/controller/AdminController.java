package com.yash.onlinehomedecor.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.onlinehomedecor.dao.AdminDAO;
import com.yash.onlinehomedecor.daoimpl.AdminDAOImpl;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/adminlogin")
public class AdminController extends HttpServlet {
	 private AdminDAO adminDAO;

	    @Override
	    public void init() {
	        adminDAO = new AdminDAOImpl();
	    }

	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	        String username = req.getParameter("username");
	        String password = req.getParameter("password");

	        try {
				if (adminDAO.validateAdmin(username, password)) {
				    HttpSession session = req.getSession();
				    session.setAttribute("username", username);
				    res.sendRedirect("adminHome.jsp");
				} else {
				    res.sendRedirect("error.jsp");
				}
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
}
