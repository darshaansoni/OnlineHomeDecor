package com.yash.onlineHomeDecor.serviceimpl;

import com.yash.onlineHomeDecor.dao.AdminDao;
import com.yash.onlineHomeDecor.daoimpl.AdminDaoImpl;
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
	

		   

}
