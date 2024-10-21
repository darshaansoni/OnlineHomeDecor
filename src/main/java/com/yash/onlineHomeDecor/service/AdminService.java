package com.yash.onlineHomeDecor.service;

import com.yash.onlineHomeDecor.domain.Admin;

public interface AdminService {
	boolean validateAdmin(String username, String password) throws ClassNotFoundException;
	
	boolean registerAdmin(Admin admin);
	Admin authenticateAdmin(String username, String password);
}
