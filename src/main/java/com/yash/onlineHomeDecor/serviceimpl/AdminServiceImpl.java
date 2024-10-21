package com.yash.onlineHomeDecor.serviceimpl;

import com.yash.onlineHomeDecor.dao.AdminDao;
import com.yash.onlineHomeDecor.daoimpl.AdminDaoImpl;
import com.yash.onlineHomeDecor.domain.Admin;
import com.yash.onlineHomeDecor.service.AdminService;

public class AdminServiceImpl implements AdminService{
	 private AdminDao adminDao;
	
	public AdminServiceImpl() {
        this.adminDao = (AdminDao) new AdminDaoImpl();
    }

	@Override
	public boolean validateAdmin(String username, String password) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return adminDao.validateAdmin(username, password);
	}

	@Override
	public boolean registerAdmin(Admin admin) {
		if(admin.getPassword().equals(admin.getConfirmPassword())) {
			return adminDao.addAdmin(admin);
		}
		return false;
	}

	@Override
	public Admin authenticateAdmin(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	

		   

}
