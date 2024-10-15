package com.yash.dao;

import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.model.CartItem;
import com.yash.util.DbCon;

public class CartDaoImpl implements CartDao{
	DbCon dbCon=null;
	@Override
	public void addItem(CartItem item) {
		Connection con = null;
		
		// TODO Auto-generated method stub
		String query= "INSERT INTO CartItems(productName,quantity,price)VALUES(?,?,?)";
		try(Connection connection =dbCon.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)){
			ps.setString(1, item.getProductName());
			ps.setInt(2, item.getQuantity());
			ps.setDouble(3, item.getPrice());
			ps.setInt(4, item.getId());
			ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}


	@Override
	public void updateItem(CartItem item) {
		Connection con = null;
		// TODO Auto-generated method stub
		String query = "Update CartItems SET productName=? ,quantity = ? , price =? WHERE id =? ";
		try (Connection connection =dbCon.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)){
			  ps.setString(1, item.getProductName());
			  ps.setInt(2, item.getQuantity());
			  ps.setDouble(3,item.getPrice());
			  ps.setInt(4, item.getId());
			  ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteItem(int id) {
		Connection con =null;
		// TODO Auto-generated method stub
		String query = "DELETE FROM CartItems WHERE id =?";
		try(Connection connection =dbCon.getConnection();
				PreparedStatement ps=connection.prepareStatement(query)){
			ps.setInt(1, id);
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
				
		
		
	}

	@Override
	public CartItem getItem(int id) {
		// TODO Auto-generated method stub
		
		String query ="SELECT * FROM CartItems WHERE id =?";
		try(Connection connection =dbCon.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)){
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
	   	       return new CartItem(rs.getInt("id"),rs.getString("productName"),rs.getInt("quantity"),rs.getDouble("price"));
					
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
				
		return null;
	}

	@Override
	public List<CartItem> getAllItems() {
		// TODO Auto-generated method stub
		   List<CartItem> cartItems=new ArrayList<>();
		   String query =" SELECT * FROM CartItems";
		   try(Connection connection = dbCon.getConnection();
				Statement stmt =connection.createStatement();
				   ResultSet rs = stmt.executeQuery(query)){
			   while(rs.next()) {
				   cartItems.add (new CartItem(rs.getInt("id"),
						   rs.getString("productName"),
						    rs.getInt("quantiy"), rs.getDouble("price")));
			   }
		   }catch(SQLException e ) {
			   e.printStackTrace();
		   }
				
		return null;
	}

}
