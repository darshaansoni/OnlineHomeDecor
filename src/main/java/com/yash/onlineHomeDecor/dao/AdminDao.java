package com.yash.onlineHomeDecor.dao;

public interface AdminDao {
	boolean validateAdmin(String username, String password) throws ClassNotFoundException;
}
