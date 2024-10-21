package com.yash.onlineHomeDecor.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.onlineHomeDecor.dao.AdminDao;
import com.yash.onlineHomeDecor.domain.Admin;
import com.yash.onlineHomeDecor.util.DBUtil;

public class AdminDaoImpl implements AdminDao {

	@Override
	public boolean validateAdmin(String username, String password) throws ClassNotFoundException {
		try (Connection con = DBUtil.getConnection();
	             PreparedStatement ps = con.prepareStatement("select * from admins where username=? AND password=?")) {
	            ps.setString(1, username);
	            ps.setString(2, password);
	            ResultSet rs = ps.executeQuery();
	            return rs.next();
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    
	}

	@Override
	public boolean addAdmin(Admin admin) {
		String query="insert into admins(username,password,contactnumber,email) values(?,?,?,?)";
		try (Connection con = DBUtil.getConnection();
				PreparedStatement ps =con.prepareStatement(query)){
			ps.setString(1, admin.getUsername());
			ps.setString(2, admin.getPassword());
			ps.setString(3, admin.getContactNumber());
			ps.setString(4, admin.getEmail());
			int rowAffected=ps.executeUpdate();
			return rowAffected>0;
		}catch (Exception e) {
			e.printStackTrace();
		}
				
	             return false;
	}

	@Override
	public Admin getAdminByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	}


