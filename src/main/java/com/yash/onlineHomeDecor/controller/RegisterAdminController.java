package com.yash.onlineHomeDecor.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.onlineHomeDecor.domain.Admin;
import com.yash.onlineHomeDecor.service.AdminService;
import com.yash.onlineHomeDecor.serviceimpl.AdminServiceImpl;

@WebServlet("/registerAdmin")
public class RegisterAdminController extends HttpServlet {
	 private AdminService adminService;

	    @Override
	    public void init() {
	        adminService = new AdminServiceImpl();
	    }
	    
	    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	    	
	    	String username=req.getParameter("username");
	    	String password=req.getParameter("password");
	    	String confirmPassword=req.getParameter("confirmPassword");
	    	String contactNumber=req.getParameter("contactNumber");
	    	String email=req.getParameter("email");
	    	
	    	Admin admin=new Admin(username, password, confirmPassword, contactNumber, email);
	    	
	    	boolean isRegistered=adminService.registerAdmin(admin);
	    	
	    	 if (isRegistered) {
	    	        // Set success message in request attributes
	    	        req.setAttribute("successMessage", "Registration successful! Welcome, " + username);
	    	        RequestDispatcher dispatcher = req.getRequestDispatcher("views/admin.jsp");
	    	        dispatcher.forward(req, res);
	    	    } else {
	    	        // Redirect to admin page with an error message (optional)
	    	        req.setAttribute("errorMessage", "Registration failed! Please try again.");
	    	        RequestDispatcher dispatcher = req.getRequestDispatcher("views/admin.jsp");
	    	        dispatcher.forward(req, res);
	    	    }
	    }
}
