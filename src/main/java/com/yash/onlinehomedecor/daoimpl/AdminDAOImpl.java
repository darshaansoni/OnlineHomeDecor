package com.yash.onlinehomedecor.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.onlinehomedecor.dao.AdminDAO;
import com.yash.onlinehomedecor.util.DBUtil;

public class AdminDAOImpl implements AdminDAO {

	@Override
	public boolean validateAdmin(String username, String password) throws ClassNotFoundException {
		try (Connection con = DBUtil.getConnection();
	             PreparedStatement ps = con.prepareStatement("select * from admin where username=? AND password=?")) {
	            ps.setString(1, username);
	            ps.setString(2, password);
	            ResultSet rs = ps.executeQuery();
	            return rs.next();
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    
	}

}
