package com.yash.onlineHomeDecor.dao;

import com.yash.onlineHomeDecor.domain.Admin;

public interface AdminDao {
	boolean validateAdmin(String username, String password) throws ClassNotFoundException;
	boolean addAdmin(Admin admin);
	Admin getAdminByUsername(String username);
}
