package com.yash.onlinehomedecor.dao;

public interface AdminDAO {
	boolean validateAdmin(String username, String password) throws ClassNotFoundException;
}
