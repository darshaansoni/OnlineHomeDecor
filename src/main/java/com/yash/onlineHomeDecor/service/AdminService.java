package com.yash.onlineHomeDecor.service;

public interface AdminService {
	boolean validateAdmin(String username, String password) throws ClassNotFoundException;
}
